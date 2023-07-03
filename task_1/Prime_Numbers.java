package task_1;

//  2. Вывести все простые числа от 1 до 100000
 

import java.util.ArrayList;
import java.util.List;


public class Prime_Numbers {
    static List<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
    for (int i = 2; i < 100; i++) {
        if(checkPrime(i)){
            numbers.add(i);
        }
    }
    System.out.println(numbers);
}

private static boolean checkPrime(int n) {
    for (Integer i : numbers) {
        if(i*i > n ){
            break;
        }else if(n%i==0 )
            return false;
     }
    return true;
}
}


