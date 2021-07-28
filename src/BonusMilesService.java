public class BonusMilesService {

    public static int calculate(int cost) {

        int bonus = cost / 20;

        System.out.println("Количество бонусных миль: " + bonus);
        return cost;
    }
}
