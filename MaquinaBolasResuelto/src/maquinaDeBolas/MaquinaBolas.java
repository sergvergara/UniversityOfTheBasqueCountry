package maquinaDeBolas;

public class MaquinaBolas implements IMaquinaBolas, IMaquinaEstados {

    // Atributos de la máquina
    private int           numBolas      = 0;
    private final int     MAX_CAPACIDAD = 100;
    private EstadoMaquina estadoActual;

    public MaquinaBolas(int pNumBolas) {
        if (pNumBolas > 0) {
            numBolas = pNumBolas;
            setEstado(new EstadoInicial(this));
        } else {
            setEstado(new EstadoProductoAgotado(this));
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see EstadoMaquina#entregarProducto()
     */

    /*
     *  (non-Javadoc)
     * @see IMaquinaBolas#entregarProducto()
     */
    @Override
    public void entregarProducto() {
        estadoActual.entregarProducto();
    }

    /*
     * Se ha pulsado el botón devolver dinero
     */

    /*
     * (non-Javadoc)
     *
     * @see EstadoMaquina#expulsarMoneda()
     */

    /*
     *  (non-Javadoc)
     * @see IMaquinaBolas#expulsarMoneda()
     */
    @Override
    public void expulsarMoneda() {
        estadoActual.expulsarMoneda();
    }

    /*
     * Este método podríamos eliminarlo, pero lo he separado para contemplar
     * aquellos casos en los que se puede realizar la operación y no
     */

    /*
     *  (non-Javadoc)
     * @see IMaquinaEstados#expulsarProducto()
     */
    @Override
    public void expulsarProducto() {
        if (numBolas > 0) {
            numBolas--;
        }
    }

    // Métodos de la máquina

    /*
     * Se ha introducido una moneda de 20 céntimos. Modelar lo que ocurre
     */

    /*
     * (non-Javadoc)
     *
     * @see EstadoMaquina#insertarMoneda()
     */

    /*
     *  (non-Javadoc)
     * @see IMaquinaBolas#insertarMoneda()
     */
    @Override
    public void insertarMoneda() {
        estadoActual.insertarMoneda();
    }

    /*
     * Se ha pulsado el botón Comprar
     */

    /*
     * (non-Javadoc)
     *
     * @see EstadoMaquina#pulsarBoton()
     */

    /*
     *  (non-Javadoc)
     * @see IMaquinaBolas#pulsarBoton()
     */
    @Override
    public void pulsarBoton() {
        estadoActual.pulsarBoton();
    }

    // Este otro para proceder a añadir las bolas

    /*
     *  (non-Javadoc)
     * @see IMaquinaEstados#rellenarDeBolas()
     */
    @Override
    public void rellenarDeBolas() {
        numBolas = MAX_CAPACIDAD;
    }

    /*
     * (non-Javadoc)
     *
     * @see EstadoMaquina#rellenarMaquina()
     */

    /*
     *  (non-Javadoc)
     * @see IMaquinaBolas#rellenarMaquina()
     */
    @Override
    public void rellenarMaquina() {
        estadoActual.rellenarMaquina();
    }

    // Necesitamos este método para poder modificar el estado actual

    /*
     *  (non-Javadoc)
     * @see IMaquinaEstados#setEstado(EstadoMaquina)
     */
    @Override
    public void setEstado(EstadoMaquina pNuevoEstado) {
        estadoActual = pNuevoEstado;
    }

    @Override
    public int getUnidadesDisponibles() {
        return numBolas;
    }
}



