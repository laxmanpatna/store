package parking;

public class ParkingMain {

	public static void main(String[] args) {
		
		VheicleFactory vf = new VheicleFactory();
		Vheicle v = vf.getVheicleInstanc("LMV");
	}
}
