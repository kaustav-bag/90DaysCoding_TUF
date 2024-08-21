import java.util.ArrayList;

class MaxWordCount{
    public static void main(String[] args) {
        String arr[]={"Monali","Kaustav","SgararSa","Dollyjbhhbjgdd","nkknjkn","bhjgkgxcscscdd"};
        int maxLen=0;
       // String maxStr="";
        ArrayList<String> list=new ArrayList<>();
        for(String word:arr){
            int len=word.length();
            if(len>maxLen) {
                maxLen=len;
                list.clear();
                list.add(word);
            }
            else if(len==maxLen){
                list.add(word);
            }
        }
        System.out.println(list.toString()+" -"+maxLen);
    }
}