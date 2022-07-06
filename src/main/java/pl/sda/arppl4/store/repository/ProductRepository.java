package pl.sda.arppl4.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.arppl4.store.model.Product;

// Do tworzenia, pobierania, edytowania, usuwania obiektów w bazie danych
//    C          R           U           D
public interface ProductRepository extends JpaRepository<Product, Long> {
}
