package salaMultimedia;

public class Pc {
    private String description;

    public void PC(String description) {
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



