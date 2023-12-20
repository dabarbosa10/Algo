package Starting1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    //Collection of unordered elements that are unique
        Set<Integer> t=new HashSet<Integer>();
        t.add(5);
        t.add(7);
        t.add(0);
        t.add(-8);
        t.add(5);

        boolean x=t.contains(2);
        System.out.println("The set is: "+ t);
        System.out.println("Does it contains the number 8? " + t.contains(-8)+" the number 2 is in the set? "+ x+ " the size of the list is: "+ t.size());

        //List
        ArrayList<Double> ns= new ArrayList<Double>();
        ns.add(1.1);
        ns.add(2.1);
        System.out.println("The ArrayList is: "+ ns);
        System.out.println("------------------------------");
        System.out.println("First Element is: "+ns.get(0));
        System.out.println("------------------------------");
        ns.set(0,3.14);
        System.out.println("Changing the first element of the list to 3.14 and printing the new ArrayList: "+ ns);
        



    }
}