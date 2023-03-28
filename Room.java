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
    
    
    
    public void calcPayment()
    {
        double pay;
        if (noDay > 20)
        {
            if (typeRoom.equals("Diamond"))
                pay = noDay * 200 * 0.25;
            else if (typeRoom.equals("Gold"))
                pay = noDay * 100 * 0.25;
            else if (typeRoom.equals("Silver"))
                pay = noDay * 80 * 0.25;
            else if (typeRoom.equals("Bronze"))
                pay = noDay * 50 * 0.25;
            
        }
        else if (noDay < 20) {
            if (typeRoom.equals("Diamond"))
                pay = noDay * 200;
            else if (typeRoom.equals("Gold"))
                pay = noDay * 100;
            else if (typeRoom.equals("Silver"))
                pay = noDay * 80;
            else if (typeRoom.equals("Bronze"))
                pay = noDay * 50;
        }
        else return;
   
    }
    
    @Override
    public String toString() 
    {
   
   return patientName + ", " + patientNumber + " ," + patientAddress + typeRoom + noDay;
    }
    
    
    
    
}
