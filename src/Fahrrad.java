public class Fahrrad extends Fahrradgruppe {

    private Fahrrad next = null;
    private int ladung;
    private int maxSpeed;


    public Fahrrad(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int speed() {
        if (ladung < maxSpeed) {
            return this.maxSpeed - ladung;
        }
        return 0;
    }

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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
