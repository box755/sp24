import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int total = 0;
        for(int num : L ){
            total += num;
        }
        return total;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> even = new ArrayList<>();
        for(int num : L){
            if(num%2 == 0){
                even.add(num);
            }
        }
        return even;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> comm = new ArrayList<>();
        for(int num : L1){
            for(int num2: L2){
                if(num == num2){
                    comm.add(num);
                }
            }
        }
        return comm;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int total = 0;
        for(String str : words){
            char[] chars = str.toCharArray();
            for(char s : chars){
                if(s == c){
                    total +=1;
                }
            }
        }
        return total;
    }
}
