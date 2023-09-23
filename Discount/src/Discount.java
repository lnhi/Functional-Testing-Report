import java.util.*;

public class Discount {
    public int check(int start, int time) {
        if((start > 23 || start < 0) || (time > 180 || time < 0))
            return -1;
        else if(time > 60 && time <= 180) {
            if(start >= 20 || start < 8)
                return 3;
            else return 1;
        }
        else {
            if(start >= 20 || start < 8)
                return 2;
            else return 0;
        }
    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int start = in.nextInt();
//        int time = in.nextInt();
//        Discount a = new Discount();
//        System.out.print(a.check(3, 4));
//    }
}