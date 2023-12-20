package Starting1;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //System.out.println("Type start to begin: ");
     Scanner sc= new Scanner(System.in);
     Scanner sc1=new Scanner(System.in);
     String ns;
     int x;
     do{
         System.out.println("Tell me your age:");
         x= sc1.nextInt();
         System.out.println("your age is: "+x);
         System.out.println("type start to repeat");
         ns=sc.nextLine();
     }while (ns.equals("start"));


    }
}