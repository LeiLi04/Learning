package Review.Loop;

public class Homework06_if {
    /*
	小芳的妈妈每天给她2.5元，他都会存起来，但是，每当这一天是存钱的第5天，或者是5的倍数的话，
	她都会花掉6元钱。请问，经过多少天，小芳才可以存到100元
*/
    public static void main(String[] args) {
        double sum=2.5;
        int day=1;
        for(;sum<100;day++){
            sum+=2.5;
            if(day%5==0){
                sum-=6;
            }
        } System.out.println(day);
    }
}
