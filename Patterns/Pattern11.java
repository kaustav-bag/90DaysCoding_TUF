class Pattern11{
    public static void main(String[] args) {
        int n=70;
        int i=65;
        while(i<n){
            for(int j=65;j<=i;j++){
                System.out.print((char) j);
            }
            System.out.println();
            i++;
        }
    }

}