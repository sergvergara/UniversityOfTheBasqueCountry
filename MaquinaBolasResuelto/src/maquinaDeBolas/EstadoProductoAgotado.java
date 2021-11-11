package maquinaDeBolas;

public class EstadoProductoAgotado implements EstadoMaquina {
    private IMaquinaEstados maquinaBolas;

    public EstadoProductoAgotado(IMaquinaEstados pMaquina) {
        maquinaBolas = pMaquina;
    }

    @Override
    public void entregarProducto() {

        // TODO Auto-generated method stub
    }

    @Override
    public void expulsarMoneda() {
        rellenarMaquina();
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
        System.out.println("Rellenando la máquina");
        maquinaBolas.rellenarDeBolas();
        maquinaBolas.setEstado(new EstadoInicial(maquinaBolas));
    }
}



