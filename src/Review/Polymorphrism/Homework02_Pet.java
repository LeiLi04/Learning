package Review.Polymorphrism;

public class Homework02_Pet {
    /*
    * 多态练习题
    * 编写程序模拟"主人""喂养""宠物"的场景：
    * 提示1：
    *      主人类：Master
    *      宠物类：Pet
    *      宠物类子类：Dog，Cat，YingWU
    * 提示2：
    *      主任应该有喂养的方法：feed（）
    *      宠物应该有吃的方法eat（）
    *      主要主任为宠物宠物就吃饭
    * 要求：主人类中只提供一个喂养方法feed（），要求达到可以喂养各种类型的宠物
    *
    * 编写测试程序：
    *       创建主任对象
    *       创建各种宠物对象
    *       调用主人的喂养方法feed（），喂养不同的宠物，观察执行结果
    *
    * 通过该案例，理解多态在开发中的作用
    * 重要提示：feed方法是否需要一个参数，参数类型选什么*/
    public static void main(String[] args) {
        //master
        Master master01=new Master();
        //pets
        Pet dog01=new Dog();
        Pet cat01=new Cat();
        Pet carrot01=new Carrot();
        //master feed pets
        master01.feed(dog01);
        master01.feed(carrot01);
        master01.feed(cat01);
    }
}
//Pet class
class Pet{
    public void eat(){

    }
}
    //Pet's subClass Dog
class Dog extends Pet{
        @Override
        public void eat() {
            System.out.println("Dogs吃饱了");
        }
    }
    //Pet's subClass Cat
class Cat extends Pet{
        @Override
        public void eat() {
            System.out.println("Cat吃饱了");
        }
    }
    //Pet's subClass carrot
class Carrot extends Pet{
        @Override
        public void eat() {
            System.out.println("Carrots 吃饱了");
        }
    }
//Master Class
class Master{
    public void feed(Pet pet){
        pet.eat();
    }
}