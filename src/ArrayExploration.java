public class ArrayExploration {
        public static int indexOfMax(int[] arr) {
            int maxIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            return maxIndex;

        }
        public static void main(String[] args){
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(indexOfMax(arr));
        }}

