import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int y = 18;
     boolean drivingUnderAge = false;
     
     
     System.out.print("Insira sua idade atual: ");
     int x = ler.nextInt();
     
       if(x<=y){
           System.out.println(drivingUnderAge);
       }else{
           System.out.println("true");
                   }
    }
}
