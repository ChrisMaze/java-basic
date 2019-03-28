package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.ArrayList;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List collectionA = new ArrayList<String> (collection1);
        List collectionB = new ArrayList<String> (collection2.get(0));
        collectionA.retainAll(collectionB);
        return collectionA;
    }
}
