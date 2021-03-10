package br.com.singleresponsability.singleresponsability.services;

import br.com.singleresponsability.singleresponsability.entities.Email;
import br.com.singleresponsability.singleresponsability.entities.User;
import org.springframework.http.ResponseEntity;

public class SendMailService {

    public static ResponseEntity execute(User sender, User receiver, Email email) {

        // este service pega as entidades instanciadas e executa o envio do email do remetente para o destinatário
        // retornando assim um objeto do tipo ResponseEntity ( como se fosse outra API enviando o email ).

        // retorna 204 no-content, fazemos isso para o canal entender que tudo ocorreu como deveria e não temos nada
        // a informar no corpo do retorno da aplicação.
        return ResponseEntity.status(204).build();

    }

}
