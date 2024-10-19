public class Main {

    public static void main(String[] args) {

        HelloWorld realHelloWorld = new HelloWorldReal();
        HelloWorld proxy = new HelloWorldProxy(realHelloWorld);
        proxy.sayHello();

    }
}
