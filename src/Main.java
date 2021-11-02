import java.util.Scanner;

public class Main {
    public static void main(String[] array) {

        String input;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n\nenter the string containing brackets");
            System.out.println("(without space)");
            input = sc.nextLine();

            int BracketStackSize=0;
            int stackSize = input.length();
            char LastBracket = 'A';
            char[] charArray = new char[stackSize+1];
            for (int i = 0; i < stackSize; i++) {
                charArray[i] = input.charAt(i);
            }

            StackBody theStack = new StackBody(stackSize);
            for (int i = 0 ; i <= (stackSize); i++) {
                int sign = i+1;
                if (charArray[i] == '(') {
                    theStack.push(charArray[i]);
                    BracketStackSize=BracketStackSize+1;
                    LastBracket = theStack.peek();
                }
                else if (charArray[i] == ')') {
                    if (!(LastBracket == '(')){
                        System.out.println("WRONG: BRACKET "+(sign)+" SIGN");
                        for (int z=0; z< (stackSize); z++){
                            if (z==(sign-1)){
                                System.out.print("\u001B[31m"+charArray[z]+"\u001B[0m");
                                continue;
                            }
                            System.out.print(charArray[z]);
                        }
                        break;
                    }
                    theStack.pop();
                    BracketStackSize=BracketStackSize-1;
                    LastBracket = theStack.peek();
                }
                else if (charArray[i] == '[') {
                    theStack.push(charArray[i]);
                    BracketStackSize=BracketStackSize+1;
                    LastBracket = theStack.peek();
                }
                else if (charArray[i] == ']') {
                    if (!(LastBracket == '[')){
                        System.out.println("WRONG: BRACKET "+(sign)+" SIGN ");
                        for (int z=0; z< (stackSize); z++){
                            if (z==(sign-1)){
                                System.out.print("\u001B[31m"+charArray[z]+"\u001B[0m");
                                continue;
                            }
                            System.out.print(charArray[z]);
                        }
                        break;
                    }
                    theStack.pop();
                    BracketStackSize=BracketStackSize-1;
                    LastBracket = theStack.peek();
                }
                else if (charArray[i] == '{') {
                    theStack.push(charArray[i]);
                    BracketStackSize=BracketStackSize+1;
                    LastBracket = theStack.peek();
                }
                else if (charArray[i] == '}') {
                    if (!(LastBracket == '{')){
                        System.out.println("WRONG: BRACKET "+(sign)+" SIGN ");
                        for (int z=0; z< (stackSize); z++){
                            if (z==(sign-1)){
                                System.out.print("\u001B[31m"+charArray[z]+"\u001B[0m");
                                continue;
                            }
                            System.out.print(charArray[z]);
                        }
                        break;
                    }
                    theStack.pop();
                    BracketStackSize=BracketStackSize-1;
                    LastBracket = theStack.peek();
                }
                else if (i == (stackSize)){
                    if(BracketStackSize==0){
                        System.out.println("OK \n");
                    }
                    else {
                        theStack.peek();
                        char X = theStack.peek();
                        System.out.println("WRONG: YOU HAVE TO CLOSE ALL "+X+" BRACKETS \n");
                    }
                }
                else { continue; }
            }

            if (input.length() == 1) {
                break;
            }
        }
    }
}