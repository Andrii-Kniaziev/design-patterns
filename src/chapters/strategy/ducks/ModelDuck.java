package chapters.strategy.ducks;

import chapters.strategy.flybehaviors.FlyNoWay;
import chapters.strategy.quackbehaviors.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m a model duck!");
    }
}
