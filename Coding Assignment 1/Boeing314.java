public class Boeing314 extends FlyingBoat  {

    public Boeing314 ()  {
	super();
    }

    public Boeing314 (String dest)  {
	this.destination = dest;
    }
    
    @Override
    public void waterTaxi ()  {
	if (this.height == 0 && !this.buoyant)  {
	    System.out.println("Boeing 314 sunk!");
	    this.height = -40;
	}
    }
    
    @Override
    public int compareTo (FlyingBoat b)  {
        return this.height - b.height; 
    }

    public String toString ()  {
        return "Boeing 314 at " + height + " meters above sea level, headed for " + destination;
    }

    public boolean equals (Boeing314 b)  {
	return this.destination == b.destination;
    }

    
}
