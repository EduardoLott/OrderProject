package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enum.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date: ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Enter #" +i+ " item data");
            System.out.print("Product name: ");
            String pName = sc.next();
            System.out.print("Product Price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            Product product = new Product(pName, productPrice);

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
