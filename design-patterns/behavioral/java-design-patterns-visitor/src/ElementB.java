

class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String helloB() {
        return "Hello from ElementB!";
    }
}