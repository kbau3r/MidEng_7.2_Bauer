package tradearea.warehouse;

import tradearea.model.Product;
import tradearea.model.WarehouseData;

public class WarehouseSimulation {

	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum;
		double rounded = Math.round(number * 100.0) / 100.0;
		return rounded;

	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum;
		Long rounded = Math.round(number);
		return rounded.intValue();

	}

	public WarehouseData getData( String inID ) {

		WarehouseData data = new WarehouseData();
		data.setWarehouseID( inID );
		data.setWarehouseName( "Linz Bahnhof" );

		Product foodProduct = generateRandomProduct("00-443175", "Milch", "Lebensmittel", 30, "Packung 1L");
		Product householdProduct = generateRandomProduct("01-926885", "Apfelsaft", "Lebensmittel", 15, "Packung 3KG");
		Product hygieneProduct = generateRandomProduct("02-123456", "Tomatensaft", "Lebensmittel", 10, "Packung 1KG");
		Product foodProduct1 = generateRandomProduct("03-111111", "Brot", "Lebensmittel", 2, "Laib 500g");
		Product householdProduct1 = generateRandomProduct("04-222222", "Spülmittel", "Haushalt", 4, "Flasche 750ml");
		Product hygieneProduct1 = generateRandomProduct("05-333333", "Handseife", "Hygiene", 2, "Flasche 300ml");
		Product foodProduct2 = generateRandomProduct("06-444444", "Eier", "Lebensmittel", 2, "Packung 10 Stück");
		Product householdProduct2 = generateRandomProduct("07-555555", "Toilettenpapier", "Haushalt", 6, "Packung 12 Rollen");
		Product hygieneProduct2 = generateRandomProduct("08-666666", "Zahnpasta", "Hygiene", 2, "Tube 100ml");
		Product foodProduct3 = generateRandomProduct("09-777777", "Nudeln", "Lebensmittel", 1, "Packung 500g");
		Product householdProduct3 = generateRandomProduct("10-888888", "Geschirrtuch", "Haushalt", 5, "Stück");
		Product hygieneProduct3 = generateRandomProduct("11-999999", "Duschgel", "Hygiene", 4, "Flasche 250ml");
		Product foodProduct4 = generateRandomProduct("12-000000", "Kartoffeln", "Lebensmittel", 2, "Sack 5KG");


		data.getProducts().add(foodProduct);
		data.getProducts().add(householdProduct);
		data.getProducts().add(hygieneProduct);
		data.getProducts().add(foodProduct1);
		data.getProducts().add(householdProduct);
		data.getProducts().add(householdProduct1);
		data.getProducts().add(householdProduct2);
		data.getProducts().add(householdProduct3);
		data.getProducts().add(foodProduct2);
		data.getProducts().add(foodProduct3);
		data.getProducts().add(foodProduct4);
		data.getProducts().add(hygieneProduct1);
		data.getProducts().add(hygieneProduct2);
		data.getProducts().add(hygieneProduct3);

		return data;

	}

	private Product generateRandomProduct(String productID, String productName, String category, int quantity, String unit) {
		Product product = new Product();
		product.setProductID(productID);
		product.setProductName(productName);
		product.setProductCategory(category);
		product.setProductQuantity(quantity);
		product.setProductUnit(unit);
		return product;
	}

}