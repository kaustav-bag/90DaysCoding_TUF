class Pattern8{

public static void main(String[] args) {
    int n=5;
    int i=0;
        while(i<n){
            for(int k=0;k<i;k++) {
            System.out.print(" ");
             }
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }
            for(int k=0;k<i;k++) {
            System.out.print(" ");
            }
            System.out.println();
            i++;

        }
    }
}