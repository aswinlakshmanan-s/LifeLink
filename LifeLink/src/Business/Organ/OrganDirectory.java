/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organ;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Aswin Lakshmanan Sriram <sriram.a@northeastern.edu>
 */
public class OrganDirectory {
    
     private ArrayList<Organ> organList;

    public OrganDirectory() {
        organList = new ArrayList<>();
        // Initialize with some sample organs
        Organ heart = new Organ("Heart", "A Positive");
        Organ lungs = new Organ("Lungs", "A Positive");
        Organ kidney = new Organ("Kidney", "A Positive");

        organList.add(heart);
        organList.add(lungs);
        organList.add(kidney);
    }

    public ArrayList<Organ> getOrganList() {
        return organList;
    }

    public void setOrganList(ArrayList<Organ> organList) {
        this.organList = organList;
    }

    public void addOrgan(Organ organ) {
        organList.add(organ);
    }

    public void removeOrgan(Organ organ) {
        organList.remove(organ);
    }

    public List<String> getAvailableOrganTypes() {
        List<String> availableOrganTypes = new ArrayList<>();
        for (Organ organ : organList) {
            if (organ.isAvailable()) {
                availableOrganTypes.add(organ.getOrganName());
            }
        }
        return availableOrganTypes;
    }

    public List<Organ> getAvailableOrgans() {
        List<Organ> availableOrgans = new ArrayList<>();
        for (Organ organ : organList) {
            if (organ.isAvailable()) {
                availableOrgans.add(organ);
            }
        }
        return availableOrgans;
    }

    public boolean isOrganTypeAvailable(String organType) {
        for (Organ organ : organList) {
            if (organ.getOrganName().equalsIgnoreCase(organType) && organ.isAvailable()) {
                return true;
            }
        }
        return false;
    }
    
}
