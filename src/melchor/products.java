
package melchor;
public class products {
        private int id;
        private String name;
        private double price;
        private int quantity;

        public void Prods(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        }

        public int getId() {
        return id;
        }

        public void viewProduct() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
        }

        public void editProduct(double newPrice, int newQuantity) {
        this.price = newPrice;
        this.quantity = newQuantity;
        System.out.println("Product updated.");
            }
}