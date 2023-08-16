import java.util.*;

// dont set a file or class name starting with number like 230A , instead use A230
public class A230 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // strength 
        int n = sc.nextInt(); // number of iterations

        int flag = 0;
        for ( int i = 0 ; i < n ; i++ ) {
            int ds = sc.nextInt();
            int bonus = sc.nextInt();

            if( s>=ds ){
                s = s + bonus;
            }
            else {
                flag = 1;
            }
        }
        System.out.println();
        if ( flag == 1){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }

        sc.close();
    }
}