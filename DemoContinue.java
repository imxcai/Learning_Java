public class DemoContinue {
    public static void main(String[] args) {
        for(int i = 1; i <= 24; i++){
            //基于条件的控制
            if(i == 4){
                continue;
            }
            System.out.println(i + "层到了~");
        }
    }
}
