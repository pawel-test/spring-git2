package pl.pawel.springgit2.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pawel.springgit2.domain.Address;

@RestController
@RequestMapping("/address")
public class AddressRestController {
    //
    @GetMapping("/my")
    public Address getMyAddress() {
        return new Address("warsaw", "unknow", 32);
    }
}
