package br.com.singleresponsability.entities;

import lombok.*;

@Builder
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Email {

    private String subject;
    private String head;
    private String description;

    private User sender;
    private User receiver;

}
