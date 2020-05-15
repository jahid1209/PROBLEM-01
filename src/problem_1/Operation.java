/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_1;

import java.util.ArrayList;
import java.util.Scanner;


public class Operation {
    
    
  static Scanner sc = new Scanner(System.in) ;
    static ArrayList<Vehicle>list = new ArrayList <Vehicle>();
    static int expectedVisitor = 30;
    
    static void  showMenu()
    {
        System.out.println("******************************************");
        System.out.println();
        System.out.println("Press 1 to add Vehicle");
        System.out.println("Press 2 to remove Vehicle");
        System.out.println("Press 3 to get the list of vehicles with current expected visitor count");
        System.out.println("Press 4 to get the Vehicles's details");
        System.out.println();
        System.out.println("******************************************");

    }
    
    public static void add()
    {

        System.out.println("Enter Vehicle Type:");
        System.out.println("1 for normal");
        System.out.println("2 for sports");
        System.out.println("3 for heavy");

        int  input = sc.nextInt();
        System.out.println("please Enter the following information"); 


        if(input == 1)
        {
            System.out.print("Model Number: ");
            String modelNumber  = sc.next();
            System.out.print("Engine Type [oil/diesel/gas]: ");
            String type = sc.next();
            System.out.print("Engine Power: ");
            String enginePower  = sc.next();
            System.out.print("Tire size: ");
            String tireSize = sc.next();
            Vehicle vehicle = new NormalVehicle(modelNumber, type, enginePower, tireSize);
            //System.out.println(ob);
            list.add(vehicle);
        }

        else if(input == 2)
        {
            expectedVisitor += 20;
            System.out.print("Sports car's Model Number: ");
            String modelNumber  = sc.next();
            System.out.print("Turbo : ");
            String turbo = sc.next();
            System.out.print("Engine Power: ");
            String enginePower  = sc.next();
            System.out.print("Tire size: ");
            String tireSize = sc.next();

            Vehicle vehicle = new SportsVehicle(modelNumber, turbo, "oil", enginePower, tireSize);
            list.add(vehicle);

        }
        else
        {
            System.out.print("Heavy Vehicles's Model Number: ");
            String modelNumber  = sc.next();
            System.out.print("Weight : ");
            String weight = sc.next();
            System.out.print("Engine Power: ");
            String enginePower  = sc.next();
            System.out.print("Tire size: ");
            String tireSize = sc.next();

            Vehicle vehicle = new HeavyVehicle(modelNumber, weight, "diesel", enginePower, tireSize);
            list.add(vehicle);

        }

    }
    
    public static void remove()
    {
        
        System.out.println("Press 1 to remove the first vehicle on the list");
        System.out.println("Press 2 to remove vehicle using model number");
        
        int x = sc.nextInt();
        
        if(x == 1)
        {
            Vehicle v = list.remove(0);
            System.out.println("Removed vehicle details.....");
            System.out.println(v.toString()+"\n");
            
        }
        else
        {
           System.out.print("Enter vehicle model number: ");
           String st = sc.next();
                   
           for(Vehicle vehicle : list)
           {
                if(vehicle.getVehicleNumber().equalsIgnoreCase(st))
                {
                    //Vehicle temp = list.remove(x)
                    System.out.println("Removed vehicle details.....");
                    System.out.println(vehicle.toString()+"\n");
                    list.remove(vehicle);
                    return;
                }
           }
           System.out.println("matched item not found");
        }
        
       
        
    }
    static void listWithExpectedVisitor()
    {
        int x = 1;
        if(list.isEmpty())
        {
            System.out.println("No vehicle is available at the moment");
            System.out.println("Current expected visitor: "+expectedVisitor);
            return ;
        }
        for(Vehicle vehicle : list)
        {
            System.out.println("Vehicle No :"+x);
            x++;
            System.out.println("      -Vehicle Type: "+vehicle.getVehicletype());
        }
         System.out.println("Current expected visitor: "+expectedVisitor);
    }
    public static void vehiclesDetails()
    {
        int x = 1;
                
        for(Vehicle vehicle : list)
        {
            System.out.println("Vehicle No :"+x);
            x++;
            System.out.println(""+vehicle.toString());
        }
        
    }
}
