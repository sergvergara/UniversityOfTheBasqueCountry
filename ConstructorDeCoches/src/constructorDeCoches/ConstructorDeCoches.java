package constructorDeCoches;

public class ConstructorDeCoches {
    private CochesBuilder cochesBuilder;

    public enum Tipo { lujo, economico }

    ;
    private void construirCoche(Tipo tipo) {
        if (Tipo.economico == tipo) {
            CocheBuilderEconomico cocheBuilderEconomico = new CocheBuilderEconomico();
        }

        if (Tipo.lujo == tipo) {
            CocheBuilderLujo cocheBuilderLujo = new CocheBuilderLujo();
        }

        throw new UnsupportedOperationException();
    }

    public Coche getCoche(Tipo tipo) {
        Coche coche = new Coche();

        coche.setMotor("motor");
        coche.setRueda(5);
        coche.setSistemaAudio("sistemaDeAudio");
        construirCoche(tipo);

        return coche;
    }

    /**
     *
     * @param cCochesBuilder
     */
    private void setCochesBuilder(CochesBuilder cCochesBuilder) {
        this.cochesBuilder = cCochesBuilder;
    }
}



