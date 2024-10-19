public class Main {

    public static void main(String[] args) {

        Element[] elements = { new ElementA(), new ElementB() };

        Visitor visitor = new MessageVisitor();

        for (Element element : elements) {
            element.accept(visitor);
        } 

    }
}
