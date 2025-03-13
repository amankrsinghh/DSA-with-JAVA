public class loop {

    public static void main(String[] args) {

        updatePose();

    }
    public static void updatePose() {
        int currentPoseIndex = 0;
        String[] poses = {"Downward Dog", "Child's Pose", "Jumping Jack","push up","Alom vilom","sushil","aman","baba","ayush","guyzzz" };
        if (currentPoseIndex < poses.length) {
            System.out.println((currentPoseIndex + 1) + ". " + poses[currentPoseIndex]);

        }
    }
}
