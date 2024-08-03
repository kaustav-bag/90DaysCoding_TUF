class Pattern18{
    public static void main(String[] args) {
        int i=69;
        int n=65;
        int con=i;
        while(i>=n){
            for(int j=i;j<=con;j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
            i--;
        }
    }
}