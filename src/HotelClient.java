
public class HotelClient {

	public static void main(String[] args) {
		HotelManagementFacade hotelFacade = new HotelManagementFacade(56);
		
		hotelFacade.CheckRoomAvailability();
		hotelFacade.BookRoom(5);
		hotelFacade.OrderRoomService("Chicken");
		hotelFacade.CheckoutRoom(450);
	}

}
