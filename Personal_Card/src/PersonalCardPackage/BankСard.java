package PersonalCardPackage;

public class BankСard {
    String number;
    String type;
    String validity;
    String nameOfBank;
    String cvc;


    public BankСard(String number, String type, String validity, String nameOfBank, String cvc) {
        this.number = number;
        this.type = type;
        this.validity = validity;
        this.nameOfBank = nameOfBank;
        this.cvc = cvc;
    }

    public void PrintInfoCard () {
        System.out.println(" number of card: " + this.number + " type of card: " + this.type + " validity: " +
                this.validity + " name of bank: " + nameOfBank + " cvc code: " + cvc);
    }
}
