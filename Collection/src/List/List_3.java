package List;

import java.util.ArrayList;
import java.util.List;

// ArrayList의 사용법 (메서드사용법)
public class List_3 {
    public static void main(String[] args) {
        List<Integer> aList1 = new ArrayList<>();
        // #1. add (요소추가, 맨뒤에 추가)
        aList1.add(3);
        aList1.add(4);
        aList1.add(5);
        System.out.println(aList1); // [3,4,5]
        // #2. add(int index, E element) (요소추가, 특정 위치에 추가)
        aList1.add(1,6);
        System.out.println(aList1); // [3,6,4,5]
        // #3. addAll (또 다른 리스트를 뒤에 추가)
        List<Integer> aList2 = new ArrayList<>();
        aList2.add(1);
        aList2.add(2);
        aList2.addAll(aList1);
        System.out.println(aList2); // [1, 2, 3, 6, 4, 5]
        // #4. addAll (특정위치에 리스트 추가)
        List<Integer> aList3 = new ArrayList<>();
        aList3.add(1);
        aList3.add(2); // [1,2]
        aList3.addAll(1,aList3);
        System.out.println(aList3); // [1,1,2,2]
        // #5. set (수정)
        aList3.set(1,5);
        aList3.set(3,6);
        System.out.println(aList3); // [1, 5, 2, 6]
        // #6. remove(int index) 해당 인덱스의 요소 삭제
        // (주의)정수의 리스트인 경우에는 정수를 매개변수에 넣으면 인덱스로 인식함!!
        aList3.remove(1); // 1이 아니라 5가 삭제됨
        System.out.println(aList3); // [1, 2, 6]
        // #7. remove(Object o) 해당 요소를 찾아서 삭제
        aList3.remove(Integer.valueOf(2));
        System.out.println(aList3); // [1, 6]
    }
}








