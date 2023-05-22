public class Plane {
    private String model, color;
    private int year;
	protected int FA;
	private int Pilot;

    // Constructor
    public Plane(String model,String color, int year, int FA, int Pilot) {
        this.color = color;
    	this.model = model;
        this.year = year;
        this.FA = FA;
        this.Pilot = Pilot;
    }

    // Getters
    public String getModel() {
        return model;
    }
    
    public String getcolor() {
        return color;
    }

    public int getYear() {
        return year;
    }
    public int getFA() {
        return FA;
    }
    public int getPilot() {
        return Pilot;
    }

    // Method
    public void fly() {
        System.out.println("The plane is flying.");
    }
}