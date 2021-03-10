package br.com.singleresponsability.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SendMailResponsePayload {

    @JsonProperty(value = "status")
    private Integer status;
    @JsonProperty(value = "message")
    private String message;

}
