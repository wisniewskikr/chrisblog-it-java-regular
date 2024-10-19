

class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        System.out.println(elementA.helloA());
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println(elementB.helloB());
    }
}