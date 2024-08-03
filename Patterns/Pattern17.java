class Pattern17{
    public static void main(String[] args) {
        int i=65;
        int n=70;
       // int ascii=65;
        while(i<n){
            for(int j=65;j<=i;j++){
                System.out.print((char)i+" ");
            }
            i++;
            System.out.println();
        }

    }
}