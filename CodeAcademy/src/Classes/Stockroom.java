package Classes;

public class Stockroom {
    private int stockroomID;
    private int managerID;
    private String name;
    private String location;
    private String address;


    public Stockroom(int stockroomID, int managerID, String name, String location, String address) {
        this.stockroomID = stockroomID;
        this.managerID = managerID;
        this.name = name;
        this.location = location;
        this.address = address;
    }

    public int getStockroomID() {
        return stockroomID;
    }

    public void setStockroomID(int stockroomID) {
        this.stockroomID = stockroomID;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
