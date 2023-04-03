import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class account {

    private float balance;
    //No need for a static Lock, it only applies to this instance of account
    private Lock balanceLock;

    account(){
        balance = 0;
        balanceLock = new ReentrantLock();
    }

    public void setBalance(float bal){
        balance = bal;
    }

    public float getBalance() {
        return balance;
    }

    public Lock getLock(){
        return balanceLock;
    }

    public void addBalance(float toAdd){
        balanceLock.lock();
        balance += toAdd;
        balanceLock.unlock();
    }

    public void removeBalance(float toSub){
        balanceLock.lock();
        balance -= toSub;
        balanceLock.unlock();
    }
}
