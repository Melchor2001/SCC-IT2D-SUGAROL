
package melchor;
import java.util.Scanner;
public class product {


public void manageProduct() {
Scanner sc = new Scanner(System.in);
products[] pd = new products[100];
int count = 0;
String choice;

do {
System.out.println("--------------------------");
System.out.println("WELCOME TO PRODUCT APP");
System.out.println("--------------------------");
System.out.println("1. ADD PRODUCT");
System.out.println("2. VIEW PRODUCTS");
System.out.println("3. EDIT PRODUCT");
System.out.println("4. DELETE PRODUCT");
System.out.println("5. EXIT");
System.out.println("--------------------------");

System.out.print("Enter Option: ");
int option = sc.nextInt();

while (option > 5 || option < 1) {
System.out.print("Invalid Selection, Try Again: ");
option = sc.nextInt();
}

switch (option) {
case 1:
System.out.print("Enter number of Products: ");
int numProducts = sc.nextInt();

for (int i = 0; i < numProducts; i++) {
System.out.println("Enter details of product " + (i + 1) + ":");
System.out.print("ID: ");
int id = sc.nextInt();
System.out.print("Name: ");
String name = sc.next();
System.out.print("Price: ");
double price = sc.nextDouble();
System.out.print("Quantity: ");
int quantity = sc.nextInt();
pd[count]=new products();
pd[count].Prods(id, name, price, quantity);
count++;
}
break;

case 2:
for (int i = 0; i < count; i++) {
pd[i].viewProduct();
}
break;

case 3:
System.out.print("Enter ID of the Product to edit: ");
int editId = sc.nextInt();

for (int i = 0; i < count; i++) {
if (pd[i].getId() == editId) {
System.out.print("New Price: ");
double newPrice = sc.nextDouble();
System.out.print("New Quantity: ");
int newQuantity = sc.nextInt();
pd[i].editProduct(newPrice, newQuantity);
break;
}
}
break;

case 4:
System.out.print("Enter ID of the Product to delete: ");
int deleteId = sc.nextInt();

for (int i = 0; i < count; i++) {
if (pd[i].getId() == deleteId) {
pd[i] = null; // Mark the product for deletion
System.out.println("Product deleted.");
break;
}
}
break;
}

System.out.print("Want to continue (yes/no)?: ");
choice = sc.next();
} while (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"));
}
}