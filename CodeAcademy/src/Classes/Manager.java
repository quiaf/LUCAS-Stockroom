package Classes;

public class Manager {
    private int managerID;
    private int stockroomID;
    private int dni;
    private String fullName;
    private String country;


    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public int getStockroomID() {
        return stockroomID;
    }

    public void setStockroomID(int stockroomID) {
        this.stockroomID = stockroomID;
    }

    public Manager(int managerID, int stockroomID, int DNI, String fullName, String country) {
        this.managerID = managerID;
        this.stockroomID = stockroomID;
        this.dni = DNI;
        this.fullName = fullName;
        this.country = country;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

