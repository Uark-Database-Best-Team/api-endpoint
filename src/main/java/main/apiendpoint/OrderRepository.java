package main.apiendpoint;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface OrderRepository extends CrudRepository<Book, Integer> {
  @Query(value = "SELECT * FROM orders WHERE employeeId=?1", nativeQuery = true)
  List<Order> getOrdersByEmployeeId(Integer employeeId);

}