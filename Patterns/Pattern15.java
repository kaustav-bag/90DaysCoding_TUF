class Pattern15{
    public static void main(String[] args) {
        int start=1;
        int i=1;
        int n=5;
        while(i<=n){
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start+=1;
            }
            System.out.println();
            i++;
        }
    }
}