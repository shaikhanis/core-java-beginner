package patterns;
/*1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
public class NumberPattern {
    public static void main(String[] args) {
        int n=6;
        for (int i=1; i<n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for (int k=2; k<n; k++) {
            for (int j = 1; j <=k; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
