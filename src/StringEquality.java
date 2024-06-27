import java.util.Scanner;
  public class StringEquality {
   public static void main(String[]args){
      Scanner ler = new Scanner(System.in);
   
   System.out.println("Digite um nome para a variavel: ");
   String var1 = ler.nextLine();
   String a = "moe";
   if(var1.equals(a)){
  System.out.println("Voce e o rei do Rock an roll.");
   }else{
      System.out.println("Voce nao e o rei.");
          }
 
   
   }
}

