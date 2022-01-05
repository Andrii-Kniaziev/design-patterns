package chapters.strategy.ducks;

import chapters.strategy.flybehaviors.FlyWithWings;
import chapters.strategy.quackbehaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m a real Mallard duck!");
    }
}
