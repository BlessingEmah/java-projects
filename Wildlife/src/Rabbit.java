public class Rabbit implements Prey, Predator {

    @Override
    public void hunt() {
        System.out.println("the rabbit is hunting for food");
    }

    @Override
    public void flee() {
        System.out.println("the rabbit is fleeing from predators");
    }
}
