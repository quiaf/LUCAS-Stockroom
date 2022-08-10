package Classes;

public class OrderDetail {

    private int orderID;
    private int productID;
    private int quantity;
    private int value;

    public OrderDetail(int orderID, int productID, int quantity, int value) {
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
        this.value = value;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
