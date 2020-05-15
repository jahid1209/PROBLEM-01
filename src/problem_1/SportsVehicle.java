
package problem_1;


public  class SportsVehicle extends Vehicle
{
    
    private String turbo;

    public SportsVehicle(String modelNumber,String turbo, String typeName, String enginePower,String tireSize) 
    {
        super(modelNumber, typeName, enginePower, tireSize);
        this.turbo = turbo; 
        setVehicleType("Sports");
       
        
    }
    public String toString()
    {
        return super.toString()+"\n\t-Turbo: "+turbo;
    }
    
    
}