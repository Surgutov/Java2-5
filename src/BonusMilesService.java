public class BonusMilesService<cost, charge> {
    public int calculate(int price, int charge) {
        int miles = price / charge;
        return miles;
    }

}
