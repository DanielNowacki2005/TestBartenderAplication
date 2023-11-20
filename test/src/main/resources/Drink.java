import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drink {
    int n = 0;
    String in = "";
    int amount = 0;
    Scanner sc = new Scanner(System.in);
    public Drink() {
        System.out.println("wpisz liczbę składników");
        int amountIn = sc.nextInt();
        List<Indgredient> indgredient =  new ArrayList<Indgredient>();
        for(int i = 0; i < amountIn;i++){
            System.out.println("wpisz składnik");
            in = sc.next();
            System.out.println("wpisz ilość");
            amount = sc.nextInt();
            Indgredient neww = new Indgredient(in,amount);
            indgredient.add(neww);
            System.out.println(" ind: "+indgredient);
        }

    }




}
