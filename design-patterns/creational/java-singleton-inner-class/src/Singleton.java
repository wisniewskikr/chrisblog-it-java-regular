

public class Singleton {

    private Singleton() {}

    private static class SingletonInnerClass {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInnerClass.instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

}