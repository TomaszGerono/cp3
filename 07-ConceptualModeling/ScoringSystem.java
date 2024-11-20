public class ScoringSystem {
    int array[] = new int[5];

    public void setScores(int score_1, int score_2, int score_3, int score_4, int score_5) {
        if (score_1 >= 1 && score_1 <= 5) {
            this.array[0] = score_1;
        }

        if (score_2 >= 1 && score_2 <= 5) {
            this.array[1] = score_2;
        }

        if (score_3 >= 1 && score_3 <= 5) {
            this.array[2] = score_3;
        }

        if (score_4 >= 1 && score_4 <= 5) {
            this.array[3] = score_4;
        }

        if (score_5 >= 1 && score_5 <= 5) {
            this.array[4] = score_5;
        }
    }
}
