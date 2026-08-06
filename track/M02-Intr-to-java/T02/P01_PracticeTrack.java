
public class P03_PracticeTrack {

    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        boolean activeBacklog = false;
        boolean projectCompleted = true;
        int mockInterviewScore = 65;

        boolean academicEligible = marks >= 60;
        boolean attendenceEligible = attendance >= 75;

        if (marks <= 60) {
            System.out.println("Improve Academic Eligibility");
        } else if (academicEligible && !projectCompleted) {
            System.out.println("Complete the Project");
        } else if (projectCompleted && mockInterviewScore < 70) {
            System.out.print("Improve Interview Skills");
        } else {
            System.out.println("Placement Ready");
        }
    }
}
