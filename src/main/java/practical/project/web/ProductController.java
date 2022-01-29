package practical.project.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import practical.project.domain.Product;

@Controller
public class ProductController {
  @RequestMapping("/")
  public String index(Model model){
    return "index";
  }
}
