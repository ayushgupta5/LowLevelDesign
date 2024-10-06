package Main;

import Model.Menu.Menu;
import Model.MenuItem.MenuItem;
import Model.Order.Order;
import Model.Payment.Payment;
import Model.Restaurant.Restaurant;
import Model.User.User;
import Service.Menu.IMenuService;
import Service.Menu.MenuService;
import Service.Order.IOrderService;
import Service.Order.OrderService;
import Service.Payment.CreditCardPayment;
import Service.Payment.PaymentService;
import Service.Payment.PaymentStrategy;
import Service.Payment.UPIPayment;
import Service.Restaurant.IRestaurantService;
import Service.Restaurant.RestaurantService;
import Service.User.IUserService;
import Service.User.UserService;

public class ZomatoApp {
    public static void main(String[] args) {
        User user = new User(1, "User", "user@gmail.com", "Address", "Phone");
        Menu menu = new Menu(1);
        MenuItem menuItem = new MenuItem(1, "Dosa", "Dosa", 100.00);
        Restaurant restaurant = new Restaurant(1, "KFC", "Delhi", menu, 5);
        Order order = new Order(1, user, restaurant, 100.00, "Address");

        IUserService userService = new UserService();
        userService.searchRestaurants(restaurant);
        userService.placeOrder(order);
        userService.trackOrder(order);

        IRestaurantService restaurantService = new RestaurantService();
        restaurantService.acceptOrder(order);
        restaurantService.updateOrderStatus(order);

        IMenuService menuService = new MenuService();
        menuService.addItem(menuItem);
        menuService.removeItem(menuItem);

        IOrderService orderService = new OrderService();
        orderService.addItems(menuItem);
        orderService.createOrder(order);
        orderService.updateStatus(order);
        orderService.calculateTotal(order);




        Payment payment = new Payment(1, 1, "Processing", "UPI");

        PaymentStrategy paymentStrategy = getPaymentStrategy(payment);
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(paymentStrategy);
        paymentService.pay(payment);
    }

    private static PaymentStrategy getPaymentStrategy(Payment payment) {
        PaymentStrategy paymentStrategy;
        if(payment.getPaymentMethod() == "UPI") {
            paymentStrategy = new UPIPayment();
        }
        else {
            paymentStrategy = new CreditCardPayment();
        }
        return paymentStrategy;
    }
}
