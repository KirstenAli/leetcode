import java.util.HashMap;
import java.util.Map;
// dynamic programming approach but still bad memory compared to iterative approach.
public class ClimbStairsv2 {

    private final Map<Integer, Integer> previousResults =new HashMap<>();

    public int climbStairs(int n) {
        int result;

        if(previousResults.containsKey(n))
            return previousResults.get(n);

        if(n ==1)
            return 1;

        else if(n == 2)
            return 2;

        else if(n==3)
            return 3;

        else {
            result = climbStairs(n-1) + climbStairs(n-2);
            previousResults.put(n, result);

            return result;
        }
    }
}
