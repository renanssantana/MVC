package fatecrl.mvcTeste.controllers;

import fatecrl.mvcTeste.models.Filmes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;



@Controller
@RequestMapping("/filmes")
public class FilmeController {
    private final List<Filmes>
            filmes = new ArrayList<Filmes>();

    public FilmeController() {
        filmes.add(new Filmes("Spider-Man","Livre"));
        filmes.add(new Filmes("Spider-Man 2","Livre"));
    }

    @GetMapping
    public String getFilmes(Model model)
    {
        model.addAttribute("filmes",filmes);
        return "filmes";
    }
}