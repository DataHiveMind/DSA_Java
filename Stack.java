import java.util.Stack;

/* Use of Stacks:
            1. Backtracking algorithms (Maze, file directions)
            2. Calling functions

*/

public class Stack{
    public static void main(Strings [] arg){
        Stack<String> stack = new Stack<String>();
        System.out.println("1. Is stack empty?: " + stack.empty());

        stack.push("minecaft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        if (stack.empty() == True){
            System.out.println(stack);
        }

        // Remove the top most element in stack
        String myFavGame = stack.pop()
        System.out.println(myFavGame);

        // Views the top most element in stack
        String top = stack.peek();
        System.out.println(top);

        // Find the index for a certain element & if not find returns -1
        String ser = stack.search("DOOM");
        System.out.println(ser);

        // Using for loop to create a stack
        Stack<int> s1 = new Stack<int>();

        // Could run out of memeory due to Java heap space
        for(int i = 0; i < 100000000000; i++){
            s1.push(i);
        }

    }
}