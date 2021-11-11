public class Cliente {
    public static void main(String[] args) {
        Mando mando = new Mando();

        mando.encender();        // Botón encender
        mando.apagar();          // Botón apagar
        mando.subirVolumen();    // Botón subir volumen()
        mando.bajarVolumen();    // Botón bajar volumen()

        MandoModoDVD mandoModoDVD = new MandoModoDVD();    // Botón modo radio-dvd

        mandoModoDVD.reproducir();    // Botón reproducir DVD
        mandoModoDVD.detener();       // Botón detener DVD

        MandoModoRadio mandoModoRadio = new MandoModoRadio();    // Botón modo radio-dvd
    }
}



