package August4;

class Bank {

    public Bank() {
    }

    Number getRateOfInterest() {
        return 5;

    }
}

class SBI extends Bank 
{
    //Bank(){}
   Integer getRateOfInterest() {
        return 6;
    }

}

class ICICI extends Bank {

    Float getRateOfInterest() {
        return 7.0F;
    }

}

public class Method_Override {

    public static void main(String[] args) {
        Bank a = new Bank();
        SBI b = new SBI();
        ICICI c = new ICICI();
        System.out.println(a.getRateOfInterest());
        System.out.println(b.getRateOfInterest());
        System.out.println(c.getRateOfInterest());

    }

}
