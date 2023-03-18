package Review.Loop;

public class Homework10_basketball {
    public static void main(String[] args) {
        //l篮球从5m的地方掉落，每次0.3的剩余高度，需要多少次数到0.1m
        int times=0;
        double height=5;
        while (height>0.1){
            height*=0.3;
            times++;
        }
        System.out.println(times);
        System.out.println(height);
    }
}
