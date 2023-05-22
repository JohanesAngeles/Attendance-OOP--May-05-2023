
class U2SpyPlane extends Plane {
    private double wingspan;

    // Constructor
    public U2SpyPlane(String model, String color, int year, int FA, int Pilot, double wingspan) {
        super(model, color,year,FA,Pilot);
        this.wingspan = wingspan;
    }

    // Method overriding
    @Override
    public void fly() {
        System.out.println("\n" + "The U-2 Spy Plane is conducting a reconnaissance mission.");
    }

    // Getter
    public double getWingspan() {
        return wingspan;
    }
}
