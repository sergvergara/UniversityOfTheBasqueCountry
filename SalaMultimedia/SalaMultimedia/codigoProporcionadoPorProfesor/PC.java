public class PC {
    private String description;

    public PC(String description) {
        this.description = description;
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void startPresentation() {
        System.out.println("Presentation started");
    }

    public String toString() {
        return description;
    }
}



