package tradearea.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;//
import java.util.List;//

public class WarehouseData {

	private String warehouseID;
	private String warehouseName;
	private String timestamp;
	private String warehouseAddress;
	private List<Product> products;//


	/**
	 * Constructor
	 */
	public WarehouseData() {

		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
		this.products = new ArrayList<>();//
	}

	public String getWarehouseAddress() {
		return warehouseAddress;
	}

	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}

	public List<Product> getProducts() {//
		return products;
	}

	public void setProducts(List<Product> products) {//
		this.products = products;
	}

	/**
	 * Setter and Getter Methods
	 */
	public String getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Warehouse Info: ID = %s, timestamp = %s", warehouseID, timestamp);
		return info;
	}
}