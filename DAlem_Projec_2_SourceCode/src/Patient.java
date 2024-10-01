public class Patient {
    // Fields
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String emergencyContactName;
    private String emergencyContactPhone;

    // Always store three procedures, initialized with default values
    private Procedure procedure1;
    private Procedure procedure2;
    private Procedure procedure3;
    
    // No-arg constructor
    public Patient() {
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.streetAddress = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
        this.emergencyContactName = "";
        this.emergencyContactPhone = "";

        // Initialize with default empty procedures
        this.procedure1 = new Procedure("No Procedure", "N/A", "N/A", 0.0);
        this.procedure2 = new Procedure("No Procedure", "N/A", "N/A", 0.0);
        this.procedure3 = new Procedure("No Procedure", "N/A", "N/A", 0.0);
    }

    // Parameterized constructor
    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zipCode, String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;

        // Initialize with default empty procedures
        this.procedure1 = new Procedure("No Procedure", "N/A", "N/A", 0.0);
        this.procedure2 = new Procedure("No Procedure", "N/A", "N/A", 0.0);
        this.procedure3 = new Procedure("No Procedure", "N/A", "N/A", 0.0);
    }

    // Accessor (getter) methods and other helper methods
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String buildAddress() {
        return streetAddress + ", " + city + ", " + state + " " + zipCode;
    }

    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    public Procedure getProcedure1() {
        return procedure1;
    }

    public Procedure getProcedure2() {
        return procedure2;
    }

    public Procedure getProcedure3() {
        return procedure3;
    }

    // Method to update a specific procedure
    public void updateProcedure(int procedureNumber, String name, String date, String practitioner, double charges) {
        switch (procedureNumber) {
            case 1:
                procedure1 = new Procedure(name, date, practitioner, charges);
                break;
            case 2:
                procedure2 = new Procedure(name, date, practitioner, charges);
                break;
            case 3:
                procedure3 = new Procedure(name, date, practitioner, charges);
                break;
        }
    }

    // Method to calculate total charges
    public double calculateTotalCharges() {
        return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
    }
}