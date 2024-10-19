

public class Pizza {

    private final String size; // e.g., "Small", "Medium", "Large"
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;

    // Constructor is private to force the use of the builder
    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }

    // Getters
    public String getSize() {
        return size;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public boolean hasPepperoni() {
        return pepperoni;
    }

    public boolean hasMushrooms() {
        return mushrooms;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", mushrooms=" + mushrooms +
                '}';
    }

    // Inner Builder class
    public static class PizzaBuilder {
        private final String size; // Required parameter
        private boolean cheese;     // Optional parameter
        private boolean pepperoni;  // Optional parameter
        private boolean mushrooms;   // Optional parameter

        public PizzaBuilder(String size) {
            this.size = size;
        }

        public PizzaBuilder cheese(boolean value) {
            cheese = value;
            return this;
        }

        public PizzaBuilder pepperoni(boolean value) {
            pepperoni = value;
            return this;
        }

        public PizzaBuilder mushrooms(boolean value) {
            mushrooms = value;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
    
}