import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        if(!(n>=1 && n<=1000)){
            return;
        }
        boolean flag = false;
 
        for(int i=1; i<=n; i++){
            if(n%i==0 && lucky(i)) {
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
 
    public static boolean lucky(int x){
        while(x>0) {
            int d = x % 10;
 
            if (d != 4 && d != 7) {
                return false;
            }
            x = x/10;
        }
        return true;
    }
}