package chapters.strategy.flybehaviors;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Use wings to fly!");
    }
}
