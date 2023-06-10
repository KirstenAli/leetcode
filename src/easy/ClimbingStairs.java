package easy;

// this problem can be translated to the fibonacci sequence. We can solve this easily with recursion.
// time complexity is bad. each climbStairs call (excluding base cases) executes exactly two further climbStairs,
// thus time is 2^n
// consider iterative approach or dynamic programming to improve time complexity
public class ClimbingStairs {
    public int climbStairs(int n) {
        int result;

        if(n ==1)
            return 1;

        else if(n == 2)
            return 2;

        else if(n==3)
            return 3;

        else {
            result = climbStairs(n-1) + climbStairs(n-2);

            return result;
        }
    }
}
