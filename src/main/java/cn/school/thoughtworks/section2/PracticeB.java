package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String , Integer> map = new HashMap();
        for (String temp : collection1) {
            Integer count = map.get(temp);
            if(temp.contains("-"))
            {
                String[] arr = temp.split("-");
                map.put(arr[0],Integer.parseInt(arr[1]));
                continue;
            }
            map.put(temp,(count == null) ? 1 : count + 1);
        }


        return map;
    }
}
