package maquinaDeBolas;

import java.util.Random;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        // Caso Inicial la máquina no tiene bolas
        // MaquinaBolas mBolas = new MaquinaBolas (0);
        // Caso Inicial la máquina tiene bolas
        MaquinaBolas mBolas = new MaquinaBolas(100);

        mBolas.insertarMoneda();
        mBolas.pulsarBoton();

        if (mBolas.getUnidadesDisponibles() > 0) {
            mBolas.entregarProducto();
        } else {
            mBolas.expulsarMoneda();
            mBolas.rellenarDeBolas();
        }
    }
}



