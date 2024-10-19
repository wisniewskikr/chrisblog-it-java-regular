

class MessageVisitor implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        System.out.println("Hello World, " + elementA.getName() + "!");
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("Hello World, " + elementB.getName() + "!");
    }
}