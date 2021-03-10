package br.com.singleresponsability.entities;

import lombok.*;

@Builder
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Email {

    private String head;
    private String subject;
    private String description;

    private User receiver;

}
