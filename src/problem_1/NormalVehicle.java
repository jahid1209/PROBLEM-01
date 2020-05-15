/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_1;


public class NormalVehicle extends Vehicle
{
    
    public NormalVehicle(String modelNumber, String typeName, String enginePower,String tireSize) 
    {
        super(modelNumber, typeName, enginePower, tireSize);
        setVehicleType("Normal");
    }
    
}