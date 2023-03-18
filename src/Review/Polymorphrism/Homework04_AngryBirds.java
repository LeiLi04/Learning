package Review.Polymorphrism;

public class Homework04_AngryBirds {
    /*
    * 我们有很多种小鸟，每种小鸟都有飞的行为，还有一个弹弓，弹弓有弹射的行为
    * 弹射时吧小鸟弹出去，之后小鸟是用自己的飞行行为飞向小猪（不需要编写小猪代码）
    * 不同种类的小鸟有不同的飞行方式：
    *       火红：红色小鸟，飞行方式：正常
    *       蓝冰：蓝色小鸟，飞行方式：分成3个
    *       黄风：黄色小鸟，飞行方式，加速
    * */
    public static void main(String[] args) {
        Bird b1=new RedBird();
        Bird b2=new BlueBird();
        Bird b3=new YellowBird();
        Slingshot s1=new Slingshot();
        s1.eject(b1);
        s1.eject(b2);
        s1.eject(b3);
    }
}
//Slingshot class
class Slingshot{
    public void eject(Bird bird){
        bird.fly();
    }
}
//Bird class
class Bird{

    //the way to fly
    public void fly(){

    }
}
    //Red bird
class RedBird extends Bird{
        @Override
        public void fly() {
            System.out.println("Normal");
        }
    }
    //Blue bird
class BlueBird extends Bird{
        @Override
        public void fly() {
            System.out.println("Split up to 3");
        }
    }
    //Yellow bird
class YellowBird extends Bird{
        @Override
        public void fly() {
            System.out.println("Speed up");
        }
    }