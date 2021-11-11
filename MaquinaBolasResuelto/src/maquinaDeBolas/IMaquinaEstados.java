package maquinaDeBolas;

public interface IMaquinaEstados {
    public abstract void expulsarProducto();

    // Este otro para proceder a añadir las bolas
    public abstract void rellenarDeBolas();

    // Necesitamos este método para poder modificar el estado actual
    public abstract void setEstado(EstadoMaquina pNuevoEstado);

    public abstract int getUnidadesDisponibles();
}



