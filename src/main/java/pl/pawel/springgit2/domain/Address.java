package pl.pawel.springgit2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String city;
    private String street;
    private int flatNumber;
}
