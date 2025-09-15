package exercises.system_alphabeticalOrder.model.services;

import java.util.List;

public class CalculateService {

    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty() || list == null) {
            throw new IllegalArgumentException("The list this empty or null");

        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;

            }

        }
        return max;

    }

}
