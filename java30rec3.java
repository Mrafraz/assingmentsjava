package assingnments;
import java.util.Scanner;

// done
public class java30rec3 {
    static int sm(int n,int m){
        if (m==1) return sn(n);
        return sn(sm(n,m-1));
    }

    static int sn(int n){
        if (n==0) return 0;
        return n+sn(n-1);
    }
    static void rec1(int n,int m,boolean flag){
        System.out.println(m+"");
        if (flag==false && n==m) return;
        if (flag){
            if (m-5>0) rec1(n,m-5,true);
            else rec1(n,m-5,false); // false flag means we are iterating toward positive
        }
        else rec1(n,m+5,false);
    }
        public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number n: ");
       // int n = scn.nextInt();
        //rec1(n, n, true);
            System.out.println(sm(2,3));

    }
}

