package com.java.fm.ch6;

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3,5);
        System.out.println(result);

        int[] result2 = {0};
        r.add(3,5,result2);
        System.out.println(result2[0]);
    }   //main

    int add(int a, int b) {
        return a + b;
    }
    void add(int a, int b, int[] result) {
        result[0] = a + b;
    }
}
/*
자바에서 배열은 객체입니다. 따라서 배열을 메서드의 매개변수로 전달할 때 실제로는 배열의 메모리 주소, 즉 참조(reference)가 전달됩니다.
메서드 내에서 매개변수로 전달받은 배열의 요소를 변경하면
그 변경사항이 메서드를 호출한 곳에서도 반영됩니다
왜냐하면 메서드 내외부에서 동일한 배열 객체를 참조하고 있기 때문입니다
이러한 메커니즘은 배열뿐만 아니라 모든 객체 타입에 적용됩니다
객체를 매개변수로 전달할 때는 항상 그 객체의 참조가 전달되므로
메서드에서 객체의 상태를 변경하면 호출한 곳에서도 그 변경사항을 볼 수 있습니다.

void add 메서드는 반환값이 없는 void 타입이지만,
이 메서드는 매개변수로 전달된 배열 result의 첫 번째 요소(result[0])에 a와 b의 합을 저장합니다.
자바에서 배열은 참조 타입이기 때문에, 메서드에 배열을 매개변수로 전달할 때 실제 배열 객체에 대한 참조가 전달됩니다.
따라서 메서드 내에서 배열의 내용을 변경하면, 메서드 외부에 있는 원본 배열도 그 변경 사항이 반영됩니다.

main 메서드에서 int[] result2 = {0};로 배열을 생성하고 이를 add 메서드에 전달하면
add 메서드는 이 배열의 첫 번째 요소에 3   과 5를 더한 값을 저장합니다
즉, result[0] = a + b;에서 result[0]이 result2[0]이 되며, a + b가 3 + 5이므로 result2[0]의 값은 8이 됩니다.

이렇게 메서드 호출 후에 System.out.println(result2[0]);를 통해
result2[0]의 값을 출력하면, 변경된 값인 8이 출력됩니다.
이는 반환값이 없더라도 참조에 의한 호출(call by reference)을 통해 객체의 상태를 변경할 수 있음을 보여줍니다.
 */
