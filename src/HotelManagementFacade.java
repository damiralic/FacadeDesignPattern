
public class HotelManagementFacade {
	
	private int roomNumber;
	
	private RoomBooking roomBooking;
	private Billing billing;
	private RoomService roomService;
	private RoomAvailability roomAvailability;
	
	public HotelManagementFacade(int newRoomNumber) {
		roomNumber = newRoomNumber;
		
		roomBooking = new RoomBooking();
		billing = new Billing();
		roomService = new RoomService();
		roomAvailability = new RoomAvailability();
	}
	
	public void CheckRoomAvailability() {
		if(roomAvailability.RoomAvailabilityCheck(roomNumber)) {
			System.out.println("Room number " + roomNumber + " is available!");
		}else {			
			System.out.println("Room number " + roomNumber + " is not available!");
			System.exit(0);
		}
	}

	
	public void BookRoom(int nights) {
		roomBooking.BookRoom(roomNumber);
		billing.GenerateBill(roomNumber, nights);
		System.out.println("Room number " + roomNumber + " has been checked into for " + nights + " nights");
	}
	
	public void CheckoutRoom(float amount) {
		billing.BillPayment(roomNumber, amount);
		roomBooking.CancelRoomBooking(roomNumber);
		System.out.println("Guest checked out from room number " + roomNumber + " The bill is " + amount + "e");
	}
	
	public void OrderRoomService(String foodItem) {
		roomService.orderFood(roomNumber, foodItem);
		System.out.println("Food item " + foodItem + " is delivered to room number " + roomNumber);
	}
}
