package Review.Loop;

public class ForTest01 {
//    来个题目做一做：
///*
//	使用for循环，实现1~100所有奇数求和
//	至少给出两种解决方案。
//*/
public static void main(String[] args) {
    //1.Find all the odd from 1~100
    int sum=0;
    for (int i=1;i<100;i++){
        if(i%2!=0){
            sum+=i;
        }
    }
    System.out.println(sum);
}
}
