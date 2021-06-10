
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.HashMap;


public class ParkingSpot {

	static int TotalSlot = 500;
	static int MaxBikeSlots = 200;
	static int MaxCarSlots = 300;
	float total = 0;
	int bikeCount = 0;
	int carCount = 0;
	boolean Movie;
	HashMap<String, VehicleType> vehicle_Information = new HashMap<String, VehicleType>();
	HashMap<String, Date> TimeStamp = new HashMap<String, Date>();

	
	// Assign Parking spot with its "in Time"
	public void AssignSpot(Vehicle vehicle) {
	    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");   
	
		Date Intime = new Date();
		TimeStamp.put(vehicle.VehicleNo, Intime);
		vehicle_Information.put(vehicle.VehicleNo, vehicle.type);
		System.out.println("Vehicle Alloted"+vehicle.type);
		String Vtype = String.valueOf(vehicle.type);
		if(Vtype.equals("Bike")) {
			System.out.println("Bike tha");
			bikeCount++;
		}
		else {
			System.out.println("Car tha");
			carCount++;
		}
	}

	
	// Free the parking spot with its cost calculation.
	public void FreeSpot(Vehicle vehicle) {
		Date OutTime = new Date();
		float cost;
		Date inTime;
		
			inTime = TimeStamp.get(vehicle.VehicleNo);
			vehicle_Information.remove(vehicle.VehicleNo, vehicle.type);
			long difference_In_Time
            = OutTime.getTime() - inTime.getTime();
			switch (vehicle.type) {
			case Bike:
				cost = vehicle.BikeCost * difference_In_Time;
				System.out.println("Total Cost: Rs " + cost + "");
				total=total+cost;
				break;
			case Car:
				cost = vehicle.CarCost * difference_In_Time;
				System.out.println("Total Cost: Rs " + cost + "");
				total=total+cost;
				break;
			default:
			    System.out.println("Error on input");
							 }
		}
	
	
	// Total Income in a day
	public void TotalTarrif() {
		System.out.println("Total Money earned today : Rs"+total);
	} 
	
	
	//Availability of spots
	
}


















