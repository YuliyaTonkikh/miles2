public class main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int prise = 10000;
        int miles = service.calculate(prise);
        System.out.println(miles);
    }
}
