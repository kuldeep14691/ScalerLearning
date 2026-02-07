package labSessions;

public class NextPermutation {
    public static void main(String[] args) {
        int[] input_numbers = {1,3,2};
        int[] result = new int[input_numbers.length];
        result = getNextPermutation(input_numbers);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        for (int i: result) {

        }
    }
    public static int[] getNextPermutation(int[] inputNumbers){
        int elements = inputNumbers.length-1;
        int[] result = new int[inputNumbers.length];

        while (elements>=0){
            for (int i = elements-1; i >=0 ; i++) {
                if (inputNumbers[elements] > inputNumbers[elements-1]){
                    swap(inputNumbers,elements,elements-1);
                    break;
                }else{
                    elements-=1;
                }
            }

        }
        result = inputNumbers;
        return result;
    }

    public static void swap(int[] inputNumbers, int from, int to){
        int temp = inputNumbers[to];
        inputNumbers[to]=inputNumbers[from];
        inputNumbers[from]=temp;
    }
}
