package main.apiendpoint;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Integer> {
  @Query(value = "SELECT * FROM shoppingCart WHERE cartId = ?1", nativeQuery = true)
  ShoppingCart getCartById(Integer id);
}