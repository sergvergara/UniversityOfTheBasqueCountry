package maquinaDeBolas;

public interface EstadoMaquina {
    public abstract void entregarProducto();

    /*
     * Se ha pulsado el botón devolver dinero
     */
    public abstract void expulsarMoneda();

    /*
     * Se ha introducido una moneda de 20 céntimos. Modelar lo que ocurre
     */
    public abstract void insertarMoneda();

    /*
     * Se ha pulsado el botón Comprar
     */
    public abstract void pulsarBoton();

    public abstract void rellenarMaquina();
}



