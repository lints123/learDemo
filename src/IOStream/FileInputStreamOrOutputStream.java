package IOStream;

import java.io.*;

// 定义字节流
public class FileInputStreamOrOutputStream {
    File f1 = new File("D:\\test\\1.txt");
    File f2 = new File("D:\\test\\2.txt");

    public void fileInput() {
        try {
            if(f2.exists()){
                f2.delete();
            }
            // 输入流
            FileInputStream fileInputStream = new FileInputStream(f1);

            // 输出流
            FileOutputStream fileOutputStream = new FileOutputStream(f2);

            byte[] b = new byte[1024];
            int len = -1;
            while ((len = fileInputStream.read(b)) != -1) {
                System.out.println("当前参数 >>> "+len);
                fileOutputStream.write(b, 0, len);
            }
            System.out.println("当前参数 >>>>>> "+len);
            fileOutputStream.close();
            System.out.println("复制成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileInput1(){
        try {
            FileInputStream fileInputStream = new FileInputStream(f1);
            StringBuffer sb = new StringBuffer();

            byte[] buf = new byte[1024];
            int len = -1;
            while ((len = fileInputStream.read(buf)) != -1) {
                sb.append(new String(buf, 0, buf.length));
            }
            System.out.println("当前返回结果 >>> " +sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
