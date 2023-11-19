public class Turtle extends Animal{

    public String swim(){
        return "turtle plavaet";
    }

    @Override
    public String toString() {
        return "Turtle{} " + super.toString();
    }
}
