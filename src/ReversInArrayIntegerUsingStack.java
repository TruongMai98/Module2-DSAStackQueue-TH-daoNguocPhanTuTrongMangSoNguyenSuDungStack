import java.util.Arrays;
import java.util.Stack;

public class ReversInArrayIntegerUsingStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] myArray = {23, 93, 56, 92, 39};
        int size = myArray.length;
        for (int i : myArray) {
            stack.push(i);
            System.out.print(i + "\t");
        }

        System.out.print("\n");
        int[] reversArray = new int[size];
        for (int i = 0; i < size; i++) {
            reversArray[i] = stack.pop();
            System.out.print(reversArray[i] + "\t");
        }
        System.out.print("\n");
        System.out.println("Reversed array is: " + Arrays.toString(reversArray));
    }
}
