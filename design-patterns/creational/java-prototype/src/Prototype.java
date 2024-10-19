

public class Prototype {

    private String message;

    public Prototype(String message) {
        this.message = message;
    }

    public Prototype clone() {
        return new Prototype(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }        

}