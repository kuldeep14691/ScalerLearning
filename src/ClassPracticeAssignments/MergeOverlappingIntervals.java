package ClassPracticeAssignments;
//TODO: understand this clearly later not fully confident yet
public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] bookedSlots = {{1,2},{5,6}};
        int start=bookedSlots[0][0],end=bookedSlots[0][1];

        for (int i = 0; i < bookedSlots.length; i++) {
            int left=bookedSlots[i][0], right =bookedSlots[i][1];
            if (left<end) {
                end=Math.max(end,right);
            }else {
                System.out.println(start + " " + end);
                start=left;
                end=right;
            }
        }
        System.out.println(start + " , " + end);
    }
}
