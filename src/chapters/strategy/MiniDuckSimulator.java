package chapters.strategy;

import chapters.strategy.ducks.Duck;
import chapters.strategy.ducks.MallardDuck;
import chapters.strategy.ducks.ModelDuck;
import chapters.strategy.flybehaviors.FlyRocketPowered;

public class MiniDuckSimulator {

    /**
     * The Strategy Pattern defines a family of algorithms,
     * encapsulates each one, and makes them interchangeable. Strategy
     * lets the algorithm vary independently of clients that use it.
     */

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("************************************");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
