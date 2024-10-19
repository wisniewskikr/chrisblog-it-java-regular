public class App {

    public static void main(String[] args) {

        Pizza pizza = new Pizza.PizzaBuilder("Large")
                .cheese(true)
                .pepperoni(true)
                .mushrooms(false)
                .build();

        System.out.println(pizza);
        
    }
}
