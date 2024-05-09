import java.util.ArrayList;
import java.util.List;

public class MSS {
    public static List<List<Integer>> efficientMSS(int[] scores) {
        List<List<Integer>> maximalSubsequences = new ArrayList<>();
        int maxScore = Integer.MIN_VALUE;
        int currentScore = 0;

        for (int score : scores) {
            currentScore = Math.max(score, currentScore + score);
            maxScore = Math.max(maxScore, currentScore);
        }

        currentScore = 0;
        List<Integer> subsequence = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            currentScore = Math.max(scores[i], currentScore + scores[i]);
            if (currentScore == maxScore) {
                subsequence.add(i + 1); // Indices are 1-based
            } else if (currentScore < 0) {
                subsequence.clear();
                currentScore = 0;
            } else if (!subsequence.isEmpty()) {
                maximalSubsequences.add(new ArrayList<>(subsequence));
                subsequence.clear();
            }
        }

        if (!subsequence.isEmpty()) {
            maximalSubsequences.add(subsequence);
        }

        System.out.println("Ausgabe: " + maximalSubsequences + " mit Score " + maxScore);
        return maximalSubsequences;
    }
}