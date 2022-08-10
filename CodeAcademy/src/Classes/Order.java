package Classes;

import java.time.LocalDate;

public class Order {

    private int orderID;
    private int stockroomID;
    private LocalDate orderDate;
    private String status;

    public Order(int orderID, int stockroomID, LocalDate orderDate, String status) {
        this.orderID = orderID;
        this.stockroomID = stockroomID;
        this.orderDate = orderDate;
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getStockroomID() {
        return stockroomID;
    }

    public void setStockroomID(int stockroomID) {
        this.stockroomID = stockroomID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
