package store;

import java.util.List;

import store.cloathings.AllCloathings;
import store.cloathings.BottomWear;
import store.cloathings.FootWear;
import store.cloathings.TopWear;

public class Cloathings implements Products {

	@Override
	public SubCatagories getSubCatagories(String subCategories) {
		
		switch(subCategories) {
		case "BottomWear" :
			return new BottomWear();
		case "TopWear" :
			return new TopWear();
		case "FootWar" :
			return new FootWear();
		default :
			return new AllCloathings();
		}
	}
	
	
}
