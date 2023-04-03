public class extremeThreading implements Runnable{


    private static account theAccount = new account();


    //Run each thread 50 times!
    //On second run through, remove the sleepiness...

    @Override
    public void run() {
            System.out.println("Old balance: " + theAccount.getBalance());
            theAccount.addBalance(100);
            theAccount.removeBalance(40);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            theAccount.addBalance(50);
            theAccount.removeBalance(110);
            System.out.println("New Balance: " + theAccount.getBalance());
    }
}
