package academy.devdojo.maratonajava.concorrencia.teste;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        Math.random();
        int num = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s executando uma tarefa callable...", Thread.currentThread().getName());
        }
        return String.format("%s finished and the random number is %d", Thread.currentThread().getName(), num);
    }
}
public class CallableTeste01 {
    public static void main(String[] args) {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorService =  Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(randomNumberCallable);
        String s = null;
        try {
            s = future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Program Finished %s", s);
        executorService.shutdown();
    }
}
