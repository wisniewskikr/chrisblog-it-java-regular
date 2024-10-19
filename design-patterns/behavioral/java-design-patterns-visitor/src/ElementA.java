

class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String helloA() {
        return "Hello from ElementA!";
    }
}