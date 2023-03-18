package Review.Loop;

public class Homework01_if {
    public static void main(String[] args) {
        //Q：计算1000以内所有不能被7整除的和
        //1.sum 求和变量
        int sum=0;
        //2.判断是否可以被7整除
        for(int i=1;i<1001;i++){
            if(i%7==0){
                continue;
            }else{
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
