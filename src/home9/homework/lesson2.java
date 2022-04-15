package home9.homework;

import java.util.ArrayList;

public class lesson2 {

    public static void main(String[] args) {

        ArrayList<Mp3> mp3List = new ArrayList<Mp3>();


        mp3List.add(new Mp3("Ария - Осколок льда", "D:\\mp3list"));
        mp3List.add(new Mp3("Ария - Ангельская пыль", "D:\\mp3list"));
        mp3List.add(new Mp3("Ария - Улица роз", "D:\\mp3list"));
        mp3List.add(new Mp3("Ария - Улица роз", "D:\\mp3list"));
        mp3List.add(new Mp3("Ария - Штиль", "D:\\mp3list"));
        mp3List.add(new Mp3("Ария - Раскачаем этот мир", "D:\\mp3list"));

        showSong(mp3List);

        System.out.println("--------test--------");
        //searchSong(mp3List, "м клавиатура hhhh мир");
        //searchSong(mp3List, " hhhh мир");
//        searchSong(mp3List, "клавиатура hhhh пыль пыль пыль");
        searchSong(mp3List, "ария штиль");
        //searchSong(mp3List, "улица hhhh 123123");
        //searchSong(mp3List, "улица hhhh 123123 Штиль");
        //searchSong(mp3List, "мир hhhh 123123 Раскачаем ывп2е8пгывпл2п");

    }

    private static void searchSong(ArrayList<Mp3> list, String nameSong) {
        System.out.println("Ищу в альбоме сочетание слов: " + nameSong);

        String[] match = nameSong.trim().toLowerCase().split(" ");
        ArrayList<Mp3> newList = new ArrayList<>();
        System.out.println(match.length);

        var countSong = 0;
        for (int i = 0; i < list.size(); i++) {
            // беру мелодию из листа
            String[] sentence = list.get(i).getName().toLowerCase().split(" ");
            // каждое слово из мелодии сравниваю с тем что ищу
            for (int k = 0; k < match.length; k++) {
                for (String word : sentence) {
                    if (word.equals(match[k])) {
                        // чтобы не дублироваося в выводе песня например при таком поиске "мир hhhh 123123 Раскачаем ывп2е8пгывпл2п"
                        // или "клавиатура hhhh пыль пыль пыль"
                        if (newList.contains(list.get(i))){
                            continue;
                        } else{
                            countSong++;
                            newList.add(list.get(i));
                        }
                    }
                }
            }
        }
        System.out.println("Найдено песен " + countSong);
        showSong(newList);
    }


    private static void showSong(ArrayList<Mp3> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
