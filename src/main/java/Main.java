public class Main {

    public static void main(String[] args) {
        System.out.println("Создаю группу потоков");
        final ThreadGroup tg = new ThreadGroup("main");


        System.out.println("Создаю потоки");
        Thread thread1 = new MyThread(tg, "Поток 1");
        Thread thread2 = new MyThread(tg, "Поток 2");
        Thread thread3 = new MyThread(tg, "Поток 3");
        Thread thread4 = new MyThread(tg, "Поток 4");


        System.out.println("Запускаю потоки");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Останавливаю всю группу потоков");
        tg.interrupt();
    }
}
