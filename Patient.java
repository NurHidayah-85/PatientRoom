/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

/**
 *
 * @author LENOVO
 */
public class Patient {
    public String patientName;	//patient name
    public int patientNumber;	//patient number
    public String patientAddress;	//patient address

    public Patient(String patientName, int patientNumber, String patientAddress) {
        this.patientName = patientName;
        this.patientNumber = patientNumber;
        this.patientAddress = patientAddress;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }
    
    

public String toString() 
{
   
return patientName + ", " + patientNumber + " ," + patientAddress;
}
   
}
