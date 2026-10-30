import java.util.ArrayList;

public class CharSort {
    public static String charCheck(String s){
        ArrayList<Character> con = new ArrayList<Character>();
        ArrayList<Character> vow = new ArrayList<Character>();
        ArrayList<Character> spc = new ArrayList<Character>();
        String ret = "";

       for(int i  = 0; i < s.length(); i++) {
        if(Character.isLetter(s.charAt(i))){
            if(Character.toLowerCase(s.charAt(i)) == 'a' || Character.toLowerCase(s.charAt(i)) == 'e' || Character.toLowerCase(s.charAt(i)) == 'i' || Character.toLowerCase(s.charAt(i)) == 'o' || Character.toLowerCase(s.charAt(i))== 'u'){
             vow.add(s.charAt(i));
            } else {
               con.add(s.charAt(i));
            }
       } else {
        if(s.charAt(i) != ' '){
          spc.add(s.charAt(i));
        }
       }
    }
     for(char v : vow){
        ret+=v;
    }
    ret+=' ';
    for(char c : con){
        ret+=c;
    }
    ret+=' ';
    for(char sp : spc){
        ret+=sp;
    }
    return ret;
}


public static void main(String[] args){
 
    System.out.println(charCheck("Hello World"));
    System.out.println(charCheck("I Love Coding"));
    
    System.out.println(charCheck("The$e @re $pecial ch@r@cter$" ));
}
}
