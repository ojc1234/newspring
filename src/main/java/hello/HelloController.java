package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.*;


@Controller
public class HelloController{

    @RequestMapping(value = "/")
    public String index() 
    {
        return "home";
    }
    @RequestMapping("hello")
        public String hellostring(@RequestParam("name") String name) 
        {
            return "hello" + name;
        }
    @RequestMapping(value = "/myview")
    public String contentview(Model model)
    {
        model.addAttribute("value","hi");
        return "myview";
    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);

        return "hello-template";
    }

}

