package constructorDeCoches;

import constructorDeCoches.ConstructorDeCoches.Tipo;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        ConstructorDeCoches constructorDeCoches = new ConstructorDeCoches();

        constructorDeCoches.getCoche(Tipo.economico);
    }
}



