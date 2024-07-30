class Pattern13{
    public static void main(String[] args) {
        int n=65;
        int i=70;
        while(i>n){
            for(int j=n;j<i;j++){
                System.out.print((char)j);
            }
            System.out.println();
            i--;
        }
    }

}