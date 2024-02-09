
public class RoomAvailability {
	
	public boolean RoomAvailabilityCheck(int roomNumber) {
		if(roomNumber < 1 || roomNumber > 100) {
			return false;
		}else {
			return true;
		}
	}
}
