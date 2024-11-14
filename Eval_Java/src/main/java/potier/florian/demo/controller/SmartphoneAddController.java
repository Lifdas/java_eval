package potier.florian.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SmartphoneAddController {

    @GetMapping("/addSmartphone")
    public String addSmartphonePage(Model model) {
        // Tu peux ajouter des données au modèle si nécessaire
        model.addAttribute("message", "Ajoutez un nouveau smartphone!");
        return "addSmartphone"; // Cette vue doit exister dans le répertoire 'templates'
    }
}
