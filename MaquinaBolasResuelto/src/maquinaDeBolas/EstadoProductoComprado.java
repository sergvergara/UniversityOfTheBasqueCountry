package maquinaDeBolas;

public class EstadoProductoComprado implements EstadoMaquina {
    private IMaquinaEstados maquinaBolas;

    public EstadoProductoComprado(IMaquinaEstados pMaquina) {
        maquinaBolas = pMaquina;
    }

    @Override
    public void entregarProducto() {
        System.out.println("Estregando la bola de chicle");
        maquinaBolas.expulsarProducto();

        if (maquinaBolas.getUnidadesDisponibles() > 0) {
            maquinaBolas.setEstado(new EstadoInicial(maquinaBolas));
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



