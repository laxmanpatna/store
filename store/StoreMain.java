package store;

import java.util.List;

public class StoreMain {

	public static void main(String[] args) {
		
		ProductFactory pf = new ProductFactory();
		Products p1 = pf.getInstance("Cloathings");
		List<String> items = p1.getSubCatagories("BottomWear").getItems();
		System.out.println(items);
	}
}
