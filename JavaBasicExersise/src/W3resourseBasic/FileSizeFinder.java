package W3resourseBasic;

import java.util.Scanner;
import java.io.File;

public class FileSizeFinder {
    public static void main(String[] args) {
        String[] filePaths = {
                "/home/students/abc.txt",
                "/home/students/test.txt"
        };

        for (String path : filePaths) {
            File file = new File(path);

            if (file.exists()) {
                long size = file.length(); // ফাইল সাইজ in bytes
                System.out.println(path + " : " + size + " bytes");
            } else {
                System.out.println(path + " : File not found");
            }
        }
    }
}
