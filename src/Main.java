import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();
        Animal[] animals = {shark, turtle, eagle};

        for (Animal animal : animals) {
            if (animal instanceof Shark shark1){
                Shark[] sharks = {shark1};
                System.out.println("sharks = " + Arrays.toString(sharks));
                System.out.println(shark1.attack());
            }
        }
        System.out.println();

        for (Animal animal : animals) {
            if (animal instanceof Turtle turtle1){
                Turtle[] turtles = {turtle1};
                System.out.println("turtles = " + Arrays.toString(turtles));
                System.out.println(turtle1.swim());
            }
        }
        System.out.println();

        for (Animal animal : animals) {
            if (animal instanceof Eagle eagle1){
                Eagle[] eagles = {eagle1};
                System.out.println("eagles = " + Arrays.toString(eagles));
                System.out.println(eagle1.fly());
            }
        }
    }
}