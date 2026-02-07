package ClassPracticeAssignments;

import java.util.Arrays;

public class BeggarOutsideProblemWithRange {
    public static void main(String[] args) {
        int[] Beggars = {0,0,0,0,0,0,0,0,0,0};
        int numberOfBegagrs = Beggars.length;//number of beggars or elements
        //donations or queries definitions {start end amount}
        int[][] donations = {
                {1, 4, 3},
                {0, 5, -1},
                {2, 2, 4},
                {4, 6, 3}
        };

        int numberOfDonations = donations.length; //# of donations or query

        for (int i = 0; i < numberOfDonations; i++) {
            int startIndex = donations[i][0];
            int endIndex = donations[i][1]+1;
            int donationAmount = donations[i][2];

            Beggars[startIndex] += donationAmount;

            if (endIndex<Beggars.length){
                Beggars[endIndex] -= donationAmount;
            }
            System.out.println(Arrays.toString(Beggars));
        }

        //get prefix sum
        for (int i = 1; i < numberOfBegagrs; i++) {
            Beggars[i] += Beggars[i-1];

        }

        System.out.println(Arrays.toString(Beggars));

    }
}
