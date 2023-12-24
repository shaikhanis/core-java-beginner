package patterns;
/*      A  B  C  D  E  F  F  E  D  C  B  A
        A  B  C  D  E        E  D  C  B  A
        A  B  C  D              D  C  B  A
        A  B  C                    C  B  A
        A  B                          B  A
        A                                A
*/
public class alphabetPattern {
    public static void main(String[] args) {
        int n=5;
        int alphabet = 65;

        for (int i=n; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print(" "+(char)(alphabet+j)+" ");
            }
            int space = 2*(n-i);
            for (int j=1; j<=space; j++){
                System.out.print("   ");
            }
            for (int j=i; j>=0; j--){
                System.out.print(" " + (char)(alphabet+j)+" ");
            }
            System.out.println();
        }
    }
}
