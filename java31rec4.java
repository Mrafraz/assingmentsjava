package assingnments;

import java.util.Scanner;

public class java31rec4 {   //done
    static int  binaryToGray2(int n){        //q5  m-2
        if (n==0)return 0;
        if (n==1)return 1;
        int small_ans= binaryToGray2(n/10);
        if (n%10==(n%100)/10) return (small_ans*10);
        else return (small_ans*10+1);
    }

    static void binaryToGray(int n){        //q5
        if (n==0){
            System.out.print(0);
            return;
        }
        if (n==1){
            System.out.print(1);
            return;
        }

        binaryToGray(n/10);
        if (n%10==(n%100)/10) System.out.print(0);
        else System.out.print(1);
    }
    static int findBianry(int n){      //q4 m-2
        if (n==0) return 0;
        return (n%2+10*findBianry(n/2));
    }
    static void decimalToBinary(int n){    //q4
        if (n==0) return ;
        decimalToBinary(n/2);
        System.out.print(n%2);
    }
    static int armstongNo(int n){       //q1
        if (n==0)return 0;
        int rem=n%10;
        return armstongNo(n/10)+rem*rem*rem;
        }
        static int product(int x,int y){  //q2
        if (x<y) product(y,x);  //this is bcoz it create less stack calls
        if (y==0) return 0;
        return (x+product(x,y-1));
        }
        static boolean isPrime(int n,int i){    //q3
            if(i==n||n==1) return true;
            if (n%i==0) return false;
            else return(isPrime(n,i+1));
        }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter no :");
        int n = scn.nextInt();
        System.out.println(n+((armstongNo(n)==n)?" is armstrong number":" not armstrong number"));
        System.out.println(n+(isPrime(n,2)?" is prime":" is not prime"));
        System.out.print("enter another number to be multiplied with "+n+ " :");
        int y=scn.nextInt();
        System.out.println(n+" * "+y+" = "+product(n,y));
        System.out.println("binary of  "+n+" : "+findBianry(n));
        System.out.println("gray of "+n+" : "+binaryToGray2(findBianry(n)));

    }
}
