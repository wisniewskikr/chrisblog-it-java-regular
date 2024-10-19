public class Main {

    public static void main(String[] args) {

        Element[] elements = { new ElementA(), new ElementB() };

        // Create a visitor
        Visitor visitor = new ConcreteVisitor();

        // Let the visitor visit each element
        for (Element element : elements) {
            element.accept(visitor);
        } 

    }
}
