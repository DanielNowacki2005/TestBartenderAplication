//User and Customer are one and the same
package pl.devfoundry.testing;

import org.example.Bartender;
import org.example.Drink;
import org.junit.Indgredient;

import static org.junit.Assert.*;

public class BartdenerTest {

    @Test
    public void checkIfBartenderIsActive(){
        //given
        Bartender bartender = new Bartender( true);
        bartender.setActive(false);
        assertFalse("check if new bartender is active",bartender.isActive());

        System.out.println("bartender nie jest aktywny");
    }
    @Test
    public void checkIfBartenderIsActiveAfter(){
        //given
        Bartender bartender = new Bartender( true);
        bartender.setActive(false);
        assertFalse(bartender.isActive());
        //when
        bartender.activate();
        bartender("check if new bartender is active",bartender.isActive());
    }
    @Test
    public void checkIfBartenderCanUseDrinkFunction(){
        Bartender bartender = new Bartender( true);

        assertFalse(bartender.isActive());
        //when
        bartender.activate();
        assertTrue("check if new bartender is active",bartender.isActive());
        //then
        bartender.createDrink();

    }
}
