package io_binary;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SanPhamFile {
    private static final String TEN_FILE_SANPHAM = "D:\\MD2\\BT\\src\\io_binary\\sanpham.txt";

    //Ghi list san pham
    public void write(List<SanPham> sanPhamList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(TEN_FILE_SANPHAM);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(sanPhamList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }


    //Doc list san pham
    public List<SanPham> read() throws IOException {
        List<SanPham> sanPhamList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(TEN_FILE_SANPHAM);
            ois = new ObjectInputStream(fis);
            sanPhamList = (List<SanPham>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return sanPhamList;
    }

    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
