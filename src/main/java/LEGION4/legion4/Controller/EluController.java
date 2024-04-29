package LEGION4.legion4.Controller;

import LEGION4.legion4.Model.Elu;

import LEGION4.legion4.Service.EluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/elu")
    public class EluController {
    @Autowired
    private EluService eluService;


    @PostMapping("/connexion")
    public ResponseEntity<?> checkIfUserExists(@RequestBody Elu elu) {
        Elu utilisateurTrouve = eluService.findByNom(elu.getNom());
        if (utilisateurTrouve != null) {
            return ResponseEntity.ok().body("Utilisateur trouvé dans la base de données.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Utilisateur introuvable.");
        }
    }

}








