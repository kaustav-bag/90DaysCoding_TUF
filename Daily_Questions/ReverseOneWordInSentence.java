class ReverseOnewordInSentence{
    public static void main(String[] args) {
        String str="Lets make future bright";
        String[] words=str.split(" ");
        String word="future";

        StringBuilder sb=new StringBuilder();
        //String reverse=sb.reverse(word).toString();
      //  StringBuilder sb=new StringBuilder(str);
        for(String s:words){
            if(s.equals(word)){
                //sb.reverse(word).append();
                String rev=new StringBuilder(word).reverse().toString();
                sb.append(rev+" ");
            }
            else sb.append(s+" ");
        }
        System.out.println(sb);
    }
}