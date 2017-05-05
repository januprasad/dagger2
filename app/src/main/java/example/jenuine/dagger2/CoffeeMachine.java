package example.jenuine.dagger2;

/**
 * Created by jenuprasad on 05/05/17.
 */

public class CoffeeMachine {

    private Coffee coffee;

    public CoffeeMachine() {
        coffee = new Coffee();
    }

    public Coffee getCoffee() {
        return coffee;
    }
}
