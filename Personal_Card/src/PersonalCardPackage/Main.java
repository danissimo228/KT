package PersonalCardPackage;

import java.util.Scanner;
import java.io.*;
import java.util.Date;
import java.text.*;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Client.txt");
        Scanner sc = new Scanner(System.in);
        FileWriter writer = new FileWriter(file, true);

        int i;
        String ffff, a, p;
        System.out.println("Ведите fio");
        ffff = sc.nextLine();
        System.out.println("Ведите adress");
        a = sc.nextLine();
        System.out.println("Ведите phone");
        p = sc.nextLine();
        System.out.println("Ведите id");
        i = sc.nextInt();

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());

        writer.write(formatter.format(date) + "\n" + "ID: " + i + "\n" + "fio: " + ffff + "\n" + "adress: " + a + "\n" +
                "phone: " + p + "\n");
        writer.flush();
        writer.close();

        Client g = new Client(i, ffff, a, p);
        g.PrintInfo();

        File filee = new File("Client.txt");
        FileWriter writerr = new FileWriter(filee, true);

        String num, typ, val, namefb, cv;
        System.out.println("Ведите тип карты");
        typ = sc.nextLine();
        System.out.println("Ведите срок действия");
        val = sc.nextLine();
        System.out.println("Ведите название банка");
        namefb = sc.nextLine();
        System.out.println("Ведите cvc код");
        cv = sc.nextLine();
        System.out.println("Ведите номер карты");
        num = sc.nextLine();

        writerr.write(formatter.format(date) + "\n" + "card number: " + num + "\n" + "type: " + typ + "\n" + "validity: " + val + "\n" +
                "name of bank: " + namefb + "\n" + "cvc code: " + cv + "\n" + "------------------------------------------" + "\n");
        writerr.flush();
        writerr.close();

        BankСard card = new BankСard(num,typ,val,namefb,cv);
        card.PrintInfoCard();


    }
}