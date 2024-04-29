package LEGION4.legion4.Service;

import LEGION4.legion4.Model.Elu;
import LEGION4.legion4.Repository.EluRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EluService {

    private final EluRepository eluRepository;

    @Autowired
    public EluService(EluRepository eluRepository) {
        this.eluRepository = eluRepository;
    }

    public Elu createElu(Elu elu) {
        return eluRepository.save(elu);
    }


    public Elu findByNom(String nom) {
        Elu elu = eluRepository.findByNom(nom);
        if (elu != null) {
            System.out.println("Utilisateur trouvé dans la base de données : " + elu);
        } else {
            System.out.println("Utilisateur non trouvé dans la base de données pour le nom : " + nom);
        }
        return elu;
    }


    public boolean authenticateElu(String nom) {
        Elu elu = eluRepository.findByNom(nom);
        return elu != null;
    }
}
