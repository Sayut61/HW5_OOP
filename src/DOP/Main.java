package DOP;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Animal("Васька", 12, true);
        Animal fish = new Animal("Васька", 12, true);
        System.out.println(bird.toString());
        System.out.println(bird.hashCode());
        System.out.println(fish.toString());
        System.out.println(fish.hashCode());
        System.out.println(bird.equals(fish));
    }
}
