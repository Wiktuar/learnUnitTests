package finalHomeWork;

import java.util.List;

public class AverageList {

    private final List<Integer> list;

    public AverageList(List<Integer> list) {
        this.list = list;
    }

    public double getAverage(){
        double average = list.stream().mapToInt(e -> e).average().getAsDouble();
        return Math.round(average * 100.0)/100.0;
    }
}
