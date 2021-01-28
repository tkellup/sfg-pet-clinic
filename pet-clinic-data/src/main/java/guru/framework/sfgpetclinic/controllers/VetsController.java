package guru.framework.sfgpetclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class VetsController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public ModelAndView index() {
        return new ModelAndView("vets/index.html");
    }
}
