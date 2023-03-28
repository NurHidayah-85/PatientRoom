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
public class Room extends Patient{
    public String typeRoom;      // type of room 
    public int noDay;            // no of day
 

    public Room(String typeRoom, int noDay, String patientName, int patientNumber, String patientAddress) {
        super(patientName, patientNumber, patientAddress);
        this.typeRoom = typeRoom;
        this.noDay = noDay;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public int getNoDay() {
        return noDay;
    }

    public void setNoDay(int noDay) {
        this.noDay = noDay;
    }
    
    
    
    public double calcPayment()
    {
        double pay = 0;
        if (noDay > 20)
        {
            switch (typeRoom) {
                case "Diamond":
                    pay = noDay * 200 * 0.25;
                    break;
                case "Gold":
                    pay = noDay * 100 * 0.25;
                    break;
                case "Silver":
                    pay = noDay * 80 * 0.25;
                    break;
                case "Bronze":
                    pay = noDay * 50 * 0.25;
                    break;
                default:
                    break;
            }
            
        }
        else if (noDay <= 20) {
            switch (typeRoom) {
                case "Diamond":
                    pay = noDay * 200;
                    break;
                case "Gold":
                    pay = noDay * 100;
                    break;
                case "Silver":
                    pay = noDay * 80;
                    break;
                case "Bronze":
                    pay = noDay * 50;
                    break;
                default:
                    break;
            }
        }
        return pay;
   
    }
    
    
    
    public double average(){
        
        double avg = calcPayment() / noDay;
        
        return avg;
    }
    
    
    
    
    @Override
    public String toString() 
{
   
   return super.toString() + " , Type: " + typeRoom +  " , Day(s): " + noDay + " , Payment (RM): " + calcPayment() + " , Average payment per day (RM): "+ average();
}
    
    
}
