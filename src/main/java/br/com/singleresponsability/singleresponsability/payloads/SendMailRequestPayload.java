package br.com.singleresponsability.singleresponsability.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SendMailRequestPayload {

    @JsonProperty(value = "sender")
    private UserPayload sender;
    @JsonProperty(value = "receiver")
    private UserPayload receiver;
    @JsonProperty(value = "message")
    private MessagePayload message;


}
