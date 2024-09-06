package academy.devdojo.maratonajava.threads.teste;

import academy.devdojo.maratonajava.threads.dominio.Account;

public class ThreadAccountTeste01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTeste01 threadAccountTeste01 = new ThreadAccountTeste01();
        Thread t1 = new Thread(threadAccountTeste01, "Hestia");
        Thread t2 = new Thread(threadAccountTeste01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            withdrawal(10);
            if(account.getBalance() <= 0) {
                System.out.println("Lascô!!!!");
            }
        }
    }

    private void withdrawal(int amount){
        System.out.println(getThreadName() + " fora do synchronized");
        synchronized (account) {
            System.out.println(getThreadName() + " dentro do synchronized");
            if(account.getBalance() >= amount){
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, valor atual da conta: " + account.getBalance());
            } else {
                System.out.println("Sem saldo para " + getThreadName() + " efetuar saque de " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
