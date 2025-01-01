package com.java.fm.ch11;
import java.util.*;
import static java.util.Collections.*;
public class CollectionsEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println("list = " + list);

        addAll(list, 1, 2, 3, 4, 5);
        System.out.println("addAll -> list = " + list);

        rotate(list, 2);
        System.out.println("rotate -> list = " + list);       // 오른쪽으로 2칸씩 이동.
        
        swap(list, 0, 2);
        System.out.println("swap -> list = " + list);       // 1, 3번째 값의 위치를 바꿈.

        shuffle(list);
        System.out.println("shuffle -> list = " + list);

        sort(list, reverseOrder());                         // 역순 정렬. (reverse(list);와 동일)
        System.out.println("sort (reverseOrder) -> list = " + list);

        sort(list);
        System.out.println("sort -> list = " + list);

        int idx = binarySearch(list, 3);                // 3이 저장된 위치(index)를 반환.
        System.out.println("index of 3 = " + idx);

        System.out.println("max = " + max(list));
        System.out.println("min = " + min(list));
        System.out.println("min = " + max(list, reverseOrder()));       // 역순의 최댓값이므로 최솟값.
                                                                        // (Comparator.reverseOrder()를 사용하면, 값의 대소 관계가 뒤바뀌므로 작은 값이 가장 큰 값으로 간주됨)

        fill(list, 9);                                      // list를 9로 채움.
        System.out.println("fill -> list = " + list);

        List newList = nCopies(list.size(), 2);             // 기존 list와 같은 크기의 새로운 list생성 + 2로 채움 (불변 리스트)
        System.out.println("newList = " + newList);

        System.out.println(disjoint(list, newList));            // 공통요소가 없다면 true.

        copy(list, newList);
        System.out.println("newList = " + newList);
        System.out.println("list = " + list);

        replaceAll(list, 2, 1);
        System.out.println("replaceAll(2를 1로) -> list = " + list);

        Enumeration e = enumeration(list);              // 리스트를 Enumeration 객체로 변환.
        ArrayList list2 = list(e);                      // Enumeration 객체를 다시 ArrayList로 변환.
        System.out.println("list2 = " + list2);
    }
}
