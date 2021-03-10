package br.com.singleresponsability.singleresponsability.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessagePayload {

    @JsonProperty(value = "subject")
    private String subject;
    @JsonProperty(value = "head")
    private String head;
    @JsonProperty(value = "description")
    private String description;

}
