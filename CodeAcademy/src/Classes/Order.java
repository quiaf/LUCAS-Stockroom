package Classes;

import java.util.Date;

public class Order {

    private int OrderID;
    private int StockroomID;
    private Date Date;
    private String Status;

    public Order(int orderID, int stockroomID, java.util.Date date, String status) {
        OrderID = orderID;
        StockroomID = stockroomID;
        Date = date;
        Status = status;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getStockroomID() {
        return StockroomID;
    }

    public void setStockroomID(int stockroomID) {
        StockroomID = stockroomID;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
