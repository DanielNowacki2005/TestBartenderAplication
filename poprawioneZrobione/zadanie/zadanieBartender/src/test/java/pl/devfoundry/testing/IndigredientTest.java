package pl.devfoundry.testing;
import org.example.Bartender;
import org.example.Drink;
import org.junit.Indgredient;
import static org.junit.Assert.*;
public class org.junit.IndigredientTest.java {
    @Test
    public void checkIfordersHaSomething(){
        Indgredient indi = new Indgredient(2,2,2,2,4,2);
        assertNotNull("userId is empty",indi);

    }

}
