package chapters.strategy.quackbehaviors;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Real duck quacking!");
    }
}
