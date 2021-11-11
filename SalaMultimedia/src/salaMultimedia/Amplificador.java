package salaMultimedia;

public class Amplificador {
    private String         description;
    private ReproductorDVD dvd;
    private Pc             pc;

    public Amplificador(String description) {
        this.description = description;
    }

    public void encender() {

        // TODO - implement Amplificador.encender
        throw new UnsupportedOperationException();
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void on() {
        System.out.println(description + " on");
    }

    /**
     *
     * @param anchoPantalla
     */
    public void proyectar(String anchoPantalla) {

        // TODO - implement Amplificador.proyectar
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return description;
    }

    public void setDvd(ReproductorDVD dvd) {
        System.out.println(description + " setting DVD player to " + dvd);
        this.dvd = dvd;
    }

    public void setInputDVD() {
        System.out.println("Input is DVD");
    }

    public void setInputPC() {
        System.out.println("Input is PC");
    }

    public void setPC(Pc pc) {
        this.pc = pc;
    }

    public void setStereoSound() {
        System.out.println(description + " stereo mode on");
    }

    public void setSurroundSound() {
        System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
