package labSessions;

import java.lang.management.PlatformManagedObject;

public class RainWaterTrap {
    public static void main(String[] args) {
        int[] A = {2,1,3,2,1,2,3,4,3};
        int waterstored = trap(A);
        System.out.println(waterstored);
    }

    public static int trap(final int[] A){
        int totalwaterstored=0;
        int[] leftmax = new int[A.length];
        int[] rightmax = new int[A.length];
        
        //get left max
        leftmax[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            leftmax[i] = Math.max(leftmax[i-1],A[i]);
        }
        
        //get right max
        rightmax[A.length-1] = A[A.length-1];
        for (int i = A.length-2; i >=0 ; i--) {
            rightmax[i] = Math.max(rightmax[i+1],A[i]);
        }

        //run through & calculate water stored
        for (int i = 0; i < A.length; i++) {
            totalwaterstored += Math.min(leftmax[i],rightmax[i])-A[i];
        }
        
        return totalwaterstored;
    }
}
