class Pattern6{
    public static void main(String[] args) {
        int n=5;
        int i=n;

        while(i>=1){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            i--;
        }

    }
}