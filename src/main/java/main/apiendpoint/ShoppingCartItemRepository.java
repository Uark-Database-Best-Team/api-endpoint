package main.apiendpoint;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface ShoppingCartItemRepository extends CrudRepository<Book, Integer> {

  @Modifying
  @Query(value = "INSERT INTO shoppingCartItems(cartItemId, quantity, isbn, cartId) VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
  @Transactional
  List<ShoppingCartItem> addItemToCart(Integer cartItemId, Integer quantity, Integer isbn, Integer cartId);

  @Query(value = "SELECT * FROM shoppingCartItems WHERE cartId = ?1", nativeQuery = true)
  List<ShoppingCartItem> getCartItemsByCartId(Integer cartId);

}