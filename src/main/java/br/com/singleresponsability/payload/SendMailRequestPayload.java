package br.com.singleresponsability.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SendMailRequestPayload {

    @JsonProperty(value = "sender")
    private UserPayload sender;
    @JsonProperty(value = "receiver")
    private UserPayload receiver;


}
