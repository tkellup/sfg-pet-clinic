package guru.framework.sfgpetclinic.controllers;

import guru.framework.sfgpetclinic.services.OwnerService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/owners")
@RestController
public class OwnersController {
    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    //return owners index page
    @RequestMapping({"", "/", "/index", "/index.html"})
    public ModelAndView listOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return new ModelAndView("owners/index.html");
    }

//    @RequestMapping({"", "/","/index", "/index.html"})
//    public ModelAndView index() {
//        return new ModelAndView("owners/index.html");
//    }
}
