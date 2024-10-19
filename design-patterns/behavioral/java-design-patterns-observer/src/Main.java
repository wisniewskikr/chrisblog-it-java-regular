public class Main {

    public static void main(String[] args) {

        Subject subject = new Subject();
        subject.addObserver(new ConcreteObserver1());
        subject.addObserver(new ConcreteObserver2());

        subject.setMessage("Hello, World!");  

    }
}
