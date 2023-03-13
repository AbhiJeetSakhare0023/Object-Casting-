// convert super to sub
// convert upcasted into downcast

class Policee{
    public void lockdown()
    {
        System.out.println("Stay at Home");
    }
    public void showCert()
    {
        System.out.println("Show certificate & go anywhere");
    }
}
class BFF extends Policee{
   public void meetGF()
   {
       System.out.println("Want to meet");
   }
}
public class Downcasting {
    public static void main(String[] args) {
        // upcasting
        Policee p1=new BFF();
        // if we write p1. -- > only lockdown and show method will we see

        // Downcasting
        BFF b1 = (BFF) p1; // here we converted upcasted into downcast
        b1.lockdown();
        b1.showCert();
        b1.meetGF();
    }
}
