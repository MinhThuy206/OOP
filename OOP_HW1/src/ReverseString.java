import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.nextLine();
        int inStrLen = inStr.length();
        StringBuilder sb = new StringBuilder();
        char ch;

        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            ch = inStr.charAt(charIdx);
            sb.append(ch);
        }
        System.out.println("The reverse of the String " + inStr + " is : " + sb);
    }
}
