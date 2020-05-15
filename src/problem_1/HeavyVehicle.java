
package problem_1;

public class HeavyVehicle extends Vehicle
{
    private String weight;
    public HeavyVehicle(String modelNumber, String weight, String typeName, String enginePower,String tireSize)
    {
        super(modelNumber, typeName, enginePower, tireSize);
        this.weight = weight;
        setVehicleType ("Heavy") ;
    }
     public String toString()
    {
        return super.toString()+ "\n\t-Weight : "+weight+" KG";
    }
    
}
