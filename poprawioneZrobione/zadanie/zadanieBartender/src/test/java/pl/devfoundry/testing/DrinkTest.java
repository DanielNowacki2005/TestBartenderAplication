package pl.devfoundry.testing;


import org.example.Bartender;
import org.example.Drink;
import org.junit.Indgredient;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DrinkTest {


    @Test
    public void CheckIfDrinkNotNull(){
        Drink newdrink = new Drink();
        assertNotNull("userId is empty",newdrink);

    }

}
