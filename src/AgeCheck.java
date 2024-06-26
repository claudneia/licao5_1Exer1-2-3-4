import java.util.Scanner;
public class AgeCheck {
   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int myAge = ler.nextInt();  // I am 19; let me see if I can drive yet;
        
        if (myAge >= 16) {
            System.out.println("I'm old enough to have a driver's license!");
        }else {
          
            System.out.println("I'm not old enough yet... :*(");
        }
    }
}
    

