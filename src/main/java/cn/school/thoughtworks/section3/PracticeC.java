package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import  java.util.HashMap;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String , Integer> map = new HashMap();
        for (String temp : collectionA) {
            Integer count = map.get(temp);
            map.put(temp,(count == null) ? 1 : count + 1);
        }
        for (String temp : object.get("value")) {
            if (map.containsKey(temp))
            {
                int div = map.get(temp)/3;
                map.put(temp,map.get(temp)-div);
            }
        }
        return map;
    }
}
