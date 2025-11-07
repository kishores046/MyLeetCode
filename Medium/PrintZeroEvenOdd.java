import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;
class PrintZeroEvenOdd {
    private int n;
    private int tracker=3;
    ReentrantLock lock=new ReentrantLock();
    Condition zeroTurn=lock.newCondition();
    Condition oddTurn=lock.newCondition();
    Condition evenTurn=lock.newCondition();
    public PrintZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        try{
            lock.lock();
            for(int i=1;i<=n;i++){
                while(tracker!=3){
                    zeroTurn.await();
                }
                printNumber.accept(0);
                if(i%2==0){
                    tracker=0;
                    evenTurn.signal();
                }
                else{
                    tracker=1;
                    oddTurn.signal();
                 }
            }
        }finally{
            lock.unlock();
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        try{
            lock.lock();
            for(int i=2;i<=n;i+=2){
                while(tracker!=0){
                    evenTurn.await();
                }
                printNumber.accept(i);
                tracker=3;
                zeroTurn.signal();
            }
        }finally{
            lock.unlock();
        }
        
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        try{
            lock.lock();
            for(int i=1;i<=n;i+=2){
                while(tracker!=1){
                    oddTurn.await();
                }
                printNumber.accept(i);
                tracker=3;
                zeroTurn.signal();
            }
        }finally{
            lock.unlock();
        }
        
    }
}
