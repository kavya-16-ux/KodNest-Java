public class P02_PracticeTrack {
    public static void main(String[] args) {
        int roundCode = 4;
        int attemptsUsed = 2;
        int maxAttempts = 3;
        String roundName;

        switch(roundCode){
            case 1:
                System.out.println("Current Round: Aptitude Round");
                break;
            case 2:
                System.out.println("Current Round: Technical Round");
                break;
            case 3:
                System.out.println("Current Round: HR round");
                break;
            case 4:
            case 5:
                System.out.println("Current Round: Final Review");
                break;
            default:
                System.out.println("Current Round: Invalid Round");
        }

        roundName = attemptsUsed < maxAttempts ? "Attempt Available" : "Attempt Limit Reached";
        System.out.println("Attempt Status: " + roundName);
    }
}