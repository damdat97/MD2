package io_textfile.copytextfile;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String pathOriginal = "D:\\MD2\\BT\\src\\io_textfile\\copytextfile\\original.txt";
        String pathClone = "D:\\MD2\\BT\\src\\io_textfile\\copytextfile\\clone.txt";
        File original;
        File cloneOriginal;

        try {
            original = new File(pathOriginal);
            if (!original.exists()) {
                original.createNewFile();
            }
            cloneOriginal = new File(pathClone);
            if (!cloneOriginal.exists()) {
                cloneOriginal.createNewFile();
            }
            TextFileCopy.copyFile(original, cloneOriginal);
            System.out.println("Successful!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
