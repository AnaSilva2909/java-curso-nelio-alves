package exercises.system_LargestInterger.application.model.services;

import java.util.List;

public class CalculateService {

    public static <T extends Comparable<T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalArgumentException("The list is empty");
        }
        T max = list.get(0);
        for(T l:list){
            if (l.compareTo(max) > 0) {
                max = l;
                
            }


        }
        return max;

    }

    
}
