public class ProgramaPrincipal {
    public static void main(String[] args) {
        JugadorHumano  jH = new JugadorHumano();
        JugadorMaquina jM = new JugadorMaquina();

        // Nivel jugador
        NivelJugador          nJ = new NivelJugador();
        NivelAprendizStrategy n1 = new NivelAprendizStrategy();
        NivelMedioStrategy    n2 = new NivelMedioStrategy();
        NivelNormalStrategy   n3 = new NivelNormalStrategy();
        NivelAgresivoStrategy n4 = new NivelAgresivoStrategy();

        // Jugador humano selecciona nivel
        n1.jugadorHumanoSeleccionaPerfilJugador();

        ObservedJuego oJ = new ObservedJuego();

        // Se inicia la partida
        oJ.iniciarNuevaPartida();

        // Jugador humano realiza movimientos
        oJ.movimientoPieza();
        oJ.notificarObservers();

        // Jugador máquina realiza movimientos
        // Jugador máquina realiza un tipo de movimiento en su turno
        // Conservador o
        n1.realizarMovimientoConservador();

        // Normal o
        n1.realizarMovimientoNormal();

        // Agresivo
        n1.realizarMovimientoAgresivo();
        oJ.movimientoPieza();
        oJ.notificarObservers();

        // Tras varios movimientos de los jugadores la partida finaliza
        oJ.declararGanador();
    }
}



