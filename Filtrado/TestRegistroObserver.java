import java.util.List;

public class TestRegistroObserver implements UtilidadObserver {

    /**
     *
     * @param registro
     */
    public boolean esValido(RegistroObserved registro) {

        // Comprueba si el registro observado es válido
        if (registro.satisfaceCriterio()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<RegistroObserved> filtrar(List<Object> objetos, String criterio) {
        List<RegistroObserved> listaFiltrada = null;

        // Comprueba que el Registro es válido conforme al criterio elegido
        for (int i = 0; i < objetos.size(); i++) {
            if (esValido((RegistroObserved) objetos.get(i)) && (criterio == "criterioElegido")) {
                listaFiltrada.add((RegistroObserved) objetos.get(i));
            }
        }

        return listaFiltrada;
    }
}



