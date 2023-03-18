package Review.Method;

public class MethodTest02_PrintMinPrimeNum {
    public static void main(String[] args) {
        System.out.println(isPrimeNum(5));
        System.out.println("------------");
        printMinNum(5);
    }
    //Method: printMinNum
    public static void printMinNum(int num){
        while(true){
            num++;
            boolean flag=isPrimeNum(num);
            if(flag){
                System.out.println(num);
                return;
            }
        }
    }
    //Method: isPrimeNum
    public static boolean isPrimeNum(int num){
        for (int divisor=2;divisor<=num/2;divisor++){
            if(num%divisor==0){
                return false;
            }
        }
        return true;
    }
}
