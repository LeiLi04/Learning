package Review.Method;

public class MethodTest03_Recursion {
    public static void main(String[] args) {
        int r=3;
        System.out.println(sum(3));
    }
    //Method: Recursion   sum(3)=3+sum(2)=3+2+sum(1)=3+2+1
    public static int sum(int a){
        if(a==1){
            return 1;
        }
        //此处的a就是对于a=3阶段的处理
        return a+sum(a-1);
    }
}
