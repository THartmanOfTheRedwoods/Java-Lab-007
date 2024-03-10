
import java.util.Arrays;
    public class ArrayExploration5 {
        public static int[] letterHist(String s) {

            int[] histogram = new int[26];

            for (int i = 0; i < s.length(); i++) {
                char c = Character.toLowerCase(s.charAt(i));
                if (c >= 'a' && c <= 'z') {
                    histogram[c - 'a']++;
                }
            }

            return histogram;
        }

        public static void main(String[] args) {
            int[] histogram = letterHist("Rigel");
            System.out.println(Arrays.toString(histogram));
        }
    }
