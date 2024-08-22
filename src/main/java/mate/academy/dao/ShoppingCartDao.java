package mate.academy.dao;

import mate.academy.lib.Dao;
import mate.academy.model.ShoppingCart;
import mate.academy.model.User;

import java.util.Optional;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart cart);
    Optional<ShoppingCart> getByUser(User user);
    void update(ShoppingCart cart);
}
