package br.com.singleresponsability.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessagePayload {

    @JsonProperty(value = "subject")
    private String subject;
    @JsonProperty(value = "head")
    private String head;
    @JsonProperty(value = "description")
    private String description;

}
