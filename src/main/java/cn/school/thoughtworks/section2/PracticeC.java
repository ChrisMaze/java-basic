package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import  java.util.HashMap;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {

        Map<String , Integer> map = new HashMap();
        for (String temp : collection1) {
            Integer count = map.get(temp);
            if(temp.contains("-"))
            {
                int index = temp.indexOf("-");
                Integer count1 = map.get(temp.substring(0,index));
                map.put(temp.substring(0,index) , (count1 == null ) ? Integer.parseInt(temp.substring(index+1)) : count1 +
                        Integer.parseInt(temp.substring(index+1)));
                continue;
            }
            if(temp.contains(":"))
            {
                int index = temp.indexOf(":");
                Integer count1 = map.get(temp.substring(0,index));
                map.put(temp.substring(0,index),(count1 == null ) ? Integer.parseInt(temp.substring(index+1)) : count1 +
                        Integer.parseInt(temp.substring(index+1)));
                continue;
            }
            if(temp.contains("["))
            {
                int index0 = temp.indexOf("[");
                int index1 = temp.indexOf("]");
                Integer count1 = map.get(temp.substring(0,index0));
                map.put(temp.substring(0,index0),(count1 == null ) ? Integer.parseInt(temp.substring(index0+1,index1)) : count1 +
                        Integer.parseInt(temp.substring(index0+1,index1)));
                System.out.println(temp.substring(0,index0));
                continue;
            }
            map.put(temp,(count == null) ? 1 : count + 1);
        }


        return map;
    }
}
