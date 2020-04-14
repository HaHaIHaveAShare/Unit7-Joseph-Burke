public class InheritanceTest {
    public static void main(String[] args) {
	Plane airForceOne = new Plane ();
	FlyingBoat spruceGoose = new FlyingBoat ();
	Boeing314 californiaClipper = new Boeing314 ();

	airForceOne.setDestination("JFK Airport");
        spruceGoose.setDestination("France");
	californiaClipper.setDestination("Hawaii");

	System.out.println(airForceOne);
	System.out.println(spruceGoose);
	System.out.println(californiaClipper);

	airForceOne.takeOff();
	spruceGoose.takeOff();
	californiaClipper.takeOff();

	System.out.println(airForceOne);
	System.out.println(spruceGoose);
	System.out.println(californiaClipper);

	airForceOne.landPlane();
	spruceGoose.landPlane();
	californiaClipper.landPlane();

	System.out.println(airForceOne);
	System.out.println(spruceGoose);
	System.out.println(californiaClipper);

	spruceGoose.setBuoyant(false);

	spruceGoose.waterTaxi();
	californiaClipper.waterTaxi();

	System.out.println(spruceGoose);
	System.out.println(californiaClipper);
    }
}
