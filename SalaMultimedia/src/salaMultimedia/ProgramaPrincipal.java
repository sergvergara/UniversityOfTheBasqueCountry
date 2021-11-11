package salaMultimedia;

import salaMultimedia.ConfiguradorSala.Modo;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        // Sólo puede invocarse una vez al tener constructor privado, con lo ue se representa el hecho de que sólo una configración sea
        // posible a la vez
        ConfiguradorSala configuradorSala = ConfiguradorSala.getConfigurador("charla");

        configuradorSala.configurar(Modo.charla);
    }
}



