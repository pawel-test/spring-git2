package pl.pawel.springgit2.repo;

import org.springframework.data.repository.CrudRepository;
import pl.pawel.springgit2.domain.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
