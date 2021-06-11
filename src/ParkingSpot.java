
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.HashMap;


public class ParkingSpot {

	static int TotalSlot = 500;
	 int MaxBikeSlots = 200;
	 int MaxCarSlots = 300;
	 float total = 0;
	 public static int bikeCount;
	 public static int carCount;
	
	HashMap<String, VehicleType> vehicle_Information = new HashMap<String, VehicleType>();
	HashMap<String, Date> TimeStamp = new HashMap<String, Date>();

	
	// Assign Parking spot with its "in Time"
	public void AssignSpot(Vehicle vehicle) {
		if((bikeCount<=MaxBikeSlots)||(carCount<=MaxCarSlots))
		{
			    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");   
				Date Intime = new Date();
				TimeStamp.put(vehicle.VehicleNo, Intime);
				vehicle_Information.put(vehicle.VehicleNo, vehicle.type);
				System.out.println(vehicle_Information);
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
		else {
			System.out.println("Parking Slot is full !!");
		}
		
	}

	
	// Free the parking spot with its cost calculation.
	public void FreeSpot(Vehicle vehicle ) {
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
				bikeCount--;
				break;
			case Car:
				cost = vehicle.CarCost * difference_In_Time;
				System.out.println("Total Cost: Rs " + cost + "");
				total=total+cost;
				carCount--;
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
	public void Availability() {
		int AvBike=MaxBikeSlots-bikeCount;
		System.out.println("Total Available slots for bike: "+AvBike);
		int AvCar=MaxCarSlots-carCount;
		System.out.println("Total Available slots for Car: "+AvCar);
		
	}
	
}


















