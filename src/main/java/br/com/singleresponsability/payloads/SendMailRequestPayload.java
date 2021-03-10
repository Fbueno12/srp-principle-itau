package br.com.singleresponsability.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SendMailRequestPayload {

    @JsonProperty(value = "sender")
    private UserPayload sender;
    @JsonProperty(value = "receiver")
    private UserPayload receiver;


}
