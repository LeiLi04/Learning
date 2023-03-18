package Review.Method;

public class MethodTest01 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int a){
        int sum=1;
        for (;a>0;a--){
            sum*=a;
        }
        return sum;
    }
}

