package JavaBasics;

class Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}


class ICICI extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 10;
    }
}


public class ROI {

    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        Bank b = new Bank();

        double cibilscroe = 7.0;
        int rateofinterest = 0;
        if (cibilscroe >= 8.0) {
            rateofinterest = b.getRateOfInterest();
        } else if (cibilscroe >= 7.5 & cibilscroe < 8) {
            rateofinterest = s.getRateOfInterest();
        } else if (cibilscroe >= 6.5 & cibilscroe < 7.5) {
            rateofinterest = i.getRateOfInterest();
        } else if (cibilscroe >= 5.5 & cibilscroe < 6.5) {
            rateofinterest = a.getRateOfInterest();
        } else {
            System.out.println("You are not elgible for loan");
        }
        System.out.println("SBI Rate of Intrest : " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Intrest : " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Intrest : " + a.getRateOfInterest());
        System.out.println("Main Bank Rate of Intrest : " + b.getRateOfInterest());

        System.out.println("Rate of Intrest Based on your cibil scrore : " + rateofinterest);

    }

}
