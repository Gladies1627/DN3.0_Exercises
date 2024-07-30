import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product(1, "Laptop", 10, 999.99);
        Product product2 = new Product(2, "Smartphone", 20, 499.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        System.out.println(inventory);

        inventory.updateProduct(1, "Gaming Laptop", 5, 1299.99);
        System.out.println(inventory);

        inventory.deleteProduct(2);
        System.out.println(inventory);
    }
}
