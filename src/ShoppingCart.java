import java.util.Scanner;
public class ShoppingCart {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String custName = "Mary Smith";
        String itemDesc = "camisa";
        boolean outOfStock = true; 
       
	// numeric fields
        double price = 21.99;
        double tax = 1.04;
        System.out.print("Digite a quantidade desejada: ");
        int quantity = ler.nextInt();
        double total = quantity+(price*tax);
        String message = custName+" quer comprar "+quantity+" "+itemDesc+" que custa: "+total;
        int estoque = 2 - quantity;
        
        if(quantity >= 2){
            itemDesc+="s";
            System.out.println(message);
            if(estoque<1)
             System.out.println("O item nnao esta dispponivel.");
           }else{
           
            System.out.println(message);
        if(quantity<1){
            System.out.println("O item não está disponivel"+message);
            if(estoque<1){
            System.out.println("O item nao esta disponivel.");
            }
        }    
        }

	// Calculating total cost
        total = (price*quantity)*tax;

        
        // Declare outOfStock variable and initialize it
        
        
        // Test quantity and modify message if quantity > 1.  
         
        
        // Test outOfStock and notify user in either case.  
        
        
        
    }
    
}


