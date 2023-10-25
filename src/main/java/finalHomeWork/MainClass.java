package finalHomeWork;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Integer[] array = {3, 7, 15};
        AverageList avList = new AverageList(Arrays.asList(array));

        Integer[] array2 = {5, 6, 5};
        AverageList avList2 = new AverageList(Arrays.asList(array2));
        System.out.println(compareAverage(avList.getAverage(), avList2.getAverage()));
    }

    public static String compareAverage(double d1, double d2){
        if(d1 > d2) return "Первый список имеет большее среднее значение";
        else if (d1 < d2) return "Второй список имеет большее среднее значение";
        else return "Средние значения списков равны";
    }
}
