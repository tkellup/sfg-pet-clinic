package guru.framework.sfgpetclinic.controllers;

import guru.framework.sfgpetclinic.services.VetService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/vets")
@RestController
public class VetsController {
    private final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/", "/index", "/index.html"})
    public ModelAndView index(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return new ModelAndView("vets/index.html");
    }
}
