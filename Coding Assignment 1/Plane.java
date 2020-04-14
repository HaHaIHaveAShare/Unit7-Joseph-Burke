public class Plane  {
    protected int height; // Meters above sea level
    protected String destination;

    public Plane () {
	this.height = 0;
	this.destination = "PDX Airport";
    }
    
    public int getHeight ()  {
	return height;
    }

    public void setHeight (int height)  {
	this.height = height;
    }

    public String getDestination ()  {
	return destination;
    }

    public void setDestination (String destination)  {
	this.destination = destination;
    }
    
    public void landPlane ()  {
	this.height = 0;
	System.out.println ("Landed at: " + destination);
    }

    public void takeOff ()  {
	this.height = 9144;
	System.out.println ("We're in the air!");
    }

    public String toString()  {
	return "Airplane at " + height + " meters above sea level, headed for " + destination;
    }

}
