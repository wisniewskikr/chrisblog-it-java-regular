public class App {

    public static void main(String[] args) {

        Prototype prototype = new Prototype("Hello World!");
        Prototype clone = prototype.clone();

        System.out.println("Prototype message: " + prototype.getMessage());
        System.out.println("Clone message: " + clone.getMessage());

        clone.setMessage("Hello Clone!");

        System.out.println("Prototype message: " + prototype.getMessage());
        System.out.println("Clone message: " + clone.getMessage());
        
    }
}
