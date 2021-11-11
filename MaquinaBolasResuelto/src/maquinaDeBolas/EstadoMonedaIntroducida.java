package maquinaDeBolas;

import java.util.Random;

public class EstadoMonedaIntroducida implements EstadoMaquina {
    private IMaquinaEstados maquinaBolas;

    public EstadoMonedaIntroducida(IMaquinaEstados pMaquina) {
        maquinaBolas = pMaquina;
    }

    @Override
    public void entregarProducto() {

        // TODO Auto-generated method stub
    }

    @Override
    public void expulsarMoneda() {
        System.out.println("Devolviendo la moneda introducida");
        maquinaBolas.setEstado(new EstadoInicial(maquinaBolas));
    }

    @Override
    public void insertarMoneda() {

        // TODO Auto-generated method stub
    }

    @Override
    public void pulsarBoton() {

        // Añadir luego al azar vaya al estado Con_Premio
        Random genAleatorios = new Random();
        int    num           = genAleatorios.nextInt(10);

        if (num == 7) {
            System.out.println("¡Premiado!");
            maquinaBolas.setEstado(new EstadoCompradoConPremio(maquinaBolas));
        } else {
            System.out.println("Sin premio: " + num);
            System.out.println("Realizando la compra");
            maquinaBolas.setEstado(new EstadoProductoComprado(maquinaBolas));
        }
    }

    @Override
    public void rellenarMaquina() {

        // TODO Auto-generated method stub
    }
}



