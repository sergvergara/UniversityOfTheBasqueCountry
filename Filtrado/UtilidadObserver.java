import java.util.List;

public interface UtilidadObserver {

    /**
     *
     * @param objetos
     * @param criterio
     */
    List<RegistroObserved> filtrar(List<Object> objetos, String criterio);
}



