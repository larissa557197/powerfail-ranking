package br.com.fiap.powerfail_ranking.power;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/power")
public class PowerController {

    private final PowerService powerService;

    // construtor
    public PowerController(PowerService powerService) {
        this.powerService = powerService;
    }

    // GET 
    public String index(Model model) {
        var powers = powerService.getAllPowers();
        model.addAttribute("powers", powers);
        //página que vai ser exibida
        return "index";
    }
}
