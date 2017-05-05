package example.jenuine.dagger2;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

/**
 * Created by jenuprasad on 05/05/17.
 */

public class CoffeeMachineTest {
    @Test
    public void testCoffeeMachine() {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        //Check that an object isn't null
        assertNotNull(coffeeMachine.getCoffee());

        CoffeeMachineComponent coffeeMachine1 = DaggerCoffeeMachineComponent
                .builder()
                .coffeeMachineModule(new CoffeeMachineModule())
                .build();


        assertNotNull(coffeeMachine1.getCoffee());
    }
}
