package br.com.singleresponsability.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPayload {

    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "email")
    private String email;

}
