package potier.florian.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import potier.florian.demo.model.SmartphoneModel;
import potier.florian.demo.service.SmartphoneService;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private SmartphoneService smartphonService; // Injection du UserService

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Bienvenue sur notre site de Smartphones!");
        
        // Récupérer tous les utilisateurs et les ajouter au modèle
        List<SmartphoneModel> smartphones = (List<SmartphoneModel>) smartphonService.getServiceSmartphones();
        model.addAttribute("smartphones", smartphones); 
        return "home"; // Le nom de la vue, qui correspond à home.html dans le dossier templates
    }
}