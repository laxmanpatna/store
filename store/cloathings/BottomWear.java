package store.cloathings;

import java.util.ArrayList;
import java.util.List;

import store.SubCatagories;

public class BottomWear implements SubCatagories{

	@Override
	public List<String> getItems() {
		List<String> items = new ArrayList<>();
		
		items.add("Jeans");
		items.add("Trouser");
		items.add("Shorts");
		items.add("Play-Suits");
		return items;
	}

	
	
}
