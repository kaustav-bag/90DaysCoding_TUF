class Pattern2{
    public static void main(String[] args) {
        int n=4;

        int i=0;
        while(i<=n){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
    }
}