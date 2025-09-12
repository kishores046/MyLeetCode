class H2O {
    Semaphore hydrogen;
    Semaphore oxygen;
    public H2O() {
        hydrogen=new Semaphore(2,true);
        oxygen=new Semaphore(0,true);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		hydrogen.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        oxygen.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oxygen.acquire(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
		releaseOxygen.run();
        hydrogen.release(2);
    }
}
