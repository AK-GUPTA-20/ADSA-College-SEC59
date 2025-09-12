public class Third03 {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int minNotes(int[] arr) {
        int n = arr.length;

        int total = 0;
        for (int x : arr) {
            total += x;
        }

        int gAll = 0;
        for (int x : arr) {
            gAll = gcd(gAll, x);
        }
        int best = total / gAll;  

        for (int i = 0; i < n; i++) {
            int g = 0;
            int sumExcluding = 0;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                g = gcd(g, arr[j]);
                sumExcluding += arr[j];
            }

            if (g > 0) {
                int notes = (sumExcluding / g) + 1; 
                if (notes < best) {
                    best = notes;
                }
            }
        }

        return best;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3};
        int result = minNotes(arr);
        System.out.println("Minimum notes needed = " + result);
    }
}
