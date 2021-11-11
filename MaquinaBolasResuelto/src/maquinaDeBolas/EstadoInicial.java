package maquinaDeBolas;

public class EstadoInicial implements EstadoMaquina {
    private IMaquinaEstados maquinaBolas;

    public EstadoInicial(IMaquinaEstados pMaquina) {
        maquinaBolas = pMaquina;
    }

    @Override
    public void entregarProducto() {

        // TODO Auto-generated method stub
    }

    @Override
    public void expulsarMoneda() {

        // TODO Auto-generated method stub
    }

    @Override
    public void insertarMoneda() {
        System.out.println("Moneda introducida");
        maquinaBolas.setEstado(new EstadoMonedaIntroducida(maquinaBolas));
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
