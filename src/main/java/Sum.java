import java.util.Arrays;

/**
 * Created by SNY on 30.10.2016.
 */
public class Sum {
    static int sum1(int args[]) {
        int sum = 0;
        int len = args.length;
        for (int i = 0; i < len; i++) {
            sum += args[i];
        }
        return sum;
    }

    static int sum2(int args[]) {
        int sum = 0;
        int len = args.length;
        int i = 0;
        while (i < len) {
            sum += args[i];
            i++;
        }
        return sum;
    }

    static int sum3(int args[]) {
        int len = args.length;
        if ( len == 0 ) return 0;
        int tail[] = Arrays.copyOfRange(args, 1, len);
        int sum = args[0] + sum3(tail);
        return sum;
    }

    public static void main (String args[]) {
        int[] arr = {1, 2, 3, 4};
        int len = arr.length;
        System.out.println("Lenght=" + len);
        for (int i = 0; i < len; i++) {
            System.out.println(i + " " + arr[i]);
        }

        // for
        int s1 = sum1(arr);
        System.out.println("sum1 = " + s1);

        // while
        int s2 = sum2(arr);
        System.out.println("sum2 = " + s2);

        // recursive
        int s3 = sum3(arr);
        System.out.println("sum3 = " + s3);
    }
}
