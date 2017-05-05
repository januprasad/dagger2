package example.jenuine.dagger2;

import android.app.Application;

/**
 * Created by jenuprasad on 05/05/17.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CoffeeMachineComponent coffeeMachine = DaggerCoffeeMachineComponent
                .builder()
                .coffeeMachineModule(new CoffeeMachineModule())
                .build();
        coffeeMachine.getCoffee();
    }
}
