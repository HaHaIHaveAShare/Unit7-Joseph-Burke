public class FlyingBoat extends Plane implements Comparable <FlyingBoat> {
    protected boolean buoyant;

    public FlyingBoat ()  {
	super ();
	this.buoyant = true;
    }
    
    public boolean getBuoyant() {
	return buoyant;
    }

    public void setBuoyant(boolean buoyant) {
	this.buoyant = buoyant;
    }

    @Override
    public void landPlane ()  {
	if (this.buoyant)  {
	    this.height = 0;
	    System.out.println ("Floating at: " + destination);
	}
    }

    public void waterTaxi ()  {
	if (this.height == 0 && !this.buoyant)  {
	    System.out.println("Flying Boat sunk!");
	    this.height = -40;
	}
    }

    public int compareTo (FlyingBoat b)  {
        return this.height - b.height; 
    }

    public String toString ()  {
        return "Flying Boat at " + height + " meters above sea level, headed for " + destination;
    }

    public boolean equals (FlyingBoat b)  {
	return this.destination == b.destination;
    }

}
