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
public class Patient {
      
    private int patientId;
    private String patientName;
    private String patientAge;
    private String gender;
    private String contact;
    private String speciality;
    private String doctor;
    private boolean isAlive;
    private boolean isDonor;
    private boolean isDirectDonation;
    private ArrayList<String> organList;
    private ArrayList<String> testDataList;
    private String bloodGroup;
    private String address;
    private String insuranceProvider;
    private String medicalHistory;
    private String allergies;
    private String primaryCarePhysician;
    private String emergencyContactName;
    private String emergencyContactNumber;
    
      public int getPatientId() {
            return patientId;
        }

        public void setPatientId(int patientId) {
            this.patientId = patientId;
        }

        public String getPatientName() {
            return patientName;
        }

        public void setPatientName(String patientName) {
            this.patientName = patientName;
        }

        public String getPatientAge() {
            return patientAge;
        }

        public void setPatientAge(String patientAge) {
            this.patientAge = patientAge;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public String getSpeciality() {
            return speciality;
        }

        public void setSpeciality(String speciality) {
            this.speciality = speciality;
        }

        public String getDoctor() {
            return doctor;
        }

        public void setDoctor(String doctor) {
            this.doctor = doctor;
        }

        public boolean isIsAlive() {
            return isAlive;
        }

        public void setIsAlive(boolean isAlive) {
            this.isAlive = isAlive;
        }

        public boolean isIsDonor() {
            return isDonor;
        }

        public void setIsDonor(boolean isDonor) {
            this.isDonor = isDonor;
        }

        public boolean isIsDirectDonation() {
            return isDirectDonation;
        }

        public void setIsDirectDonation(boolean isDirectDonation) {
            this.isDirectDonation = isDirectDonation;
        }

        public ArrayList<String> getOrganList() {
            return organList;
        }

        public void setOrganList(ArrayList<String> organList) {
            this.organList = organList;
        }

        public ArrayList<String> getTestDataList() {
            return testDataList;
        }

        public void setTestDataList(ArrayList<String> testDataList) {
            this.testDataList = testDataList;
        }

    
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getPrimaryCarePhysician() {
        return primaryCarePhysician;
    }

    public void setPrimaryCarePhysician(String primaryCarePhysician) {
        this.primaryCarePhysician = primaryCarePhysician;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }
}
