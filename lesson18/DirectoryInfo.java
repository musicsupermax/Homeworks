package lesson18;

import java.io.File;

public class DirectoryInfo {
    public static void main(String[] args) {
        File catalog = new File("src\\lesson8");
        printDirectoryInfo(catalog);
    }

    public static void printDirectoryInfo(File catalog) {
        if (catalog.isDirectory()) {
            String catalogName = catalog.getName();
            System.out.println("Папка " + catalogName);
            File[] list = catalog.listFiles();
            if (list != null) {
                for (File fileName : list) {
                    if (fileName.isDirectory()) {
                        System.out.println("\t" + fileName + " каталог");
                        printDirectoryInfo(fileName);
                    } else {
                        System.out.println("\t" + fileName + " файл");
                    }
                }
            }
        } else {
            System.out.println(catalog.getName() + " не является каталогом");
        }
    }
}

