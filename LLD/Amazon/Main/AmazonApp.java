package Main;

import Model.Cart.Cart;
import Model.Order.Order;
import Model.Product.Product;
import Model.User.User;
import Service.Admin.AdminService;
import Service.Admin.IAdminService;
import Service.Cart.CartService;
import Service.Cart.ICartService;
import Service.Order.IOrderService;
import Service.Order.OrderService;
import Service.Payment.IPaymentService;
import Service.Payment.PaymentService;
import Service.Product.IProductService;
import Service.Product.ProductService;
import Service.Shopping.IShoppingService;
import Service.Shopping.ShoppingService;
import Service.User.IUserService;
import Service.User.UserService;

public class AmazonApp {
    public static void main(String[] args) {
        User user = new User(1,"Kohli", "Kohli@gmail.com", "111");
        Product product = new Product(1, "Bat", "Bat", 100.00, 12);
        Cart cart = new Cart(1, "Bat");
        Order order = new Order(1, user, "Bat", 100.00);

        IUserService userService = new UserService();
        userService.register();
        userService.login(user);

        IProductService productService = new ProductService();
        productService.updateStock(product);

        ICartService cartService = new CartService();
        cartService.addItem();
        cartService.removeItem();
        cartService.calculateTotal();

        IOrderService orderService = new OrderService();
        orderService.createOrder(order);
        orderService.trackOrder(order);

        IPaymentService paymentService = new PaymentService();
        paymentService.processPayment();

        IShoppingService shoppingService = new ShoppingService();
        shoppingService.addToCart();
        shoppingService.checkout();
        shoppingService.placeOrder(order);

        IAdminService adminService = new AdminService();
        adminService.manageProduct(product);
        adminService.viewOrders(order);
    }
}
