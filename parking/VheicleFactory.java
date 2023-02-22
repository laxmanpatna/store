package parking;

public class VheicleFactory {

	public Vheicle getVheicleInstanc(String type) {
		
		switch( type ) {
		case "LMV" :
			return new LMVheicle();
		case "SLMV" :
			return new SLMVheicle();
		case "HMV" :
			return new HMVheicle();
		default :
			return null;
		}
	}
}
