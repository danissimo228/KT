package PackageOs;

import java.nio.file.FileStore;
import java.nio.file.FileSystems;

public class OsMethods {
    Runtime runtime = Runtime.getRuntime();
    public static boolean isWindows() {

        String os = System.getProperty("os.name").toLowerCase();
        //windows
        return (os.indexOf("win") >= 0);

    }

    public static boolean isMac() {

        String os = System.getProperty("os.name").toLowerCase();
        //Mac
        return (os.indexOf("mac") >= 0);

    }

    public static boolean isUnix() {

        String os = System.getProperty("os.name").toLowerCase();
        //linux or unix
        return (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0);

    }

    public static String getOSVerion() {
        String os = System.getProperty("os.version");
        return os;
    }

    public void InfoUser() {
        System.out.println(System.getProperty("user.name"));
    }

    public void InfoCores() {
        System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());
    }

    public void InfoMemory() {
        float mb = 1024*1024;
        System.out.println("Max Memory:" + runtime.maxMemory() / mb);
    }

    public void Info() {
        System.out.println(System.getProperty("os.arch"));
    }

    public void NameOfRazdel() {
        for (FileStore fs: FileSystems.getDefault().getFileStores()) {
            System.out.println("Name: " + fs.name());
            System.out.println("Type: " + fs.type());
        }
    }
}
