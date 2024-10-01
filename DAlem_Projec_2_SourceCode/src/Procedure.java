public class Procedure {
    private String name;
    private String date;
    private String practitioner;
    private double charges;
  
    // No-argument constructor
    public Procedure() {
        this.name = "";
        this.date = "";
        this.practitioner = "";
        this.charges = 0.0;
    }

    // Parameterized constructor
    public Procedure(String name, String date, String practitioner, double charges) {
        this.name = name;
        this.date = date;
        this.practitioner = practitioner;
        this.charges = charges;
    }

    // Method to display procedure information
    public void displayProcedure() {
        System.out.println("\tProcedure: " + name);
        System.out.println("\tProcedure Date: " + date);
        System.out.println("\tPractitioner: " + practitioner);
        System.out.println("\tCharges: $" + charges);
        System.out.println();
    }

    // Getter for charges
    public double getCharges() {
        return charges;
    }
}