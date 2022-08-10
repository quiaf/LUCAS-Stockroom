package Classes;

public class Device {
    private int inventoryID;
    private int productID;
    private int stockroomID;
    private String manufacturer;
    private String model;
    private String serialNumber;
    private int cost;

    public Device(int inventoryID, int productID, int stockroomID, String manufacturer, String model, String serialNumber, int cost) {
        this.inventoryID = inventoryID;
        this.productID = productID;
        this.stockroomID = stockroomID;
        this.manufacturer = manufacturer;
        this.model = model;
        this.serialNumber = serialNumber;
        this.cost = cost;
    }

    public int getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getStockroomID() {
        return stockroomID;
    }

    public void setStockroomID(int stockroomID) {
        this.stockroomID = stockroomID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

