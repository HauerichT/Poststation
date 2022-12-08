public class Fahrradgruppe {

    private Fahrrad startFahrrad = null;

    int langsamsteGeschwindikeit = 0;

    public void addFahrrad(Fahrrad f) {
        if (startFahrrad == null) {
            startFahrrad = f;
        }

        if (f.getMaxSpeed() > langsamsteGeschwindikeit) {
            langsamsteGeschwindikeit = f.getMaxSpeed();
        }
    }

    public int reisegeschwindigkeit() {
        return langsamsteGeschwindikeit;
    }

    public void addLadung(int anzahl) {

    }

}
