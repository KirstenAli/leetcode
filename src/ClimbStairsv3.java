// in this version I implement an iterative version to improve the memory
public class ClimbStairsv3 {
    public int climbStairs(int n) {

        if(n==1)
            return 1;

        if(n==2)
            return 2;

        if(n==3)
            return 3;

        int n1 = 3;
        int n2 = 2;
        int result =0;

        for(int i=4; i<=n; i++){
            result= n1+n2;

            n2 = n1;
            n1 = result;
        }

        return result;
    }
}
