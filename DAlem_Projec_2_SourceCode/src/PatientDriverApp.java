/* 
 Class: CMSC 203 CRN 22824
 Program: Assignment #2
 Instructor: Prof. Ahmed Tarek
 Summary of Description: a program that displays patient info and procedure
 Due Date: 10/01/2024 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Student’s Name: Dawit Alem
 */

import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect patient information using the patientInfo method
        Patient patient = patientInfo(scanner);

        // Collect up to three procedures
        int procedureCount = 0;
        while (procedureCount < 3) {
            System.out.println("Enter procedure name:");
            String procedureName = scanner.nextLine();

            System.out.println("Enter procedure date (MM/DD/YYYY):");
            String procedureDate = scanner.nextLine();

            System.out.println("Enter practitioner's name:");
            String practitionerName = scanner.nextLine();

            System.out.println("Enter charges for the procedure:");
            double charges = Double.parseDouble(scanner.nextLine());

            // Add procedure to the patient
            patient.updateProcedure(procedureCount + 1, procedureName, procedureDate, practitionerName, charges);
            procedureCount++;

            if (procedureCount < 3) {
                System.out.println("Do you want to add another procedure? (yes/no)");
                String continueInput = scanner.nextLine().toLowerCase();
                if (!continueInput.equals("yes")) {
                    break;
                }
            }
        }

        // Display the patient information
        displayPatient(patient);

        // Display total charges
        double totalCharges = patient.calculateTotalCharges();
        System.out.println();
        System.out.printf("Total Charges: $%.2f%n", totalCharges);

        // Display developer information
        System.out.println();
        System.out.println("Student Name: Dawit Alem");
        System.out.println("MC#: M-21163991");
        System.out.println("Due Date: 10/01/2024");

        // Close the scanner
        scanner.close();
    }

    // Method to collect patient information
    public static Patient patientInfo(Scanner scanner) {
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter your middle name:");
        String middleName = scanner.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter your street address:");
        String streetAddress = scanner.nextLine();

        System.out.println("Enter your city:");
        String city = scanner.nextLine();

        System.out.println("Enter your state:");
        String state = scanner.nextLine();

        System.out.println("Enter your zip code:");
        String zipCode = scanner.nextLine();

        System.out.println("Enter emergency contact name:");
        String emergencyContactName = scanner.nextLine();

        System.out.println("Enter emergency contact phone number:");
        String emergencyContactPhone = scanner.nextLine();

        // Create and return a new Patient object
        return new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, emergencyContactName, emergencyContactPhone);
    }

    // Method to display patient information
    public static void displayPatient(Patient patient) {
        System.out.println("Patient info:");
        System.out.println("\tName: " + patient.buildFullName());
        System.out.println("\tAddress: " + patient.buildAddress());
        System.out.println("\tEmergency Contact: " + patient.buildEmergencyContact());
        System.out.println();

        // Display procedures
        patient.getProcedure1().displayProcedure();
        patient.getProcedure2().displayProcedure();
        patient.getProcedure3().displayProcedure();
    }
}