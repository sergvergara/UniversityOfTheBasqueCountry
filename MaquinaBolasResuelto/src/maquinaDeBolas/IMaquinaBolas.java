package maquinaDeBolas;

public interface IMaquinaBolas {

    /*
     * (non-Javadoc)
     *
     * @see EstadoMaquina#entregarProducto()
     */
    public abstract void entregarProducto();

    /*
     * Se ha pulsado el botón devolver dinero
     */

    /*
     * (non-Javadoc)
     *
     * @see EstadoMaquina#expulsarMoneda()
     */
    public abstract void expulsarMoneda();

    /*
     * Se ha introducido una moneda de 20 céntimos. Modelar lo que ocurre
     */

    /*
     * (non-Javadoc)
     *
     * @see EstadoMaquina#insertarMoneda()
     */
    public abstract void insertarMoneda();

    /*
     * Se ha pulsado el botón Comprar
     */

    /*
     * (non-Javadoc)
     *
     * @see EstadoMaquina#pulsarBoton()
     */
    public abstract void pulsarBoton();

    /*
     * (non-Javadoc)
     *
     * @see EstadoMaquina#rellenarMaquina()
     */
    public abstract void rellenarMaquina();
}



