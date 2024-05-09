// Julius Stein, Max-Malte Hansen; Praxisblatt 1, A2

public class SMSS_Runner {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] scores = {-5, 2, 4, -4, 5};
        System.out.println("Eingabe: " + arrayToString(scores));
        SMSS.efficientMSS(scores);
        long endTime = System.currentTimeMillis();
        System.out.println("Laufzeit: " + (endTime - startTime) + " ms");
    }

    // Utility method to convert an array to a string
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
