public class EvaluacionPracticaProgramacionFactory {
    private static EvaluacionPracticaProgramacionFactory mEvaluacionPracticaProgramacionFactory;

    private EvaluacionPracticaProgramacionFactory() {

        // TODO - implement EvaluacionPracticaProgramacionFactory.EvaluacionPracticaProgramacionFactory
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param pTipo
     */
    public EvaluacionPracticaProgramacion crearEvaluacionPracticaProgramacion(String pTipo) {

        // TODO - implement EvaluacionPracticaProgramacionFactory.crearEvaluacionPracticaProgramacion
        throw new UnsupportedOperationException();
    }

    public static EvaluacionPracticaProgramacionFactory getEvaluacionPracticaProgramacionFactory(
            String zipConLaSolucion, String alumno) {

        // TODO - implement EvaluacionPracticaProgramacionFactory.getEvaluacionPracticaProgramacionFactory
        if (mEvaluacionPracticaProgramacionFactory == null) {
            mEvaluacionPracticaProgramacionFactory = new EvaluacionPracticaProgramacionFactory();
        } else {
            System.out.println("No se ha podido crear el objeto");
        }

        return mEvaluacionPracticaProgramacionFactory;
    }
}



