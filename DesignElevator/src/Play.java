
public class Play {
	
	
	public static void main(String[] args) {
		
		ElevatorController controller = new ElevatorController(6, 10);
		
		// another thread
		// while(true) {
		//    controller.step();
		// }
		
		while(true) {
			
			// user comes
			controller.pickup(2, false); // pick me from 2nd flor to down direction 
			Queue<Integer> queu = controller.getPassengers(2);
			queu.enqueue(1);
			controller.setPassengers(queu , 2); // I wanna go 1
			
		}
		
	}

}
