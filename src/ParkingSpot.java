import java.util.Date;
import java.util.HashMap;
import java.time.Duration;
import java.time.Instant;

public class ParkingSpot {

	static int TotalSlot = 500;
	static int MaxBikeSlots = 200;
	static int MaxCarSlots = 300;

	int bikeCount = 0;
	int carCount = 0;
	boolean Movie;
	HashMap<String, VehicleType> vehicle_Information = new HashMap<String, VehicleType>();
	HashMap<String, Instant> TimeStamp = new HashMap<String, Instant>();

	
	// Assign Parking spot with its "in Time"

	public void AssignSpot(Vehicle vehicle) {
		Instant Intime = Instant.now();
		TimeStamp.put(vehicle.VehicleNo, Intime);
		vehicle_Information.put(vehicle.VehicleNo, vehicle.type);
	}

	
	// Free the parking spot with its cost calculation.

	public void FreeSpot(Vehicle vehicle) {
		Instant OutTime = Instant.now();
		float cost;
		Instant inTime;

		inTime = TimeStamp.get(vehicle.VehicleNo);
		vehicle_Information.remove(vehicle.VehicleNo, vehicle.type);
		Duration timeElapsed = Duration.between(inTime, OutTime);
		System.out.println("Time taken: " + timeElapsed.toHours() + " Hours");
		switch (vehicle.type) {
		case Bike:
			cost = vehicle.BikeCost * timeElapsed.toHours();
			System.out.println("Total Cost: Rs " + cost + "");
			break;
		case Car:
			cost = vehicle.CarCost * timeElapsed.toHours();
			System.out.println("Total Cost: Rs " + cost + "");
			break;

		}
	}
}