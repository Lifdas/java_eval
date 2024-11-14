package potier.florian.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import potier.florian.demo.dto.SmartphoneDto;
import potier.florian.demo.model.SmartphoneModel;
import potier.florian.demo.service.SmartphoneService;

@RestController //rest veut dire que l'on va utiliser du JSON pour le controller
@RequestMapping("/api") //veut dire qu'il y aura forcément le préfixe /smartphones aux url
public class SmartphoneController {
	
    @Autowired
    private SmartphoneService service;

    @GetMapping("/smartphones") //j'instancie la classe service qui existe déjà 
    //utiliseras le service smartphones pour récupérer la liste entière des smartphones
    public @ResponseBody Iterable<SmartphoneModel> getControllerSmartphones() {
        return this.service.getServiceSmartphones();
    }

    @GetMapping("/smartphones/{id}") 
    public @ResponseBody SmartphoneModel getControllerSmartphone(@PathVariable("id") Long id) {
        return this.service.getServiceSmartphone(id);
    }

    @PostMapping("/smartphones") 
    public void postControllerSmartphone(@RequestBody SmartphoneDto smartphone) {
        this.service.postServiceSmartphone(smartphone);
    }

    @PutMapping("/smartphones/{id}") 
    public void putControllerSmartphone(@RequestBody SmartphoneDto smartphone, @PathVariable("id") Long id) {
        this.service.putServiceSmartphone(id, smartphone);
    }

    @DeleteMapping("/smartphones/{id}")
    public void deleteControllerSmartphone(@PathVariable("id") Long id) {
        this.service.deleteServiceSmartphone(id);
    }
}
