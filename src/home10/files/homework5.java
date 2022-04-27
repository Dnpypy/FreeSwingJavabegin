package home10.files;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;
import java.util.Objects;

public class homework5 {

    public static void main(String[] args) {

        File dir = new File("D:\\Test\\");

        HashSet<String> extList = new HashSet<>();// будет хранить все расширение файлов в данной папке

        // dir.list() имена файлов в текущей папке
        for (String fileName : dir.list()) {
            // получаем полный путь вместе с расширением
            File file = new File(dir.getAbsolutePath() + "\\" + fileName);

            int i = fileName.lastIndexOf(".");
            // если это не папка и в имени файла есть точка(т.е. расширение файла)
            if (file.isFile() && i != 1) {
                //добавляется расширение файла
                extList.add(fileName.substring(i + 1, fileName.length()).toLowerCase());
            }
        }

        System.out.println("Статистика по расширениям файлов для папки " + dir.getAbsolutePath() + " : ");
        // проходимся по всему hashset
        for ( String ext : extList) {
            // для каждого расширения создаем фильтр для фильтрации файлов внутри папки
            FilenameFilter filter = new CustomFileFilter(ext);
            // вывести статистику по каждому расширению
            System.out.println("." + ext + " : " + Objects.requireNonNull(dir.listFiles(filter)).length);
        }
    }
}
