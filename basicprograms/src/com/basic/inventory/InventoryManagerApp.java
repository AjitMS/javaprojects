package com.basic.inventory;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryManagerApp {

	String path = "src/textfiles/inventory.json";
	List<Item> inventorylist;
//Main Logic
	public InventoryManagerApp() {
		try (FileReader fr = new FileReader(new File(path))) {
			JSONParser parser = new JSONParser();
			inventorylist = new ArrayList<Item>();
			JSONObject jsonobject = (JSONObject) parser.parse(fr);
			JSONArray itemslist = (JSONArray) jsonobject.get("inventory");

			for (int i = 0; i < itemslist.size(); i++) {
				JSONObject items = (JSONObject) itemslist.get(i);
				String name = (String) items.get("name");
				int quantity = Integer.parseInt((String)(items.get("weight")));
				int price = Integer.parseInt((String)(items.get("priceofkg")));
				Item aitem = new Item(name, quantity, price);
				inventorylist.add(aitem);
			}

		} catch (IOException | ParseException E) {
			// TODO Auto-generated catch block
			E.printStackTrace();
		}
	}
	
	

	public void show() {
		System.out.printf("%-10s \t %-5s \t -%5s \n", "name", "weight",
				"price");
		for (Item item : inventorylist) {
			System.out.printf("%-10s \t %-10d \t %-5d\n", item.getName(),
					item.getQuantity(), item.getPrice());
		}

	}

}
