public class Fahrrad extends Fahrradgruppe {

    // Instanzvariablen
    private Fahrrad next = null;
    private int ladung;
    private final int maxSpeed;

    // Konstruktor
    public Fahrrad(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // berechnet den speed abzüglich der Ladung
    public int speed() {
        if (ladung < maxSpeed) {
            return this.maxSpeed - ladung;
        }
        return 0;
    }

    // set- und get-Methoden
    public Fahrrad getNext() {
        return next;
    }

    public void setNext(Fahrrad next) {
        this.next = next;
    }

    public int getLadung() {
        return ladung;
    }

    public void setLadung(int ladung) {
        this.ladung = ladung;
    }

}
