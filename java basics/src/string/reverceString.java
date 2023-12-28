package string;

public class reverceString {
    public static void main(String[] args) {
        String s = "anis";

        char [] ch = s.toCharArray();
        String reverce = "";
        for (int i=s.length()-1; i>=0; i--){
            reverce = reverce +  s.charAt(i);
        }
        System.out.print(reverce);
    }
}
