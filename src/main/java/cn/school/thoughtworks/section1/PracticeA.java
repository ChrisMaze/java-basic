package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.ArrayList;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
         List collectionA = new ArrayList<String> (collection1);
         List collectionB = new ArrayList<String> (collection2);
         collectionA.retainAll(collectionB);
      return collectionA;
    }
}
