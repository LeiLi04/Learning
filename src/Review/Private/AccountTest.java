package Review.Private;

class Account {
//    写一个名为Account的类模拟账户
//    该类包裹的属性：账户id，余额balance，年利率annualInterestRate
//    包含的方法：各属性的set and get方法，取款方法withdraw（），存款方法deposit（）
    //id
    private int id;
    //balance
    private double balance;
    //annualInterestRate
    private double annualInterestRate;
    //constructor
    public Account(){}
    public Account(int id,double balance,double annualInterestRate){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }
    //get and set
    //id
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    //balance
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    //annualInterestRate
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    //method:withdraw
    public void withdraw(int money){
        if(money>balance){
            System.out.println("余额不足");
            return;
        }
        this.balance-=money;
        System.out.println("Withdraw"+money+"successfully");
        System.out.println("Balance:"+this.balance);
    }
    //method:deposit
    public void deposit(int money){
        this.balance+=money;
        System.out.println("Deposit"+money+"Successfully");
        System.out.println("Balance:"+this.balance);
    }
}
//写一个测试程序
//（1）创建一个Customer，名字叫做Jane Smith，他有一个账号为1000，余额为2000，年利率为1。23%的账户
//（2）对Jane Smith操作
//存入100元，再去除960元，再取出2000元
//打印JaneSmith的基本信息
//信息现实如下
//成功存入：100元
//成功取出：960元
//余额不足，取钱失败
//Customer【Smith，Jane】has a account: id is 1000annualInterestRate is 1.23% balance is 1140.0
class Customer{
    //name
    private String name;
    //Account
    private Account account;
    //constructor
    public Customer(){}
    public Customer(String name,Account account){
        this.account=account;
        this.name=name;
    }
    //setter and getter
    //Name
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    //Account
    public Account getAccount(){
        return this.account;
    }
    public void setAccount(Account account){
        this.account=account;
    }
}
//Test
public class AccountTest{
    public static void main(String[] args) {
        Account a1=new Account(1000,2000,0.0123);
        Customer c1=new Customer("SmithJane",a1);
        c1.getAccount().deposit(50);
        c1.getAccount().withdraw(960);
        c1.getAccount().withdraw(3000);
        System.out.println(c1.getName()+"has a account "+c1.getAccount().getId()+" annualInterestRate is "+c1.getAccount().getAnnualInterestRate());
    }
}
