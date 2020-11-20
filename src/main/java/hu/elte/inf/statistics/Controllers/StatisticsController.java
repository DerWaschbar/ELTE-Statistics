package hu.elte.inf.statistics.Controllers;

import hu.elte.inf.statistics.DAO.CoursesDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/** Statistics Controller Class */
@Controller
public class StatisticsController {
    /**
     * @param model
     * @return "statistics"
     */
    @GetMapping("/statistics")
    public String getData(Model model) {
        CoursesDAO coursesDAO = new CoursesDAO();
        model.addAttribute("courses", coursesDAO.getAll());
        return "statistics";
    }
}
