package home10.files;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Реализовать пример записи в файл:
 * • запись в файл текстовых данных с помощью буфера
 * (в примере урока запись выполняется напрямую в файл)
 */
public class homework3 {



    public static void main(String[] args)  {


        // 1
        int bufferSize = 8 * 1024;

        OutputStream outputStream =
                null;
        try {
            outputStream = new BufferedOutputStream(
                    new FileOutputStream("D:\\bufferOuput-file.txt"), bufferSize);

            String strBuff = "strBUff test";
            byte[] buffer2 = strBuff.getBytes(StandardCharsets.UTF_8);
            outputStream.write(buffer2);
            outputStream.close();
        } catch (IOException e) {
                throw new RuntimeException(e);
        }

        //2
        String str = "Запись в файл";

        try {
            File file = new File("D:\\buffOutput3.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
