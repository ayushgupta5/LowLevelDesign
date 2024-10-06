package Service.Order;

import Model.Order.Order;

public class OrderService implements IOrderService {
    @Override
    public void updateStatus(Order order) {
        System.out.println("Update the Status of the Order : " +order.toString());
    }

    @Override
    public void assignOrder(Order order) {
        System.out.println("Assign the Order : " +order.toString());
    }

    @Override
    public void updateOrderStatus(Order order) {
        System.out.println("Update the Status of the Order : " +order.toString());
    }
}
