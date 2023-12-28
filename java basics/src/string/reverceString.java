package string;

public class reverceString {
    public static void main(String[] args) {
        String s = "anis";

//        String reverce = "";
//        char [] ch = s.toCharArray();
//        for (int i=s.length()-1; i>= 0; i--){
//            reverce = reverce+s.charAt(i);
//        }
//        System.out.print(reverce);

        StringBuilder sbr = new StringBuilder(s);
        sbr.reverse();
        System.out.print(sbr);

        StringBuilder sbd = new StringBuilder();
        sbd.append(s);

        sbd.reverse();
        System.out.print(sbd);

        if (sbd.toString().equals(s)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}

