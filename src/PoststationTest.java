public class PoststationTest {
    public static void main(String[] args) {

        // Initialisierung der Fahrräder
        Fahrrad fahrrad1 = new Fahrrad(10);
        Fahrrad fahrrad2 = new Fahrrad(20);
        Fahrrad fahrrad3 = new Fahrrad(30);

        // Initialisierung der Fahrradgruppe
        Fahrradgruppe fahrradgruppe1 = new Fahrradgruppe();

        // Fahrräder der Fahrradgruppe zuweisen
        fahrradgruppe1.addFahrrad(fahrrad1);
        fahrradgruppe1.addFahrrad(fahrrad2);
        fahrradgruppe1.addFahrrad(fahrrad3);

        // Ausgabe der Fahrradgeschwindigkeiten ohne Ladung
        System.out.println("Fahrrad-Geschwindigkeiten ohne Ladung: ");
        System.out.println("Fahrrad 1: " + fahrrad1.speed());
        System.out.println("Fahrrad 2: " + fahrrad2.speed());
        System.out.println("Fahrrad 3: " + fahrrad3.speed());
        System.out.println("Reisegeschwindigkeit: " + fahrradgruppe1.reisegeschwindigkeit());

        // hinzufügen der Ladung
        int ladung = 6;
        fahrradgruppe1.addLadung(ladung);

        // Ausgabe der Fahrradgeschwindigkeiten mit Ladung
        System.out.println("\nFahrrad-Geschwindigkeiten mit einer Ladung von " + ladung + ":");
        System.out.println("Fahrrad 1: " + fahrrad1.speed());
        System.out.println("Fahrrad 2: " + fahrrad2.speed());
        System.out.println("Fahrrad 3: " + fahrrad3.speed());
        System.out.println("Reisegeschwindigkeit: " + fahrradgruppe1.reisegeschwindigkeit());

    }
}