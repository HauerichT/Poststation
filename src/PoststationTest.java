public class PoststationTest {
    public static void main(String[] args) {

        Fahrrad fahrrad1 = new Fahrrad(3, 22);
        Fahrrad fahrrad2 = new Fahrrad(5, 30);

        Fahrrad fahrrad3 = new Fahrrad(1, 32);
        Fahrrad fahrrad4 = new Fahrrad(2, 19);
        Fahrrad fahrrad5 = new Fahrrad(5, 14);


        Fahrrad fahrrad6 = new Fahrrad(1, 32);
        Fahrrad fahrrad7 = new Fahrrad(2, 19);
        Fahrrad fahrrad8 = new Fahrrad(5, 14);
        Fahrrad fahrrad9 = new Fahrrad(5, 14);


        Fahrradgruppe fahrradgruppe1 = new Fahrradgruppe();
        fahrradgruppe1.addFahrrad(fahrrad1);
        fahrradgruppe1.addFahrrad(fahrrad2);

        Fahrradgruppe fahrradgruppe2 = new Fahrradgruppe();
        fahrradgruppe2.addFahrrad(fahrrad3);
        fahrradgruppe2.addFahrrad(fahrrad4);
        fahrradgruppe2.addFahrrad(fahrrad5);

        Fahrradgruppe fahrradgruppe3 = new Fahrradgruppe();
        fahrradgruppe3.addFahrrad(fahrrad6);
        fahrradgruppe3.addFahrrad(fahrrad7);
        fahrradgruppe3.addFahrrad(fahrrad8);
        fahrradgruppe3.addFahrrad(fahrrad9);



    }
}