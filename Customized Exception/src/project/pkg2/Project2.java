/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
 *
 * @author tenzintashi
 */
import java.util.Scanner;
import java.io.*;
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException,TimeInUseException,InvalidTimeException{
        // TODO code application logic here
        
        //object for BufferReader
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String[] appointmentName = new String[6]; // create array of size 6
        int time, count =0;
        String name;
        // at first initialize all elements to empty string
        for(int i =0 ; i<6; i++){
            appointmentName[i] = " ";
        }
        while(true){
        try{
        // display it on the screen as avaliable time for appointment
        System.out.println("Time for appointment: ");
        for(int i =1 ; i<=6; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nSelect a time: ");
        time = Integer.parseInt(kb.readLine());
        if(time < 1 || time > 6){
            throw new InvalidTimeException("Time is out of range");
        }
        time -=1;
        
        if (appointmentName[time].equalsIgnoreCase(" ")){
            System.out.print("Time is Available \nEnter Your name: ");
            name = kb.readLine();
            appointmentName[time] = name;
            count ++;
            if (count == 6){
                break;
            }
        }
        else{
            throw new TimeInUseException("The time you selected is already filled");
        }
        }catch(InvalidTimeException e){
            System.out.println("Time is out of range");
        }catch(TimeInUseException e){
            System.out.println("Time is already filled");
        }
        }
    System.out.println("People with appoinment are: ");
    for(int i = 0; i < 6; i++){
        System.out.println(appointmentName[i]);
    }
    
    }
    
    
}
