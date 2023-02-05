public class BonusMilesService {

    public int calculate(int cost){
        int res;

        res = Math.round((cost/20));

        return res;
    }
}
