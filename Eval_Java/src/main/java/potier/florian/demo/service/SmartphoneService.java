package potier.florian.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import potier.florian.demo.dto.SmartphoneDto;
import potier.florian.demo.model.SmartphoneModel; // Utilisation de l'entité Smartphone
import potier.florian.demo.repository.SmartphoneRepository;

@Service
public class SmartphoneService {
    @Autowired //j'instancie la classe UserRepository dans repository
    private SmartphoneRepository repository;

    //permet de récupérer TOUT les smartphones
    public Iterable<SmartphoneModel> getServiceSmartphones() {
        return repository.findAll();
    }

    public SmartphoneModel getServiceSmartphone(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Créer un smartphone
    public void postServiceSmartphone(SmartphoneDto dto) {
        SmartphoneModel smartphone = new SmartphoneModel();
        smartphone.setBrand(dto.getBrand());
        smartphone.setSerialNumber(dto.getSerialNumber());
        smartphone.setReleaseDate(dto.getReleaseDate());
        smartphone.setStatus(dto.getStatus());
        repository.save(smartphone);
    }

    // Mettre à jour un smartphone existant
    public void putServiceSmartphone(Long id, SmartphoneDto dto) {
        SmartphoneModel smartphone = repository.findById(id).orElse(null);
        if (smartphone != null) {
            smartphone.setSerialNumber(dto.getSerialNumber());
            smartphone.setReleaseDate(dto.getReleaseDate());
            smartphone.setBrand(dto.getBrand());
            smartphone.setStatus(dto.getStatus());
            repository.save(smartphone);
        }
    }

    // Supprimer un smartphone
    public void deleteServiceSmartphone(Long id) {
        repository.deleteById(id);
    }
}
