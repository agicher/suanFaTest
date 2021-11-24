import javax.xml.crypto.Data;
import java.util.Date;

public class q1 {
    public static int findDouble(Long n){
        int sum = 0;
        for (long i = 1; i<=n;i++){

            String s = String.valueOf(i);
            int length = s.length();
            if (length%2==0){
                if (s.substring(0,length/2).equals(s.substring(length/2,length)))sum++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Date date = new Date();
        long start = System.currentTimeMillis();
        System.out.println(findDouble((900000000L)));
        System.out.println(System.currentTimeMillis() - start);

//        String str = "12345678";
//        System.out.println(str.substring(0, str.length() / 2));
    }
}
//            char[] chars = String.valueOf(i).toCharArray();
//            int length = chars.length;
//            if (length%2==0){
//                int x = 0;
//                int y = length/2;
//
//             while (x<length/2 ){
//                 if (chars[x] == chars[y]){
//                     x++;y++;
//                 }else {
//                     break;
//                 }
//             }
//
//             if (x == length/2)sum++;
//
//            }