public class DoWhile {
    public static void main(String[] args) {
        // do while 循环无论条件如何，都至少会执行一次循环
        int i = 11;
        do{
            System.out.println("Hello World");
            System.out.println(i);
            i++;
        } while(i <= 10);
    }
}
