package potier.florian.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import potier.florian.demo.service.SmartphoneService;

@Controller
@RequestMapping("/deleteSmartphone")
public class SmartphoneDeleteController {

    @Autowired
    private SmartphoneService smartphoneService;

    @PostMapping("/{id}")
    public String deleteSmartphone(@PathVariable("id") Long id) {
        smartphoneService.deleteServiceSmartphone(id);
        return "redirect:/"; // Redirige vers la page d'accueil après suppression
    }
}
