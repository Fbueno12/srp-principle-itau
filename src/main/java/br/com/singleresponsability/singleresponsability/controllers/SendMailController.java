package br.com.singleresponsability.singleresponsability.controllers;

import br.com.singleresponsability.singleresponsability.entities.Email;
import br.com.singleresponsability.singleresponsability.entities.User;
import br.com.singleresponsability.singleresponsability.payloads.SendMailRequestPayload;
import br.com.singleresponsability.singleresponsability.payloads.SendMailResponsePayload;
import br.com.singleresponsability.singleresponsability.services.SendMailService;
import org.springframework.http.ResponseEntity;

public class SendMailController {

    public static SendMailResponsePayload sendMail(SendMailRequestPayload payload) {

        User sender = User.builder()
                .name(payload.getSender().getName())
                .email(payload.getReceiver().getEmail())
                .build();

        User receiver = User.builder()
                .name(payload.getReceiver().getName())
                .email(payload.getReceiver().getEmail())
                .build();

        Email email = Email.builder()
                .head(payload.getMessage().getHead())
                .subject(payload.getMessage().getSubject())
                .description(payload.getMessage().getDescription())
                .build();

        // notem que parseamos a entrada em JSON recebida pelo canal e instanciamos nossas entidades.
        // essa prática ajuda principalmente na organização das classes que usaremos para enviar ao mainframe
        // ou gravar em bancos de dados por exemplo, como cada componente tem sua responsabilidade, isso deixa
        // a manutenção do serviço muito mais simples.

        System.out.println("\nsender -> " + sender.toString());
        System.out.println("\nreceiver -> " + receiver.toString());
        System.out.println("\nmessage -> " + email.toString());

        ResponseEntity enviarEmail = SendMailService.execute(sender, receiver, email);

        return SendMailResponsePayload.builder()
                .status(enviarEmail.getStatusCodeValue())
                .message("O Envio do email foi efetuado com sucesso!") // aqui nós podemos escrever algo informando o canal o que foi feito.
                // ou podemos simplesmente devolver o que a api de envio de email retornar.
                .build();
    }

}
