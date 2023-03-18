package Review.Loop;

public class Homework07_PerfectNumber {
    public static void main(String[] args) {
//    1.首先我们把1000以内的数字都列出来
        for(int i=1;i<1001;i++){
            //	2.我们找这个被选中的数字的因子，求他的和
            int sum=0;
            for(int divisor=i-1;divisor>0;divisor--){
                if(i%divisor==0){
                    sum+=divisor;
                }
                //	3.比较他的和与它本身，看他是不是完数

            }if(sum==i){
                System.out.println("PerfectNumber--------"+i);
            }
//	4.输出完之后，再去看下一个
        }
    }
}