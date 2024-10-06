package Main;

import Model.Admin.Admin;
import Model.Cart.Cart;
import Model.Order.Order;
import Model.Payment.Payment;
import Model.Product.Product;
import Model.User.User;
import Service.Admin.AdminService;
import Service.Admin.IAdminService;
import Service.Cart.CartService;
import Service.Cart.ICartService;
import Service.Order.IOrderService;
import Service.Order.OrderService;
import Service.Payment.CreditCardPayment;
import Service.Payment.PaymentService;
import Service.Payment.PaymentStrategy;
import Service.Payment.UPIPayment;
import Service.Product.IProductService;
import Service.Product.ProductService;
import Service.User.IUserService;
import Service.User.UserService;

public class AmazonApp {
    public static void main(String [] args) {
        User user1 = new User(1, "customer", "customer@gmail.com", "password");
        User user2 = new User(1, "seller", "seller@gmail.com", "password");

        Admin admin = new Admin(user2.getUserID(), user2.getName(), user2.getEmail(), user2.getPasswordHash());
        Product product = new Product(1, "Bat", "Bat", 100.00, 12);
        Cart cart = new Cart(1, 1);
        Order order = new Order(1, 1, 100.00);
        Payment payment = new Payment(1,1, "Processing", "CREDIT_CARD");


        IUserService userService = new UserService();
        userService.register();
        userService.login(user1);
        userService.login(user2);
        userService.updateProfile(user1);
        userService.updateProfile(user2);

        IProductService productService = new ProductService();
        productService.addProduct(product);
        productService.updateProduct(product);
        productService.removeProduct(product);

        ICartService cartService = new CartService();
        cartService.addToCart(cart);
        cartService.viewCart(cart);
        cartService.removeFromCart(cart);

        IOrderService orderService = new OrderService();
        orderService.placeOrder(order);
        orderService.trackOrder(order);
        orderService.cancelOrder(order);

        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy UPI = new UPIPayment();
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(creditCard);
        paymentService.processPayment(payment);

        paymentService.setPaymentStrategy(UPI);
        paymentService.processPayment(payment);

        IAdminService adminService = new AdminService();
        adminService.addProduct(admin, product);
        adminService.manageInventory(admin);
    }
}
