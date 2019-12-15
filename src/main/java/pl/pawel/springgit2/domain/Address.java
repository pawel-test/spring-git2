package pl.pawel.springgit2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity
public class Address {
    @Id
    private Long id;
    private String city;
    private String street;
    private int flatNumber;
}
