public class OddSquareSum {
    public static void main (String[] args){
        long k = 641000 / 2; // no. of odd nos.
        long sum = k * (2 * k - 1) * (2 * k + 1) / 3;
        System.out.println("Sum of odd numbers " + sum);

    }
}
