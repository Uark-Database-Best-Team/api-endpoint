package main.apiendpoint;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface AddressRepository extends CrudRepository<Book, Integer> {
  @Query(value = "SELECT * FROM addresses WHERE addressId = ?1", nativeQuery = true)
  List<Address> findByFirstnameEndsWith(String title);
}