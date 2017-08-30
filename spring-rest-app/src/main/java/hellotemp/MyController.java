package hellotemp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value="/login", method = RequestMethod.GET)
    public ModelAndView showLoginPage(ModelAndView model,@RequestParam String name){
        System.out.println(name);
        model.addObject("name", name);
        model.setViewName("file");
		return model;
    }
}
