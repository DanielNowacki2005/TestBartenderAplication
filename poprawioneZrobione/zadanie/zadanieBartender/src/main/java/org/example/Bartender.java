import java.util.Scanner;

public class Barman {
        boolean active;

    public Barman(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void createDrink(){
        Drink drink = new Drink();


    }
}