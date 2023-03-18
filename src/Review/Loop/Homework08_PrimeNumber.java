package Review.Loop;

public class Homework08_PrimeNumber {
    //打印2-1000所有的质数
    //1.找到2-1000所有的数字
    public static void main(String[] args) {
        int count=0;
        for(int i=2;i<=1000;i++){
            boolean outcome=true;
            //2.判断是否为素数
            for(int divisor=2;divisor<=i/2;divisor++){
                if(i%divisor==0){
                    outcome=false;
                    break;
                }//到这里就全是素数了
            }
            //3.如果是素数就
            if(outcome){
                System.out.print(i+" ");
                count++;
                if(count==8){
                    System.out.println(" ");
                    count=0;
                }
            }
        }
    }
}
