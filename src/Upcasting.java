// when overriding and upcasting happen always overriding will execute
class Police
{
    public void lockdown()
    {
        System.out.println("Stay at Home LoveGuru");
    }
}
class BF extends Police
{
    public void meetGF()
    {
        System.out.println("Want to Meet");
    }
}
// convert subclass object into super
public class Upcasting
{
    public static void main(String[] args) {
        Police p=new BF(); // create obj of subclass and store it into super class ref.
        p.lockdown(); // in upcasting only super class data members are visible
    }

}
