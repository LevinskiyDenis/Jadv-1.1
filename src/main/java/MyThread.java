public class MyThread extends Thread {

    public MyThread(ThreadGroup tg, String name) {
        super(tg, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.printf("Привет, работает %s \n", Thread.currentThread().getName());
                sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.printf("%s завершен \n", Thread.currentThread().getName());
        }
    }
}