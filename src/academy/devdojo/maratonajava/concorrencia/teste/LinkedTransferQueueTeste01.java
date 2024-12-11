package academy.devdojo.maratonajava.concorrencia.teste;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTeste01 {
    public static void main(String[] args) throws InterruptedException {

        TransferQueue<Object> obj = new LinkedTransferQueue<>();
        System.out.println(obj.add("Hadassah"));
        System.out.println(obj.offer("Hadassah"));
        System.out.println(obj.offer("Hadassah", 10, TimeUnit.SECONDS));
        obj.put("Fazendinha Beer");
        if(obj.hasWaitingConsumer()){
            obj.transfer("Fazendinha Beer");
        }
        System.out.println(obj.tryTransfer("Body Station"));
        System.out.println(obj.tryTransfer("Body Station", 5, TimeUnit.SECONDS));
        System.out.println(obj.element());
        System.out.println(obj.peek());
        System.out.println(obj.poll());
        System.out.println(obj.remove());
        System.out.println(obj.take());
        System.out.println(obj.remainingCapacity());
    }
}
