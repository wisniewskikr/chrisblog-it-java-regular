public class App {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Singleton 1 hash code: " + singleton1.hashCode());
        System.out.println("Singleton 2 hash code: " + singleton2.hashCode());

        singleton1.showMessage();
        
    }
}
