public class BonusMilesService {
    public int calculate(int cost) {
        int rublesPerBonusMile = 20;
        int bonusMiles = cost / rublesPerBonusMile;
        return bonusMiles;
    }
}