/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

/**
 * POST LAB 2
 * SUBMISSION : 28 MARCH 2023
 * @author NUR HIDAYAH BINTI ISHAK 2020496204 CSC2304C
 */
import java.util.*;//this will include all classes from java.util package
import java.util.ArrayList;



public class HospitalApplication {
    
         // Main driver method
public static void main (String[] args) 
    { 
        String patientName;	//patient name
        int patientNumber;	//patient number
        String patientAddress;	//patient address
        String typeRoom;      // type of room 
        int noDay;            // no of day
        int numpatient;
        
        Scanner s = new Scanner (System.in);// Create a Scanner object as input
        
       //use this coding toe insert number of patients in manual
        //System.out.print("Please enter Number of patients : ");
        //numpatient = Integer.parseInt(s.nextLine());
        //answer b(i)
        //Patient [] p = new Patient[numpatient];  // declare an array p with the size of 50
        
        
        //answer b(i)
        Patient [] p = new Patient[50];  // declare an array p with the size of 50
        
        
        
        
        for (int i =0; i<p.length; i++) 
        { // p[i] = new Patient(); 
            System.out.println ("Patient "+ (i+1)); 
            System.out.println ("Enter name: "); //patient name
            patientName = s.nextLine(); 
            System.out.println ("Enter number: (ex:0176842082) "); //patient number
            patientNumber = Integer.parseInt(s.nextLine());
            System.out.println ("Enter address: "); //patient address
            patientAddress = s.nextLine(); 
            System.out.println ("Enter Room type: (Please choose one selection - Diamond/Gold/Silver/Bronze) "); //patient room type
            typeRoom = s.nextLine(); 
            System.out.println ("Enter number of day(s): "); //patient room type
            noDay = Integer.parseInt(s.nextLine());
            
            p[i] = new Patient (patientName, patientNumber,patientAddress);
            p[i] = new Room (typeRoom,noDay, patientName, patientNumber,patientAddress);
              
        }
         
        
        //answer b(ii) 
        //count the number of patients who stay in the hospital for more 
        //than twenty (20) days.
         
        int patientCount = 0;
        for (int i=0; i<p.length; i++) {
            // Convert patient to Room object
            Room room = (Room)p[i];

            if (room.getNoDay() > 20) {
                patientCount++;
            }
        }
        
        //display the number of patients who stay in the hospital for more 
        //than twenty (20) days.
        System.out.println ("\n");
        System.out.println(patientCount + " have stayed for more than 20 days.\n");
        
        //answer b(iii)
        //display the average payment per day of each patient
        System.out.println("The average payment per day collected from all patients are:");
         for (int i=0; i<p.length; i++) {
             System.out.println(p[i]);
         }
      
    }
}