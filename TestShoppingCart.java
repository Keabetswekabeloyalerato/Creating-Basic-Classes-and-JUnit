import java.util.Scanner;

public class TestShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();
        System.out.println("How many items would you like to add to your Shopping Cart?:");
        
        int numItems= scanner.nextInt();
       
        if (numItems==0){
        System.out.println("Your Shopping Cart is empty.");
        }
        else{
         for ( int i=0; i<numItems;i++){
          System.out.println("Enter the Product Name:");
          String productName= scanner.next();
          System.out.println("Enter the Quantity:");
          int quantity=scanner.nextInt();
          System.out.println("Enter the Unit Cost:");
          double unitCost=Double.parseDouble(scanner.next());
          
          Item newItem= new Item(productName,quantity,unitCost);
          shoppingCart.addItems(newItem);
          }
          System.out.println("The Shopping Cart has the following items:");
          shoppingCart.queryCart();
          shoppingCart.getDiscount("WELCOME20");
          System.out.println("--- Shopping Cart with all items ---");
          shoppingCart.printInvoice();
          }
          scanner.close();
               
         

        
 }
}