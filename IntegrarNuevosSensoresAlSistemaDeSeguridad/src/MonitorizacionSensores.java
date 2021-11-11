public class MonitorizacionSensores {
    private static MonitorizacionSensores mMonitorizacionSensoresFacade;
    SensorWeightSensorsAdapter            sWSA;

    private MonitorizacionSensores() {
        sWSA = new SensorWeightSensorsAdapter();
    }

    public static MonitorizacionSensores obtMonitorizacionSensores() {
        if (mMonitorizacionSensoresFacade == null) {
            mMonitorizacionSensoresFacade = new MonitorizacionSensores();
        }

        return mMonitorizacionSensoresFacade;
    }
}



