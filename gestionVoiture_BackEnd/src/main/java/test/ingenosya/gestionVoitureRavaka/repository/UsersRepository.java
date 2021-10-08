package test.ingenosya.gestionVoitureRavaka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.ingenosya.gestionVoitureRavaka.entity.User;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email) ;
}
