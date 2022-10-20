import java.util.Arrays;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        String word ="abcxyz";
        System.out.println(word);
        String[] mWord = word.split("");
        System.out.println(Arrays.toString(mWord));
        int size = mWord.length;
        for (String i : mWord) {
            stack.push(i);
            System.out.print(i + "\t");
        }
        System.out.print("\n");
        String[] reversMWord = new String[size];
        for (int i = 0; i < size; i++) {
            reversMWord[i] = stack.pop();
            System.out.print(reversMWord[i] + "\t");
        }
        System.out.print("\n");
        System.out.println("Reversed String is: " + Arrays.toString(reversMWord));

        String newMWord = String.join("", reversMWord);
        System.out.println(newMWord);

        String mWord2 = newMWord.concat(word);
        System.out.println(mWord2);
    }


}
