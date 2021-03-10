package br.com.singleresponsability.singleresponsability.resources;

import br.com.singleresponsability.singleresponsability.controllers.SendMailController;
import br.com.singleresponsability.singleresponsability.payloads.SendMailRequestPayload;
import br.com.singleresponsability.singleresponsability.payloads.SendMailResponsePayload;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"api/v1/mails"})
public class SendMail {

    /*
    * {
    *   "sender": {
    *     "name": "Felipe Bueno",
    *     "email": "felipebueno181@gmail.com"
    *   },
    *   "receiver: {
    *     "name": "Creberson",
    *     "email": "creberson@teste.com"
    *   },
    *   "message": {
    *     "subject": "Mensagem para Creberson",
    *     "head": "FAAAAAAAAALA CREBERSOOOON - como vai a vida?",
    *     "description": "Como andam os testes de performance da modernização do CP? parece que está tudo verdinho!"
    *   }
    * }
    * */

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity sendMail(@Validated @RequestBody SendMailRequestPayload payload) {
        SendMailResponsePayload responsePayload = SendMailController.sendMail(payload);
        return ResponseEntity.status(200).body(responsePayload);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity teste() {
        return ResponseEntity.ok("EU GOSTO DE TORTA");
    }

}
