package br.com.singleresponsability.singleresponsability.entities;

import lombok.*;

@Builder
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor @ToString
public class User {

    private String name;
    private String telephone;
    private String email;

}
