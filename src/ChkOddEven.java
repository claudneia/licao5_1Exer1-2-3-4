import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 2;
        System.out.print("Digite um numero inteiro: ");
        num = in.nextInt();
        if(num%2 == 0){
          System.out.print("O numero e par");
        } else{
            System.out.println("O numero e impar");
        }
        
       
        
    }
}
