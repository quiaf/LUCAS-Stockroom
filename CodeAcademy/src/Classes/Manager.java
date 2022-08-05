package Classes;

public class Manager {
    int ManagerID;
    int StockroomID;
    int DNI;
    String FullName;
    String Country;


    public int getManagerID() {
        return ManagerID;
    }

    public void setManagerID(int managerID) {
        ManagerID = managerID;
    }

    public int getStockroomID() {
        return StockroomID;
    }

    public void setStockroomID(int stockroomID) {
        StockroomID = stockroomID;
    }

    public Manager(int managerID, int stockroomID, int DNI, String fullName, String country) {
        ManagerID = managerID;
        StockroomID = stockroomID;
        this.DNI = DNI;
        FullName = fullName;
        Country = country;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}

