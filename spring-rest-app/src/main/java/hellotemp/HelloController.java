package hellotemp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from <br>Spring Boot!";
    }
    
    @RequestMapping("/test")
    public String sampleValue(){
    	 return "Sample Value";
    }

}