package maquinaDeBolas;

public class EstadoCompradoConPremio implements EstadoMaquina {
    private IMaquinaEstados maquinaBolas;

    public EstadoCompradoConPremio(IMaquinaEstados pMaquinaBolas) {
        maquinaBolas = pMaquinaBolas;
    }

    @Override
    public void entregarProducto() {
        System.out.println("Estregando la bola de chicle");
        maquinaBolas.expulsarProducto();

        if (maquinaBolas.getUnidadesDisponibles() > 0) {
            maquinaBolas.expulsarProducto();

            if (maquinaBolas.getUnidadesDisponibles() > 0) {
                maquinaBolas.setEstado(new EstadoInicial(maquinaBolas));
            } else {
                maquinaBolas.setEstado(new EstadoProductoAgotado(maquinaBolas));
            }
        } else {
            maquinaBolas.setEstado(new EstadoProductoAgotado(maquinaBolas));
        }
    }

    @Override
    public void expulsarMoneda() {

        // TODO Auto-generated method stub
    }

    @Override
    public void insertarMoneda() {

        // TODO Auto-generated method stub
    }

    @Override
    public void pulsarBoton() {

        // TODO Auto-generated method stub
    }

    @Override
    public void rellenarMaquina() {

        // TODO Auto-generated method stub
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
