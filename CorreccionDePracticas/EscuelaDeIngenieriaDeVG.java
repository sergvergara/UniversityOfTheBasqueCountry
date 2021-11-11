public class EscuelaDeIngenieriaDeVG {

    /**
     *
     * @param pTipo
     */
    public static void hacerEvaluacionProgramacion(String pTipo) {
        EvaluacionPracticaProgramacion evaluacionPracticaProgramacion = new EvaluacionPracticaProgramacion();

        if (evaluacionPracticaProgramacion.encontrarZipConLaSolucion()
                && evaluacionPracticaProgramacion.descomprimirZipConLaSolucion()
                && evaluacionPracticaProgramacion.cargarArchivosConLaSolucion()) {

            // test unitarios
            CheckStyleClient checkStyleClient = new CheckStyleClient();

            // normas de estilo
            PMDClient pMDClient = new PMDClient();

            // estructuras de control adecuadas
            WebCatClient webCatClient = new WebCatClient();

            if (checkStyleClient.cumpleNormasDeEstilo()
                    && pMDClient.utilizaEstructurasDeControlAdecuadas()
                    && webCatClient.realizarTestUnitario()) {
                System.out.println("Escribir puntuación en archivo de puntuaciones");
            } else {
                System.out.println("Hacer valoración y escribir puntuación en archivo de puntuaciones");
            }
        }
    }

    public static void main(String[] args) {
        EvaluacionPracticaProgramacionFactory evaluacionPracticaProgramacionFactory = null;

        evaluacionPracticaProgramacionFactory.getEvaluacionPracticaProgramacionFactory("zipConLaSolucion", "alumno");
        evaluacionPracticaProgramacionFactory.crearEvaluacionPracticaProgramacion(
            "nuevaEvaluacionDePracticaProgramacion");
        hacerEvaluacionProgramacion("Tarea 9");
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
