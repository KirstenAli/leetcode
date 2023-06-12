package easy;

public class MySqrt {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }

        int squareRoot=2;

        while(true){

            if(squareRoot==x/squareRoot)
                return squareRoot;

            else if(squareRoot>x/squareRoot)
                return squareRoot-1;

            squareRoot++;
        }

    }
}
