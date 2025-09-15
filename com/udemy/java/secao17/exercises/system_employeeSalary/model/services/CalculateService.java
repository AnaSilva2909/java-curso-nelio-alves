package exercises.system_employeeSalary.model.services;

import java.util.List;

public class CalculateService {

    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("The list this Empty or null");
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
