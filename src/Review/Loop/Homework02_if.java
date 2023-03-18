package Review.Loop;

public class Homework02_if {
    /*
	计算从1+2-3+4-5+6-7...+100=
*/
    public static void main(String[] args) {
        int sum=1;
        for(int i=2;i<101;i++){
            if(i%2==0){
                sum+=i;
            }else{
                sum-=i;
            }
        }
        System.out.println(sum);
    }
}
