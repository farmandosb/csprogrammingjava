public class TrinomialDP {

    // Returns the trinomial coefficient T(n, k).
    public static long trinomial(int n, int k){
        long[] result = new long[n+1];

        if(n == 0 && k == 0) return 1;
        else if(k < -n || k > n) return 0;
        else{
            return result[n];
        }

    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args){
        System.out.println(trinomial(3,3));

    }
}
