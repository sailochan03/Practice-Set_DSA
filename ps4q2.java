/*Create an interface named Rechargeable with a method
recharge() that takes no arguments and returns void. Create two
classes Laptop and MobilePhone, that implement the Rechargeable
interface and provide their own implementation for the recharge()
method. Then create a class named PortableDevice that implements
both the MobilePhone class and the Rechargeable interface.*/

interface Rechargeable{
    void recharge();
}
class Laptop implements Rechargeable{
    public void recharge(){
        System.out.println("Laptop is recharging.");
    }
}
class MobilePhone implements Rechargeable{
    public void recharge(){
        System.out.println("Mobile phone is recharging.");
    } 
}
class PortableDevice extends MobilePhone implements Rechargeable{
    public void recharge(){
        System.out.println("Portable device is recharging");
    }
}

public class ps4q2 {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.recharge();
        MobilePhone m = new MobilePhone();
        m.recharge();
        PortableDevice p = new PortableDevice();
        p.recharge();   
    }
}
