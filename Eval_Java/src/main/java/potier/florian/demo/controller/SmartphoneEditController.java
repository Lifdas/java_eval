package potier.florian.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import potier.florian.demo.dto.SmartphoneDto;
import potier.florian.demo.model.SmartphoneModel;
import potier.florian.demo.service.SmartphoneService;

@Controller
@RequestMapping("/editSmartphone")
public class SmartphoneEditController {

    @Autowired
    private SmartphoneService smartphoneService;

    @GetMapping("/{id}")
    public String editSmartphone(@PathVariable("id") Long id, Model model) {
        // Récupérer le smartphone à modifier
        SmartphoneModel smartphone = smartphoneService.getServiceSmartphone(id);
        if (smartphone != null) {
            model.addAttribute("smartphone", smartphone);
            return "editSmartphone"; // Nom de la vue d'édition
        }
        return "redirect:/"; // Si le smartphone n'existe pas, rediriger vers la page d'accueil
    }

    @PostMapping("/{id}")
    public String updateSmartphone(@PathVariable("id") Long id, @ModelAttribute SmartphoneDto smartphoneDto) {
        smartphoneService.putServiceSmartphone(id, smartphoneDto);
        return "redirect:/"; // Redirige vers la page d'accueil après modification
    }
}
