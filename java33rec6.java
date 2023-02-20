package assingnments;

public class java33rec6 {
    static int numberOfPaths(int n,int m,int i,int j){  //q1
        if (i>=n || j>=m) return 0;
        if (i==n-1 && j==m-1) return 1;
       return numberOfPaths(n,m,i+1,j)+numberOfPaths(n,m,i,j+1);
    }
    static void triSum(int[] a,int n,int idx){
        if (idx==n-1) return;

    }
    static void printCombination(int n,int r){

    }
    public static void main(String[] args) {
        System.out.println(numberOfPaths(2,3,0,0));
    }
}
