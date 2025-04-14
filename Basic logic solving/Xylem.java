public class Xylem {

    public static boolean xylemNum(int a) {
        int last_num = a % 10;
        a /= 10;
        int middle_num = 0;

        // Sum of middle digits
        while (a >= 10) {
            middle_num += a % 10;
            a /= 10;
        }

        int first_num = a;
        int extreme_sum = first_num + last_num;

        return extreme_sum == middle_num;
    }

    public static void main(String[] args) {
        int num = 143;

        if (xylemNum(num)) {
            System.out.println(num + " is a Xylem number.");
        } else {
            System.out.println(num + " is a Phloem number.");
        }
    }
}
