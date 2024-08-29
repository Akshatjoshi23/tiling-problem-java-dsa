public class tilingcode{
    public static void main(String[] args) {
        System.out.println(tilingProb(4));
    }
    public static int tilingProb(int n){
        if(n==0||n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            return tilingProb(n-1)+tilingProb(n-2);
        }
    }
}
