

public class HelloWorldProxy implements HelloWorld {
    private HelloWorld realHelloWorld;

    public HelloWorldProxy(HelloWorld realHelloWorld) {
        this.realHelloWorld = realHelloWorld;
    }

    @Override
    public void sayHello() {
        System.out.println("Proxy: Logging before saying hello...");

        // Delegate the call to the real object
        realHelloWorld.sayHello();

        System.out.println("Proxy: Logging after saying hello...");
    }
}