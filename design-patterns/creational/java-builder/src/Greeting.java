

public class Greeting {
    
    private String message;

    private Greeting(GreetingBuilder builder) {
        message = builder.sb.toString();
    }

    public String getMessage() {
        return message;
    }

    public static class GreetingBuilder {

        private StringBuilder sb = new StringBuilder();

        public GreetingBuilder addWord(String word) {
            sb.append(word);
            return this;
        }

        public GreetingBuilder addSpace() {
            sb.append(" ");
            return this;
        }

        public GreetingBuilder addExclamationMark() {
            sb.append("!");
            return this;
        }

        public Greeting build() {
            return new Greeting(this);
        }

    }

}