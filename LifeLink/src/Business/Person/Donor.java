/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import Business.Organ.Organ;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aswin Lakshmanan Sriram <sriram.a@northeastern.edu>
 */
public class Donor {
    
    private int donorID;
    private String donorName;
    private int donorAge;
    private String donorGender;
    private String donorBloodGroup;
    private String contact;
    private String donorAddress;
    private String donorCity;
    private String email;
    private String date;
    private String network;
    private String pName;
    private String pContact;
    private boolean isOrganAvailibility;
    List<String> organList;
    private ArrayList<Organ> organDirectory = new ArrayList<Organ>();

    // Donor Medical Information
    private String medicalHistory;
    private String allergies;
    private String primaryCarePhysician;

    // Emergency Contact Information
    private String emergencyContactName;
    private String emergencyContactNumber;

    // Organ Donation History
    private List<String> donationHistory;

    // Insurance Information
    private String insuranceProvider;
    
    
    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public int getDonorAge() {
        return donorAge;
    }

    public void setDonorAge(int donorAge) {
        this.donorAge = donorAge;
    }

    public String getDonorGender() {
        return donorGender;
    }

    public void setDonorGender(String donorGender) {
        this.donorGender = donorGender;
    }

    public String getDonorBloodGroup() {
        return donorBloodGroup;
    }

    public void setDonorBloodGroup(String donorBloodGroup) {
        this.donorBloodGroup = donorBloodGroup;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }

    public String getDonorCity() {
        return donorCity;
    }

    public void setDonorCity(String donorCity) {
        this.donorCity = donorCity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpContact() {
        return pContact;
    }

    public void setpContact(String pContact) {
        this.pContact = pContact;
    }

    public boolean isIsOrganAvailibility() {
        return isOrganAvailibility;
    }

    public void setIsOrganAvailibility(boolean isOrganAvailibility) {
        this.isOrganAvailibility = isOrganAvailibility;
    }

    public List<String> getOrganList() {
        return organList;
    }

    public void setOrganList(List<String> organList) {
        this.organList = organList;
    }

    public ArrayList<Organ> getOrganDirectory() {
        return organDirectory;
    }

    public void setOrganDirectory(ArrayList<Organ> organDirectory) {
        this.organDirectory = organDirectory;
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

    public List<String> getDonationHistory() {
        return donationHistory;
    }

    public void setDonationHistory(List<String> donationHistory) {
        this.donationHistory = donationHistory;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }
}


