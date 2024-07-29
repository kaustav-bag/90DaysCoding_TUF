class Pattern10{
    public static void main(String[] args) {
        int n=5;
        int i=1;
        while(i<=n){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        n=4;
        i=1;
        while(i<=n){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}