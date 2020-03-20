import java.util.*;
class Solution{
	
    public static boolean isPublic (String input){

        char[] lineArr = input.toCharArray();
        if (lineArr.length%2 !=0) return false;

        Stack<Character> characterStack= new Stack<>();

        for (Character element : lineArr) {
            if (element == '(' || element == '{' || element == '[') {
                characterStack.push(element);
            } else {
                if (characterStack.isEmpty()) {
                    return false;
                }
                if ((element == ')' && characterStack.peek() != '(') ||
                        (element == '}' && characterStack.peek() != '{') ||
                        (element == ']' && characterStack.peek() != '[')) {
                    return false;
                }
                characterStack.pop();
            }
        }
        return  characterStack.isEmpty();

    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(isPublic(input) ? "true" :"false");
            //Complete the code
		}
		
	}
}



