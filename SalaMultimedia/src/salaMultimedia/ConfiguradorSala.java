package salaMultimedia;

public class ConfiguradorSala {
    private ConfiguradorSala mConfiguradorFacade;
    private Amplificador     amplificador;
    private Proyector        proyector;
    private Pc               pc;
    private ReproductorDVD   reproductorDVD;

    enum Modo { video, charla }

    ;
    private ConfiguradorSala() {
        mConfiguradorFacade = new ConfiguradorSala();
        amplificador        = new Amplificador("Volumen");
        proyector           = new Proyector();
        pc                  = new Pc();
        reproductorDVD      = new ReproductorDVD();

        throw new UnsupportedOperationException();
    }

    public void configurar(Modo mode) {
        if (Modo.charla == mode) {
            Charla charla = new Charla();

            this.proyector.encender();
            this.amplificador.encender();
            this.pc.on();
        }

        if (Modo.video == mode) {
            ProyeccionPelicula charla = new ProyeccionPelicula();

            this.proyector.encender();
            this.amplificador.encender();
            this.reproductorDVD.encender("PANTALLAANCHA");
        }

        throw new UnsupportedOperationException();
    }

    public static ConfiguradorSala getConfigurador(String modo) {
        throw new UnsupportedOperationException();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
