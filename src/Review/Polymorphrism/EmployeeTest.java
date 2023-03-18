package Review.Polymorphrism;

import org.w3c.dom.ls.LSOutput;

public class EmployeeTest {
    /*
     * 定义员工类Employee
     *     属性
     *        name
     *        birthMonth
     *      方法
     *        获得制定月份工资的方法getSalary（int month，如果改月员工生日，公司补助250元）
     * 定义有固定工资的员工类SalariesEmployee
     *       属性
     *         月薪monthlySalary
     * 定义小时工类HourlyEmployee
     *       属性
     *         工作小时数hours
     *         每小时工资hourlySalary
     *        方法
     *          如果每月工作超过160个小时，超过的部分按1.5倍工资发放
     * 定义销售人员类SalesEmployee，
     *       属性
     *           包含月销售额sales和提成比例comm属性
     * */
    public static void main(String[] args) {


        Employee m01 = new SalariesEmployee("Jack", 4, 5000);
        Employee h01 = new HourlyEmployee("Jackmon", 5, 80, 90);
        Employee s01 = new SalesEmployee("Mike", 7, 20000, 0.3);
        System.out.println(m01.getSalary(4));
        System.out.println(h01.getSalary(5));
        System.out.println(s01.getSalary(7));
    }
}
//定义员工类Employee
class Employee{
    //Properties
        //name
    private String name;
        //birthMonth
    private int birthMonth;
    //method
        //constuctor
    public Employee() {
    }

    public String getName() {
        return name;
    }
        //set and get
    public void setName(String name) {
        this.name = name;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Employee(String name, int birthMonth) {
        this.name = name;
        this.birthMonth = birthMonth;

    }
    //method: getSalaryx
    public double getSalary(int month){
        return 0.0;
        };
    }

//定义有固定工资的员工类SalariesEmployee
class SalariesEmployee extends Employee{
    //属性
    //月薪monthlySalary
    //method
    private double monthlySalary;
        //get and set
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
        //constructor


    public SalariesEmployee() {
    }

    public SalariesEmployee(String name, int birthMonth, double monthlySalary) {
        super(name, birthMonth);
        this.monthlySalary = monthlySalary;
    }

    public double getSalary(int month){
        double salary=0.0;
        if(this.getBirthMonth()==month){
            return month*monthlySalary+250;
        }else{
            return month*monthlySalary;
        }
    }
}
//定义小时工类HourlyEmployee
class HourlyEmployee extends Employee{
    //        *       属性
        //        *         工作小时数hours
    private int hours;
        //        *         每小时工资hourlySalary
    private double hourlySalary;
    //        *        方法
        //set and get

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }
        //constructor
        public HourlyEmployee() {

        }

    public HourlyEmployee(int hours, double hourlySalary) {
        this.hours = hours;
        this.hourlySalary = hourlySalary;
    }

    public HourlyEmployee(String name, int birthMonth, int hours, double hourlySalary) {
        super(name, birthMonth);
        this.hours = hours;
        this.hourlySalary = hourlySalary;
    }


    //        *          如果每月工作超过160个小时，超过的部分按1.5倍工资发放


    public double getSalary(int month) {
       double money=0.0;
        if(hours<=160){
            money=hours*hourlySalary;
        }else{
            money=160*hourlySalary+(hours-160)*1.5*hourlySalary;
        }
        if(this.getBirthMonth()==month){
            money+=250;
        }
        return money;
    }
}
//定义销售人员类SalesEmployee，
class SalesEmployee extends Employee{
    //        *       属性
        //        *           包含月销售额sales和提成比例comm属性
    private double sales;
    private double comm;
    //method:get and get

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }
    //method:constructor
    public SalesEmployee() {

    }
    public SalesEmployee(double sales, double comm) {
        this.sales = sales;
        this.comm = comm;
    }

    public SalesEmployee(String name, int birthMonth, double sales, double comm) {
        super(name, birthMonth);
        this.sales = sales;
        this.comm = comm;
    }


    //method:getSalary

    public double getSalary(int month) {
        double money=0.0;
        money=sales*comm;
        if(this.getBirthMonth()==month){
            money+=250;
        }
        return money;
    }
}



