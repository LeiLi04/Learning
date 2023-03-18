package Review.Polymorphrism;

public class Homework03_SumRent {
    /*
    * 小轿车类Car是Vehicle的子类
    *   属性：车型（两厢，三厢，越野）两厢每天300，三厢每天350，越野每天500
    *   多座汽车类Bus是Vehicle的子类，属性：座位数，座位数<=16每天400，座位数>16的每天600
    * 编写测试类，根据用户选择不同的汽车，计算总租金
    * Vehicle 是所有车的父类
    *   属性：品牌，车牌号，有返回总租金的方法：public double*/
    public static void main(String[] args) {
        Car c1=new Car("Benz",110,"两厢");
        Car c2=new Car("BMW",111,"三厢");
        Car c3=new Car("Audi",112,"越野");
        Bus b1=new Bus("Benz",113,15);
        Bus b2=new Bus("Audi",199,17);
        System.out.println(c1.getSumRent(90));
        System.out.println(c2.getSumRent(90));
        System.out.println(c3.getSumRent(90));
        System.out.println(b1.getSumRent(90));
        System.out.println(b2.getSumRent(90));

    }
}
//Vehicle类
class Vehicle{
    //属性 brand&carNum
    private String brand;
    private int carNum;
    //Constructor
        //none
    public Vehicle() {
    }
        //with parameter
    public Vehicle(String brand, int carNum) {
        this.brand = brand;
        this.carNum = carNum;
    }
    //set and get

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    //method getSumRent
    public double getSumRent(int days){
        return 0;
    }
}
//小轿车是Vehicle的子类
class Car extends Vehicle{
    //车的种类（两厢，三厢，越野）
    private String type;
    //Set and Get

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    //Constructor

    public Car(String type) {
        this.type = type;
    }

    public Car(String brand, int carNum, String type) {
        super(brand, carNum);
        this.type = type;
    }
    //method:getSumRent

    @Override
    public double getSumRent(int days) {
        if(this.type.equals("两厢")){
            return days*300;
        }else if(this.type.equals("三厢")){
            return days*350;
        }else if(this.type.equals("越野")){
            return days*500;
        }
        return 0;
    }
}
//class Bus
class Bus extends Vehicle{
    //属性：座位数
    private int seats;
    //Constructor
    public Bus() {
    }

    public Bus(String brand, int carNum, int seats) {
        super(brand, carNum);
        this.seats = seats;
    }
    //Set and Get

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public double getSumRent(int days) {
        if(this.seats>16){
            return days*600;
        }else if(seats<=16){
            return days*400;
        }
        return 0;
    }
}