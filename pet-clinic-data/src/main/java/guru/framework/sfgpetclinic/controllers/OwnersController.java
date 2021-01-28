package guru.framework.sfgpetclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/owners")
@RestController
public class OwnersController {

    @RequestMapping({"", "/","/index", "/index.html"})
    public ModelAndView index() {
        return new ModelAndView("owners/index.html");
    }
}
