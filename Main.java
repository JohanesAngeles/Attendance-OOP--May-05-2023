
public class Main {
	
	public static void main(String[] args) {
		
		// Create a U-2 Spy Plane object
        U2SpyPlane u2SpyPlane = new U2SpyPlane("U-2", "gray",1960,4,2,103.0);

        // Accessing inherited properties and methods
        System.out.println("Model: " + u2SpyPlane.getModel());
        System.out.println("Color: " + u2SpyPlane.getcolor());
        System.out.println("Year: " + u2SpyPlane.getYear());
        System.out.println("Flight Attendant: " + u2SpyPlane.getFA());
        System.out.println("Pilot: " + u2SpyPlane.getPilot());
        System.out.println("Wingspan: " + u2SpyPlane.getWingspan());

        // Calling overridden method
        u2SpyPlane.fly();
    }
}

