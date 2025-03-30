package proyecto.api.api.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.api.api.proyecto.models.UserModel;

@Repository
public interface IUuserRepository extends JpaRepository<UserModel, Long> {
 
}
