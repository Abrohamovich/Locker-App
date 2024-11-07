package app;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DataHandler {
    private final Lock locker = new ReentrantLock(true);

    public synchronized int modify(int num){
        try {
            locker.lock();
            num=num*3;
            return num;
        }
        finally {
            locker.unlock();
        }
    }
}
