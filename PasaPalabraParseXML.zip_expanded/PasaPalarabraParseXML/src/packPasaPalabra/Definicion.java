package packPasaPalabra;

import java.util.ArrayList;
import java.util.List;

public class Definicion {
    private String       enunciado;
    private List<String> listaRespuestas;

    public Definicion(String pPreg) {
        enunciado       = pPreg;
        listaRespuestas = new ArrayList<String>();
    }

    public void addRespuesta(String pRes) {
        listaRespuestas.add(pRes);
    }

    @Override
    public String toString() {
        String texto = String.format("Enunciado: %1$s\n", enunciado);

        for (String resp : listaRespuestas) {
            texto += String.format("\t\tRespuesta: %1$s\n", resp);
        }

        return texto;
    }
}



