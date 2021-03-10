package br.com.singleresponsability.entities;

import lombok.*;

@Builder
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class User {

    private String name;
    private String telephone;
    private String email;

}
