package Classes;

public class Device {
    int InventoryID;
    int ProductID;
    int StockroomID;
    String Manufacturer;
    String Model;
    String SerialNumber;
    int Cost;

    public Device(int inventoryID, int productID, int stockroomID, String manufacturer, String model, String serialNumber, int cost) {
        InventoryID = inventoryID;
        ProductID = productID;
        StockroomID = stockroomID;
        Manufacturer = manufacturer;
        Model = model;
        SerialNumber = serialNumber;
        Cost = cost;
    }

    public int getInventoryID() {
        return InventoryID;
    }

    public void setInventoryID(int inventoryID) {
        InventoryID = inventoryID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getStockroomID() {
        return StockroomID;
    }

    public void setStockroomID(int stockroomID) {
        StockroomID = stockroomID;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }
}

