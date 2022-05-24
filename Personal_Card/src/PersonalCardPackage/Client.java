package PersonalCardPackage;

public class Client {
    private int id;
    private String fio;
    private String adress;
    private String phone;

    //    Конструктор
    public Client(int id, String fio, String adress, String phone) {
        this.id = id;
        this.fio = fio;
        this.adress = adress;
        this.phone = phone;
    }


    public void PrintInfo() {
        System.out.println("id: " + this.id + " fio: " + this.fio + " adress: " + this.adress + " phone: " + this.phone);
    }

}
