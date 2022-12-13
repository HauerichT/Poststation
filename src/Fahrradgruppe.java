public class Fahrradgruppe {

    private Fahrrad startFahrrad = null;

    int langsamsteGeschwindigkeit = 0;

    public void addFahrrad(Fahrrad f) {
        f.setNext(startFahrrad);
        this.startFahrrad = f;
    }

    public int reisegeschwindigkeit() {
        Fahrrad langsamstesFahrrad = this.startFahrrad;
        int speed = langsamstesFahrrad.speed();
        while (langsamstesFahrrad.getNext() != null) {
            langsamstesFahrrad = langsamstesFahrrad.getNext();
            if (speed > langsamstesFahrrad.speed()) {
                speed = langsamstesFahrrad.speed();
            }
        }
        return speed;
    }

    public void addLadung(int anzahl) {
        if (anzahl <= 0) {
            System.out.println("Fehler");
        }

        Fahrrad langsamstesFahrrad = this.startFahrrad;
        Fahrrad maxFahrrad = this.startFahrrad;
        for (int i = 1; i <= anzahl; i++) {
            while (langsamstesFahrrad.getNext() != null) {
                langsamstesFahrrad = langsamstesFahrrad.getNext();
                if (maxFahrrad.speed() < langsamstesFahrrad.speed()) {
                    maxFahrrad = langsamstesFahrrad;
                }
            }
            maxFahrrad.setLadung(maxFahrrad.getLadung()+1);
            langsamstesFahrrad = this.startFahrrad;
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
