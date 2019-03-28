package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        for (String temp : object.get("value")) {
            if (collectionA.containsKey(temp))
            {
                collectionA.put(temp,collectionA.get(temp)-1);
            }
        }
        return collectionA;
    }
}
