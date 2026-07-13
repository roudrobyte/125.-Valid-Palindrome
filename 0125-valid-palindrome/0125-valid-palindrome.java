import java.util.Scanner;
public class Solution {
    public static boolean isPalindrome(String s) {
        int leng = s.length();
        String str = "";
        boolean result = true;
        s = s.toLowerCase();

        for(int i=0; i<leng; i++){
            char ch = s.charAt(i);

            int ascii =  (int) ch;

            if((ascii>=48 && ascii<=57) || (ascii>=97 && ascii<=122)) {
                str+=ch;
            }
            else{
                continue;
            }
        }
        for(int j=0; j<str.length(); j++){
            if(str.charAt(j)==str.charAt(str.length()-j-1)){
                result = true;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("s = ");
        String s1 = sc.nextLine();

        System.out.println(isPalindrome(s1));
    }
}