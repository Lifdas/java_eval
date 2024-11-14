package potier.florian.demo.repository;

import org.springframework.data.repository.CrudRepository;
import potier.florian.demo.model.SmartphoneModel;

public interface SmartphoneRepository extends CrudRepository<SmartphoneModel, Long> {

}
//c'est le dossier qui va servir d'interface permettant de lier des fichiers java entre eux