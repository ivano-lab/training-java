package academy.devdojo.maratonajava.concorrencia.teste;

import academy.devdojo.maratonajava.concorrencia.dominio.Members;
import academy.devdojo.maratonajava.concorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTeste01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
        Thread kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");
        jiraya.start();
        kakashi.start();
        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
