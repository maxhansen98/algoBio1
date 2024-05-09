import java.util.ArrayList;
import java.util.List;

public class SMSS {
    public static List<Integer> efficientMSS(int[] scores) {
        List<Integer> maximalSubsequences = new ArrayList<>();
        int maxScore = Integer.MIN_VALUE;
        int currentScore = 0;
        int maxTotalScore = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < scores.length; i++) {
            currentScore += scores[i];

            if (currentScore > maxScore) {
                maxScore = currentScore;
                maxTotalScore = maxScore;
                start = tempStart;
                end = i;
            }

            if (currentScore < 0) {
                currentScore = 0;
                tempStart = i + 1;
            }
        }

        maximalSubsequences.add(start+1);
        maximalSubsequences.add(end+1);

        System.out.println("Ausgabe: " + maximalSubsequences + " mit Score " + maxTotalScore);
        return maximalSubsequences;
    }
}

