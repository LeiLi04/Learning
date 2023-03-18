package Review.Array;

public class Homework03_Weapon {
    public static void main(String[] args) {
    Army army=new Army(4);
    Tank tank=new Tank();
    Helicopter helicopter=new Helicopter();
    GSP gsp=new GSP();
    SupportCar supportCar=new SupportCar();


        try {
            army.addWeapon(helicopter);
            army.addWeapon(tank);
            army.addWeapon(gsp);
            army.addWeapon(supportCar);
        } catch (Exception e) {
            e.printStackTrace();
        }

        army.moveable();
    army.shootable();

    }
}
class Army{
    //Property:weapon
    private Weapon[] weapons;
    //Method:get&set&consrtrutor

    public Weapon[] getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapon[] weapons) {
        this.weapons = weapons;
    }

    public Army() {
    }
    public Army(int count){
        weapons=new Weapon[count];
    }
    public Army(Weapon[] weapons) {
        this.weapons = weapons;
    }
    //method: addWeapon
    public void addWeapon(Weapon weapon) throws Exception{
        for(int i=0;i< weapons.length;i++){
            if(weapons[i]==null){
                weapons[i]=weapon;
                System.out.println("add successfully");
                return;
            }
        }
        throw new AddWeaponException("武器满了");
    }
    //method:shootable
    public void shootable(){
        for(int i=0;i< weapons.length;i++){
            if(weapons[i] instanceof shootable){
                shootable weapon01 = (shootable) weapons[i];
                weapon01.shootable();
            }
        }
    }
    //method:moveable
    public void moveable(){
        for(int i=0;i< weapons.length;i++){
            if(weapons[i] instanceof moveable){
                moveable weapon01 = (moveable) weapons[i];
                weapon01.moveable();
            }
        }
    }
}
//superClass
class Weapon{

}
//interface:moveable
interface moveable{
    void moveable();
}
//interface:shootable
interface shootable{
    void shootable();
}
//子类：helicopter
class Helicopter extends Weapon implements moveable,shootable{
    @Override
    public void moveable() {
        System.out.println("Helicopter is Flying");
    }

    @Override
    public void shootable() {
        System.out.println("Helicopter is Shooting");
    }
}
//子类：高射炮
class GSP extends Weapon implements shootable{
    @Override
    public void shootable() {
        System.out.println("GSP is shooting");
    }
}
//子类：Tank
class Tank extends Weapon implements moveable,shootable{
    @Override
    public void moveable() {
        System.out.println("钢铁洪流正在推进");
    }

    @Override
    public void shootable() {
        System.out.println("Tank is shooting");
    }
}
//子类：物资车
class SupportCar extends Weapon implements moveable{
    @Override
    public void moveable() {
        System.out.println("SupportingCar is moving");
    }
}
class AddWeaponException extends Exception{
    public AddWeaponException() {
    }

    public AddWeaponException(String message) {
        super(message);
    }
}