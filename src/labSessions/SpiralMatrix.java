package labSessions;

public class SpiralMatrix {
    public static void main(String[] args) {
        int matrixOrder = 5;
        generateSpiralMatrix(matrixOrder);
    }
    public static void generateSpiralMatrix(int matrixOrder){
        int N= matrixOrder, M=matrixOrder,numberOfSpirals=matrixOrder-2;
        int nextNumber = 1;
        int[][] matrix = new int[matrixOrder][matrixOrder];

        for (int i = 0; i <=numberOfSpirals ; i++) {
            for (int j = 0; j <N-2 ; j++) {
                matrix[i][j]=nextNumber;
                nextNumber++;
            }
            for (int j = 0; j <N-2 ; j++) {
                matrix[j][matrixOrder-i-1]=nextNumber;
                nextNumber++;
            }
            for (int j = M-1; j>0 ; j++) {
                matrix[matrixOrder-i][j]=nextNumber;
                nextNumber++;
            }
            for (int j = N-1; j >0 ; j++) {
                matrix[j][matrixOrder-i-1]=nextNumber;
                nextNumber++;
            }
        }
    }

}
