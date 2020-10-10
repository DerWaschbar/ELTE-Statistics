package hu.elte.inf.statistics.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView render(HttpServletRequest req) {
        ModelAndView mv = new ModelAndView("main");
        return mv;
    }

    @PostMapping("/")
    public ModelAndView update(HttpServletRequest req, @RequestParam String button) {
        if (button.equals("bt1")) {
            return new ModelAndView("redirect:statistics");
        } else {
            return new ModelAndView("redirect:rateCourse");
        }
    }

}
