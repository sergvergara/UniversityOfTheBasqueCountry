public class MonitorizacionSensores {
    private static MonitorizacionSensores mMonitorizacionSensoresFacade; 
    
	private MonitorizacionSensores() {
		// TODO - implement MonitorizacionSensores.Monitor
		throw new UnsupportedOperationException();
	}

	public static MonitorizacionSensores obtMonitorizacionSensores() {
		if (mMonitorizacionSensoresFacade==null) {
			mMonitorizacionSensoresFacade=new MonitorizacionSensores();
		}
		return mMonitorizacionSensoresFacade;
	}

}