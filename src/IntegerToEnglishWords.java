//Hard ???
public class IntegerToEnglishWords {
    public String result(int num) {
        String ones[]= {"","One", "Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String tens[]= {"","", "Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String tenToNineteen[] ={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

        var result = "";

        if(num<10)
            result = ones[num];

        else if(num<20)
            result = tenToNineteen[num-10];

        else if (num<100){
            result = tens[num/10] + " " + result(num %10);
        }

        else if(num<1000){
            result= ones[num/100] + " Hundred " + result(num %100);
        }

        else if(num<1000000){
            result= result(num/1000) + " Thousand " + result(num %1000);
        }

        else if (num < 1000000000) {
            result= result(num/1000000) + " Million " + result(num %1000000);
        }

        else{
            result= result(num/1000000000)+" Billion "+ result(num % 1000000000);
        }

        return result.trim();
    }

    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";

        return result(num);
    }

    public static void main(String[] args){
        var result = new IntegerToEnglishWords().result(12345);
        System.out.println(result);
    }

}
