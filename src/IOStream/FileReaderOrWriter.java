package IOStream;

import java.io.*;

// 字符流
public class FileReaderOrWriter {
    File f1 = new File("D:\\test\\3.txt");
    File f2 = new File("D:\\test\\4.txt");

    public void fileReader(){
        try {
            // 解决乱码问题
            InputStreamReader isr = new InputStreamReader(new FileInputStream(f1), "GBK");
            // 字符流
            BufferedReader read = new BufferedReader(isr);


            FileReader r1 = new FileReader(f1);
            FileWriter w1 = new FileWriter(f2);
            int len = -1;
            char[] b = new char[1024];
            while((len = read.read(b))!=-1){
                w1.write(b,0,len);
            }
            read.close();
            w1.flush();
            w1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
