package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.Collections;


public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map map = new HashMap();
        for (String temp : collection1) {
            Integer count = map.get(temp);
            map.put(temp,(count == null) ? 1 : count + 1);
        }


        return map;
    }
}
