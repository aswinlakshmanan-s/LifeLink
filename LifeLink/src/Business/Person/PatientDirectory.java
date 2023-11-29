/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Aswin Lakshmanan Sriram <sriram.a@northeastern.edu>
 */
public class PatientDirectory {
    
    private ArrayList<Patient> listOfPatients;

    public PatientDirectory() {
        listOfPatients = new ArrayList<>();
    }

    public ArrayList<Patient> getListOfPatients() {
        return listOfPatients;
    }

    public Patient createPatient(int patientId, String patientName, String patientAge, String gender,
            String contact, String speciality, String doctor, boolean isAlive, boolean isDonor,
            boolean isDirectDonation, ArrayList<String> organList, ArrayList<String> testDataList,
            String bloodGroup, String address, String insuranceProvider, String medicalHistory,
            String allergies, String primaryCarePhysician, String emergencyContactName,
            String emergencyContactNumber) {

        
        Patient patient = new Patient();
        patient.setPatientId(patientId);
        patient.setPatientName(patientName);
        patient.setPatientAge(patientAge);
        patient.setGender(gender);
        patient.setContact(contact);
        patient.setSpeciality(speciality);
        patient.setDoctor(doctor);
        patient.setIsAlive(isAlive);
        patient.setIsDonor(isDonor);
        patient.setIsDirectDonation(isDirectDonation);
        patient.setOrganList(organList);
        patient.setTestDataList(testDataList);
        patient.setBloodGroup(bloodGroup);
        patient.setAddress(address);
        patient.setInsuranceProvider(insuranceProvider);
        patient.setMedicalHistory(medicalHistory);
        patient.setAllergies(allergies);
        patient.setPrimaryCarePhysician(primaryCarePhysician);
        patient.setEmergencyContactName(emergencyContactName);
        patient.setEmergencyContactNumber(emergencyContactNumber);

        listOfPatients.add(patient);
        return patient;
    }

    public Patient getPatientById(int patientId) {
        for (Patient patient : listOfPatients) {
            if (patient.getPatientId() == patientId) {
                return patient;
            }
        }
        return null; // Patient not found
    }
    
    //Method to update patient information
    public void updatePatientInformation(int patientId, String newContact, String newAddress) {
        Patient patient = getPatientById(patientId);
        if (patient != null) {
            // Update the patient information
            patient.setContact(newContact);
            patient.setAddress(newAddress);
        }
    }
}