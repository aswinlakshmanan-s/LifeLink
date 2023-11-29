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
public class DonorDirectory {
    
     private List<Donor> donorList;

    public DonorDirectory() {
        donorList = new ArrayList<>();
    }

    public List<Donor> getDonorList() {
        return donorList;
    }

    public Donor createDonor(int donorID, String donorName, int donorAge, String donorGender, String donorBloodGroup,
            String contact, String donorAddress, String donorCity, String email, String date, String network,
            String pName, String pContact, boolean isOrganAvailability, List<String> organList,
            List<Organ> organDirectory, String medicalHistory, String allergies, String primaryCarePhysician,
            String emergencyContactName, String emergencyContactNumber, List<String> donationHistory,
            String insuranceProvider) {
        
        
        Donor donor = new Donor();
        donor.setDonorID(donorID);
        donor.setDonorName(donorName);
        donor.setDonorAge(donorAge);
        donor.setDonorGender(donorGender);
        donor.setDonorBloodGroup(donorBloodGroup);
        donor.setContact(contact);
        donor.setDonorAddress(donorAddress);
        donor.setDonorCity(donorCity);
        donor.setEmail(email);
        donor.setDate(date);
        donor.setNetwork(network);
        donor.setpName(pName);
        donor.setpContact(pContact);
        donor.setIsOrganAvailibility(isOrganAvailability);
        donor.setOrganList(organList);
        donor.setOrganDirectory((ArrayList<Organ>) organDirectory);
        donor.setMedicalHistory(medicalHistory);
        donor.setAllergies(allergies);
        donor.setPrimaryCarePhysician(primaryCarePhysician);
        donor.setEmergencyContactName(emergencyContactName);
        donor.setEmergencyContactNumber(emergencyContactNumber);
        donor.setDonationHistory(donationHistory);
        donor.setInsuranceProvider(insuranceProvider);
        
        donorList.add(donor);
        return donor;
    }
    
}
