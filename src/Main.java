public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 12000;
        int charge = 20;
        int miles = service.calculate(price, charge);
        System.out.println(miles);
    }
}
