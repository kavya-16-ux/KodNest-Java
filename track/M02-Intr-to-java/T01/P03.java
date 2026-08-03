
public class P03 {

    public static void main(String[] args) {

        int completeTopics = 17;
        int totalTopics = 20;
        int DailyLearningHours = 3;
        int LearningDays = 5;

        double ProgressPercentage = (double) completeTopics * 100 / totalTopics;
        int remainingTopic = totalTopics - completeTopics;
        int weeklyLearningHours = DailyLearningHours * LearningDays;

        System.out.println("Completed Topics: " + completeTopics);
        System.out.println("Remaining Topics: " + remainingTopic);
        System.out.println("Weekly Learning Hours: " + weeklyLearningHours);
        System.out.println("Progress Percentage: " + ProgressPercentage);
    }
}
