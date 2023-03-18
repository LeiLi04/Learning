package Review.CollectionTest;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTest01 {
    public static void main(String[] args) {
        Customer customer01=new Customer(1);
        Customer customer02=new Customer(3);
        Customer customer03=new Customer(2);
        Customer customer04=new Customer(100);
        Customer customer05=new Customer(60);
        Customer customer06=new Customer(30);
        TreeSet<Customer> customers=new TreeSet<Customer>();
        customers.add(customer01);
        customers.add(customer02);
        customers.add(customer03);
        customers.add(customer04);
        customers.add(customer05);
        customers.add(customer06);
        for (Customer customer:
             customers) {
            System.out.println(customer);
        }
    }
}
class Customer implements Comparable<Customer>{
    int age;

    public Customer(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Customer customer) {
        //如果他比我大，就是正数，所以结果是从大到小
        return customer.age-this.age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                '}';
    }
}