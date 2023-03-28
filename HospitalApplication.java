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
import java.util.*;//this will include all classes from java.util package



public class HospitalApplication {
    
         // Main driver method
public static void main (String[] args) 
    { 
        String patientName;	//patient name
        int patientNumber;	//patient number
        String patientAddress;	//patient address
        String typeRoom;      // type of room 
        int noDay;            // no of day
        
        
        Scanner s = new Scanner (System.in);// Create a Scanner object as input
        Patient [] p = new Patient[2];  // declare an array p with the size of 50
        
         for (int i =0; i<p.length; i++) 
        { // p[i] = new Patient(); 
            System.out.println ("Patient "+ (i+1)); 
            System.out.println ("Enter name: "); //patient name
            patientName = s.next(); 
            System.out.println ("Enter number: "); //patient number
            patientNumber = s.nextInt(); 
            System.out.println ("Enter address: "); //patient address
            patientAddress = s.next(); 
            System.out.println ("Enter Room type: "); //patient room type
            typeRoom = s.next(); 
            System.out.println ("Enter number of day(s): "); //patient room type
            noDay = s.nextInt(); 
            
           p[i] = new Patient (patientName, patientNumber,patientAddress);
           p[i] = new Room (typeRoom,noDay, patientName, patientNumber,patientAddress);
              
        }
         for (int i=0; i<p.length; i++) {
        System.out.println(p[i]);//display the details information of  patient and room.

        }
       //  for (int i=0; i<p.length; i++) {
       //     if (p.getoDay => 20) {
       //         System.out.println(p[i]);
       //     } else {
       //         System.out.println("");
        //    }
        //}
         
         
    }
}