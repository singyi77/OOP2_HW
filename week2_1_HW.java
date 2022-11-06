import java.util.*;
import java.security.SecureRandom;

public class week2_1_HW{
    public static void main(String[] args){
        var tset = new TreeSet<>();
        
        SecureRandom randomNumbers = new SecureRandom();
        System.out.println("電腦從 1~100 的整數中，亂數取出 10 個不重複的號碼....");
        int i = 1;
        while (i <= 10){
            int number = 1 + randomNumbers.nextInt(100);
            if (!tset.contains(number)){
                tset.add(number);
                System.out.printf("第 %d 個號碼 : %d\n", i, number);
                i++;
            }
        }
        System.out.printf("物件內元素個數為 : %d\n", tset.size());
        System.out.printf("物件內元素的內容 : %s\n", tset);
        System.out.printf("第一個元素內容為 : %s\n", tset.first());
        System.out.printf("最後一個元素內容 : %s\n", tset.last());
        System.out.printf("內容介於 30~70 者 : %s\n", tset.subSet(30, 70));
    }
}