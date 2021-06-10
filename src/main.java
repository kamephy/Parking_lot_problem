import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		ParkingSpot sp = new ParkingSpot();
		Vehicle Vt = new Vehicle();
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Enter the vehicle number");
			Vt.VehicleNo = sc.next();
			System.out.println("Enter the vehicle Type");
			String Vtype =sc.next();
			Vt.getVehicleType(Vtype);
			
			/* try {
				 if(Vtype.equals("Bike")||Vtype.equals("Car")) {
					 VehicleType type = Vt.type.valueOf(Vtype);
				 }
			
			 }
			 catch (Exception e) {
				 e.printStackTrace();
			 }
			*/
			
			
			
			System.out.println("choose 1 for assign choose 2 for free");
			int i = sc.nextInt();
			switch(i) {
			case 1: sp.AssignSpot(Vt);
			break;
			
			case 2: sp.FreeSpot(Vt);
			break;
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
