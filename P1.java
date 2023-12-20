package Starting1;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Input your age: ");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine(); //It receives an string, so its time to change it to an integer:
        int age=Integer.parseInt(s);

        if(age>=18){
            System.out.println("Input your fav food: ");
            String food=sc.nextLine();
            if(food.equals("pizza"))
            {
                System.out.println("Mine too");
            }else{
                System.out.println("Sorry for that");
            }
        }
        else if (age>=13){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("Your are a child");
        }
    }
}
