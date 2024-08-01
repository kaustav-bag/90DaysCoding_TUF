class Pattern16{
    public static void main(String[] args) {
        int i=65;
        int n=70;

        while(i<n){
            for(int j=65;j<=i;j++){
                System.out.print((char)j+" ");
            }
            i++;
            System.out.println();
        }
    }
}