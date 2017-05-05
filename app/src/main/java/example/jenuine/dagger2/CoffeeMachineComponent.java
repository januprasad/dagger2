package example.jenuine.dagger2;

import dagger.Component;

/**
 * Created by jenuprasad on 05/05/17.
 */

@Component(modules = CoffeeMachineModule.class)
public interface CoffeeMachineComponent {
    public Coffee getCoffee();
}
