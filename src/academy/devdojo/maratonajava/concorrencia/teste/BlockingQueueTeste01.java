package academy.devdojo.maratonajava.concorrencia.teste;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTeste01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Hadassah");
        System.out.printf("%s added the name value %s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("Trying to add another value");
        new Thread(new RemoveFromQueue(bq)).start();
        bq.put("Bobato Fontes");
        System.out.printf("%s added the name value %s%n", Thread.currentThread().getName(), bq.peek());
    }

    static class RemoveFromQueue implements Runnable {
        private final BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s going to sleep for 5s %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.printf("%s removing value from queue %s%n", Thread.currentThread().getName(), bq.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
