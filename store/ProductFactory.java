package store;

public class ProductFactory {

	public Products getInstance(String typeOfProducts) {
		
		switch( typeOfProducts ) {
			
		case "Electronic" :
			return new Electoronic();
		case "Cloathings" :
			return new Cloathings();
		case "HomeAppliances" :
			return new HomeApliances();
		default :
			return new AllProducts();
		}
	}
}
