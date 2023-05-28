import java.util.HashMap;
import java.util.Map;
// dynamic programming approach but still bad memory compared to iterative approach.
// memory in n, we can reduce memory to constant time if we implement the iterative approach
public class ClimbStairsv2 {

    private final Map<Integer, Integer> previousResults =new HashMap<>();

    public int climbStairs(int n) {
        int result;

        if(previousResults.containsKey(n))
            return previousResults.get(n);

        if(n ==1)
            return 1;

        if(n == 2)
            return 2;

        if(n==3)
            return 3;

        result = climbStairs(n-1) + climbStairs(n-2);
        previousResults.put(n, result);

        return result;

    }
}
