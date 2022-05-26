package ba.kripas.jplag;

public class JPlagComparisonWrapper {
    private final String firstSubmissionName;
    private final String secondSubmissionName;

    private final float maximalSimilarity;
    private final float minimalSimilarity;
    private final float similarity;

    public JPlagComparisonWrapper(String firstSubmissionName, String secondSubmissionName, float maximalSimilarity, float minimalSimilarity, float similarity) {
        this.firstSubmissionName = firstSubmissionName;
        this.secondSubmissionName = secondSubmissionName;
        this.maximalSimilarity = maximalSimilarity;
        this.minimalSimilarity = minimalSimilarity;
        this.similarity = similarity;
    }

    public String getFirstSubmissionName() {
        return firstSubmissionName;
    }

    public String getSecondSubmissionName() {
        return secondSubmissionName;
    }

    public float getMaximalSimilarity() {
        return maximalSimilarity;
    }

    public float getMinimalSimilarity() {
        return minimalSimilarity;
    }

    public float getSimilarity() {
        return similarity;
    }
}