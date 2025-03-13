public class Main {
    public static void main(String[] args) {


        LevelCrossing spa_5 = new BM ("Alstom", "spa_5", 4, 4, 4, false, false, false, true);
        System.out.println(spa_5);
        spa_5.activation();
        spa_5.deactivation();
        System.out.println("-----------");


        LevelCrossing ebi_gate_2000 = new RS("Bombardier Transportation", "EBI GATE 2000", 0, 4, 0, false, false, true, false);
        System.out.println(ebi_gate_2000);
        ebi_gate_2000.activation();
        ebi_gate_2000.deactivation();
    }
}