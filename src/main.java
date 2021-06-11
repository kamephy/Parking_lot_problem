import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		ParkingSpot sp = new ParkingSpot();
		Vehicle Vt = new Vehicle();
		Scanner sc = new Scanner(System.in);
				int ch=1234;
		        while(ch!=0)
		        {
		        	System.out.println("\n \n");
		            System.out.println("Welcome to the Parking Slot");
		            System.out.println("Please Select Any Option Given Below");
		            System.out.println("1. Park a Vehicle\n 2.Free a Slot\n 3.Get The Total Collection\n 4.Check the availability\n");
		            ch=sc.nextInt();
		            switch(ch)
		            {
		                case 1:
		                    System.out.println("Enter the vehicle number");
		                    Vt.VehicleNo = sc.next();
		                    System.out.println("Enter the vehicle Type");
		                    String Vtype =sc.next();
		                    
		                    Vt.getVehicleType(Vtype);
		                    sp.AssignSpot(Vt);
		                    break;
		                case 2:
		                    System.out.println("Enter the vehicle number");
		                    Vt.VehicleNo = sc.next();
		                    System.out.println("Enter the vehicle Type");
		                    String Vvtype =sc.next();
		                    Vt.getVehicleType(Vvtype);
		                    sp.FreeSpot(Vt);
		                    break;

		                case 3:
		                    sp.TotalTarrif();
		                    break;

		                case 4:
		                    sp.Availability();
		                    break;
		                default:
		                    System.out.println("Wrong Input please enter a valid number,Thank You");
		            }

		        }
		
	}
}
