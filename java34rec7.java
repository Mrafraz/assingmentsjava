package assingnments;

public class java34rec7 {       //done
    static int atoi(String s,int i){  //q5
        if (s.length()==0) return i;
        i=i*10+s.charAt(0)-'0';
        return atoi(s.substring(1),i);
    }
    static int countLower(String s,int i){ //q4
        if (s.length()==0) return i;
        if (Character.isUpperCase(s.charAt(0))==false) i++ ;
        return countLower(s.substring(1),i);
    }
    static int countConstant(String s,int i){ //q3

        if (s.length()==0) return i;
        if (s.charAt(0)!='a'&& s.charAt(0)!='e'&&s.charAt(0)!='i'&& s.charAt(0)!='o'&&s.charAt(0)!='u') i++ ;
        return countConstant(s.substring(1),i);
    }

    static String printFromUpper(String s){ //q2
        if (s.length()==0) return "";
        if (Character.isUpperCase(s.charAt(0)))return s;
            return printFromUpper(s.substring(1));

    }
    static String merge(String m,String n){
        String ans="";
        if (m.length()==0) {
            ans+=n;
            return ans;
        }
        if (n.length()==0){
            ans+=m;
            return ans;
        }
        ans+=m.substring(0,1);      //extracted first character from m string
        ans+=n.substring(0,1);      //extracted first character from n string
        ans+=merge(m.substring(1),n.substring(1));
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(merge("afraz", "priyanshu"));
        System.out.println(printFromUpper("afRaz"));
        System.out.println(countConstant("pwskills", 0));
        System.out.println(countLower("CollegeWallah",0));
        System.out.println(atoi("291",0));
        
    }
}
