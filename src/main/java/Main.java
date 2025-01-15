public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();

        int expected = 150;
        int actual = service.calcBonus(5000, true);
        System.out.println("1. " + expected + "== ? == " + actual);


        int bonus = service.calcBonus(5000, true);
        System.out.println(bonus);

    }
}
