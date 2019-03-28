package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        for (String temp : object.get("value")) {
            if (collectionA.containsKey(temp))
            {
                int div = collectionA.get(temp)/3;
                collectionA.put(temp,collectionA.get(temp)-div);
            }
        }
        return collectionA;

    }
}
