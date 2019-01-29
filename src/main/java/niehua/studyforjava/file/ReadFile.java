package niehua.studyforjava.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by niehua.yang on 2019/1/24
 */
public class ReadFile {

    public static void readline(String file) {
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readByteArray(String file) {
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            char[] buf = new char[1024];
            fr.read(buf);
            System.out.println(buf);
            fr.close();
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        readline("C:/Users/niehua.yang/Desktop/test.txt");
        readByteArray("C:/Users/niehua.yang/Desktop/test.txt");
    }

}
