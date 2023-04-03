public class driver {

    public static void main(String[] args){

        extremeThreading x = new extremeThreading();
        extremeThreading y = new extremeThreading();
        extremeThreading z = new extremeThreading();

        Thread thread1 = new Thread(x);
        Thread thread2 = new Thread(y);
        Thread thread3 = new Thread(z);

        for(int i = 0; i < 50; i++) {
            thread1.run();
            thread2.run();
            thread3.run();
        }

    }
}
