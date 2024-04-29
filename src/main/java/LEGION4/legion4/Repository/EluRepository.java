package LEGION4.legion4.Repository;

import LEGION4.legion4.Model.Elu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EluRepository extends JpaRepository<Elu, Long> {
            Elu findByNom (String nom);
}

