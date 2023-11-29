/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organ;

/**
 *
 * @author Aswin Lakshmanan Sriram <sriram.a@northeastern.edu>
 */
public class Organ {
private String organName;
private String bloodType;
private boolean isAvailable;
private String network;
private String description;
private int shelfLifeInHours; // Shelf life of the organ in hours
private String donorName; // Name of the donor (if applicable)
private String transplantationDate; // Date of transplantation (if applicable)

public Organ(String organName, String bloodType) {
    this.organName = organName;
    this.bloodType = bloodType;
    this.isAvailable = true;
}

public String getOrganName() {
    return organName;
}

public void setOrganName(String organName) {
    this.organName = organName;
}

public String getBloodType() {
    return bloodType;
}

public void setBloodType(String bloodType) {
    this.bloodType = bloodType;
}

public boolean isAvailable() {
    return isAvailable;
}

public void setAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
}

public String getNetwork() {
    return network;
}

public void setNetwork(String network) {
    this.network = network;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public int getShelfLifeInHours() {
    return shelfLifeInHours;
}

public void setShelfLifeInHours(int shelfLifeInHours) {
    this.shelfLifeInHours = shelfLifeInHours;
}

public String getDonorName() {
    return donorName;
}

public void setDonorName(String donorName) {
    this.donorName = donorName;
}

public String getTransplantationDate() {
    return transplantationDate;
}

public void setTransplantationDate(String transplantationDate) {
    this.transplantationDate = transplantationDate;
}
}
