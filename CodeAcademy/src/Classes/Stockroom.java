package Classes;

public class Stockroom {
    int StockroomID;
    int ManagerID;
    String Name;
    String Location;
    String Address;


    public Stockroom(int stockroomID, int managerID, String name, String location, String address) {
        StockroomID = stockroomID;
        ManagerID = managerID;
        Name = name;
        Location = location;
        Address = address;
    }

    public int getStockroomID() {
        return StockroomID;
    }

    public void setStockroomID(int stockroomID) {
        StockroomID = stockroomID;
    }

    public int getManagerID() {
        return ManagerID;
    }

    public void setManagerID(int managerID) {
        ManagerID = managerID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
