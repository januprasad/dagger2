package example.jenuine.dagger2;

import javax.inject.Inject;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by jenuprasad on 05/05/17.
 */

@Module
public class CoffeeMachineModule {

    CoffeeMachine coffeeMachine;

    CoffeeMachineModule(){
        coffeeMachine = new CoffeeMachine();
    }


    @Provides
    public Coffee getCoffee() {
        return coffeeMachine.getCoffee();
    }
}

