public class DemoBreak {
    public static void main(String[] args) {
        for(int i = 20; i <= 80; i++){
            if( i >59){
                break;
            }
            System.out.println(i + "岁正在上班~");
        }
        System.out.println("老子退休了");
    }
}
