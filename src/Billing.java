
public class Billing {
	
	public void GenerateBill(int roomNumber, int nights) {
		System.out.println("Generating bill for room number: " + roomNumber + " for " + nights + " nights");
	}
	
	public void BillPayment(int roomNumber, float amount) {
		System.out.println("Processing payment for room number " + roomNumber + " for " + amount + "e");
	}
}
