
package problem_1;


public  class Vehicle
{
    
    private String modelNumber ;
    private EngineType type;
    private String enginePower ;
    private String tireSize ;
    
    private String vehicleType;
    
    
    public Vehicle(String modelNumber, String typeName, String enginePower,String tireSize)
    {
        this.modelNumber  = modelNumber ;
        type = new EngineType(typeName) ; 
        this.enginePower = enginePower ;
        this.tireSize = tireSize ;
    }
    String getVehicletype()
    {
        return vehicleType;
    }
    void setVehicleType(String vehicleType)
    {
        this.vehicleType = vehicleType;
    }  
    String getVehicleNumber()
    {
        return modelNumber;
    }
          
      
    public String toString()
    {
        return "\t-Vehicle Type: "+vehicleType
                +"\n\t-Model Number: "+modelNumber
                +"\n\t-Engine Type: "+type.getEngineType()
                +"\n\t-Engine Power: "+enginePower+" HP"
                +"\n\t-Tire Size: "+tireSize;
    }
   
}
