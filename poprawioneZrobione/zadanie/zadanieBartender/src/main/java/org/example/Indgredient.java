import java.util.Scanner;

public class Indgredient {
    private String name = "";
    private int amount = 0;
    Scanner sc = new Scanner(System.in);

    public Indgredient(String name, int amount) {
        this.name = sc.next();
        this.amount = sc.nextInt();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}