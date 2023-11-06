package fatecrl.mvcTeste.controllers;

import fatecrl.mvcTeste.models.Filmes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("api/filmes")
public class DadosController {
    private final List<Filmes>
            filmes = new ArrayList<Filmes>();

    public DadosController() {
        filmes.add(new Filmes("Spider-Man","Livre"));
        filmes.add(new Filmes("Spider-Man 2","Livre"));
    }

    @GetMapping
    public List<Filmes> getAlunos()
    {
        return filmes;
    }
}