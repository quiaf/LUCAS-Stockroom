package Classes;

public class OrderDetail {

    int OrderID;
    int ProductID;
    int Quantity;
    int Value;

    public OrderDetail(int orderID, int productID, int quantity, int value) {
        OrderID = orderID;
        ProductID = productID;
        Quantity = quantity;
        Value = value;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }
}
