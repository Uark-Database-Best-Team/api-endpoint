package main.apiendpoint;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Integer> {
  @Query(value = "SELECT * FROM shoppingCart WHERE cartId = ?1", nativeQuery = true)
  ShoppingCart getCartById(Integer id);

  @Query(value = "SELECT * FROM shoppingCart", nativeQuery = true)
  List<ShoppingCart> getAllCarts();

  @Modifying
  @Query(value = "UPDATE shoppingCartItems SET cartId=?1 WHERE cartId=?2", nativeQuery = true)
  @Transactional
  void mergeShoppingCarts(Integer cartId1, Integer cartId2);
}