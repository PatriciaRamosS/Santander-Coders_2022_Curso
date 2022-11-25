import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int intt = 287_784_875;
        byte bytee = -123;
        long longg= 382_193_813_098_767_856L;
        short shortt = 32_200;
        double doublee = 837.837_098_894_658_903_856_856D;
        float floatt = 53.187_987_534_985_345_947_856F;
        char charr = '9';
        char charr1= 9;
        boolean booleann = true;

        Integer int1 = intt;
        Byte byte1 = bytee;
        Long long1 = longg;
        Short shortt1 = shortt;
        Double double1 = doublee;
        Float float1 = floatt;
        Character char1 = charr;
        Boolean boolean1 = booleann;

        System.out.println(charr+1); //ASCII 9 -> 57 = 57+1=58
        System.out.println(charr1+1); //VALOR 9+1 -> 10

        //CASTING
        int num = 5;
        //                                 System.out.println(num);
        System.out.println((short)num);

        String a = Integer.toString(intt);
        final Integer CONSTANTE = Integer.valueOf(a);
        final List<Integer> list = new ArrayList<>();
        list.add(5);
        System.out.println(list);



    }
}