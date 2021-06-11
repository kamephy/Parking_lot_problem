
public class Vehicle {
	  String VehicleNo;
	  float BikeCost=20, CarCost=40;
	  boolean Movie;
	  VehicleType type;
	  
	  
	  //get Vehicle Type from User
	  public void getVehicleType(String str) {
		  type=VehicleType.valueOf(str);
		  
	  }
	}
