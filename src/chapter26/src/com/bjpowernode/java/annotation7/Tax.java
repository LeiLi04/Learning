package chapter26.src.com.bjpowernode.java.annotation7;

public class Tax {
    //field
    private String name;
    private double rate;
    //set and get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    //a member function that will return the Rate increased by 20%.
    public double reRate(double rate){
        return rate*1.2;
    }
}
