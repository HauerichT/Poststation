public class PoststationTest {
    public static void main(String[] args) {

        Fahrrad fahrrad1 = new Fahrrad(10);
        Fahrrad fahrrad2 = new Fahrrad(20);
        Fahrrad fahrrad3 = new Fahrrad(30);

        Fahrradgruppe fahrradgruppe1 = new Fahrradgruppe();
        fahrradgruppe1.addFahrrad(fahrrad1);
        fahrradgruppe1.addFahrrad(fahrrad2);
        fahrradgruppe1.addFahrrad(fahrrad3);

        System.out.println("Fahrrad-Geschwindigkeiten ohne Ladung: ");
        System.out.println("Fahrrad 1: " + fahrrad1.speed());
        System.out.println("Fahrrad 2: " + fahrrad2.speed());
        System.out.println("Fahrrad 3: " + fahrrad3.speed());
        System.out.println("Reisegeschwindigkeit: " + fahrradgruppe1.reisegeschwindigkeit());

        int ladung = 35;
        fahrradgruppe1.addLadung(ladung);

        System.out.println("\nFahrrad-Geschwindigkeiten mit einer Ladung von " + ladung + ":");
        System.out.println("Fahrrad 1: " + fahrrad1.speed());
        System.out.println("Fahrrad 2: " + fahrrad2.speed());
        System.out.println("Fahrrad 3: " + fahrrad3.speed());
        System.out.println("Reisegeschwindigkeit: " + fahrradgruppe1.reisegeschwindigkeit());

    }
}