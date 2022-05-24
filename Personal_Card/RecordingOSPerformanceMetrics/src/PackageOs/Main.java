package PackageOs;

public class Main {
    public static void main(String[] args) {
        OsMethods oss = new OsMethods();
        if(oss.isWindows()){
            System.out.println("This is Windows");
            System.out.println("It's version is: " + oss.getOSVerion());
        }else if(oss.isMac()){
            System.out.println("This is MacOS");
            System.out.println("It's version is: " + oss.getOSVerion());
        }else if(oss.isUnix ()){
            System.out.println("This is Unix or Linux OS");
            System.out.println("It's version is: " + oss.getOSVerion());
        }else{
            System.out.println("This is unknown OS");
        }
        System.out.println("Version: " + oss.getOSVerion());

        oss.InfoUser();

        oss.InfoCores();

        oss.InfoMemory();

        oss.Info();

        oss.NameOfRazdel();




    }
}