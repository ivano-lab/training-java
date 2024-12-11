package academy.devdojo.maratonajava.concorrencia.teste;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTeste01 {
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(formatter) + " beep!");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        //executor.schedule(r, 5, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduledWithFixedDelay = executor.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);
        executor.schedule(() ->{
            System.out.println("Cancelando o scheduleWithFixedDelay");
            scheduledWithFixedDelay.cancel(false);
            executor.shutdown();
        }, 20, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(formatter));
        beeper();
    }
}
