public class Fahrradgruppe {

    // Instanzvariablen
    private Fahrrad startFahrrad = null;
    private int langsamsteGeschwindigkeit = 0;

    // Methode setzt nächstes Fahrrad
    public void addFahrrad(Fahrrad f) {
        f.setNext(startFahrrad);
        this.startFahrrad = f;
    }

    // Methode berechnet die Reisegeschwindigkeit und gibt diese aus
    public int reisegeschwindigkeit() {
        Fahrrad aktFahrrad = this.startFahrrad;
        // Reisegeschwindigkeit des aktuellen Fahrrads
        int reisegeschwindigkeit = aktFahrrad.speed();
        // iteriert über die Fahrräder
        while (aktFahrrad.getNext() != null) {
            // setzt das nächste Fahrrad
            aktFahrrad = aktFahrrad.getNext();
            // prüft, ob das jetzige Fahrrad schneller als das nächste ist
            if (reisegeschwindigkeit > aktFahrrad.speed()) {
                reisegeschwindigkeit = aktFahrrad.speed();
            }
        }
        // gibt die Reisegeschwindigkeit zurück
        return reisegeschwindigkeit;
    }

    // Methode fügt Ladung hinzu und teilt diese auf die Fahrräder auf
    public void addLadung(int anzahl) {
        // prüft, ob Anzahl größer als 0 ist
        if (anzahl <= 0) {
            System.out.println("Anzahl muss größer als 0 sein.");
        }

        Fahrrad aktFahrrad = this.startFahrrad;
        Fahrrad maxFahrrad = this.startFahrrad;

        // iteriert über die Anzahl
        for (int i = 1; i <= anzahl; i++) {
            // iteriert über die Fahrräder
            while (aktFahrrad.getNext() != null) {
                // setzt das nächste Fahrrad
                aktFahrrad = aktFahrrad.getNext();
                // prüft, ob das jetzige Fahrrad schneller als das nächste ist
                if (maxFahrrad.speed() < aktFahrrad.speed()) {
                    maxFahrrad = aktFahrrad;
                }
            }

            // setzt die Ladung
            maxFahrrad.setLadung(maxFahrrad.getLadung()+1);

            // setzt die Fahrräder zurück
            aktFahrrad = this.startFahrrad;
            maxFahrrad = this.startFahrrad;
        }
    }

    public void setStartFahrrad(Fahrrad startFahrrad) {
        this.startFahrrad = startFahrrad;
    }

    public Fahrrad getStartFahrrad() {
        return startFahrrad;
    }

    public void setLangsamsteGeschwindigkeit(int langsamsteGeschwindigkeit) {
        this.langsamsteGeschwindigkeit = langsamsteGeschwindigkeit;
    }

    public int getLangsamsteGeschwindigkeit() {
        return langsamsteGeschwindigkeit;
    }
}
