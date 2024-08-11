class CallByValue{
    int val=10;
    static int fun(int a){
        a+=5;
        return a;
    }
    void meth(CallByValue str){
        str.val=20;
        System.out.println(val);
    }

    public static void main(String[] args) {
        int a=10;
        System.out.println(fun(a));
        System.out.println(a);
        CallByValue call=new CallByValue();
        call.val=24;
        call.meth(CallByValue calli);
    }
}