package Review.Polymorphrism;

public class Homework01_Instrument {
    /*
    * 1.编写程序实现乐手弹奏乐器，乐手可以弹奏不同的乐器而发出不同的声音
    * 可以弹奏的乐器包括二胡，钢琴和琵琶
    * 实现思路和关键代码：
    * 1)定义乐器类Instrument，包括方法makeSound（）
    * 2）定义乐器类的子类：二胡，钢琴和小提琴
    * 3）定义乐手类的Musician，可以弹奏各种乐器play
    * 4）定义测试类，让乐手不同的乐器都可以弹奏
    * */
    public static void main(String[] args) {
        Instrument erhu01=new Erhu();
        Instrument violin01=new Violin();
        Instrument piano01=new Piano();
        Musician m01=new Musician();
        //音乐家m01弹奏二胡
        m01.play(erhu01);
        //m01弹奏violin
        m01.play(violin01);
        //m01弹奏piano
        m01.play(piano01);
    }
}
class Instrument{
    public void makeSound(){
    }
}
//Erhu类
class Erhu extends Instrument{
    @Override
    public void makeSound() {
        System.out.println("二胡啦啦啦啦啦啦");
    }
}
//Piano类
class Piano extends Instrument{
    @Override
    public void makeSound() {
        System.out.println("Piano铃铃令玲玲");
    }
}
//小提琴类
class Violin extends Instrument{
    @Override
    public void makeSound() {
        System.out.println("小提琴啦啦啦啦啦啦");
    }
}
//Musician类，可以弹奏乐器类
class Musician{
    public void play(Instrument i){
        i.makeSound();
    }
}