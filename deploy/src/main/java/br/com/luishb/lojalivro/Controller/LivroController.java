package br.com.luishb.lojalivro.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.luishb.lojalivro.Model.Livro;
import br.com.luishb.lojalivro.Repository.LivroRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;



@Controller
@RestController
public class LivroController {
    
    @Autowired
    LivroRepository livrosRepository;

    @GetMapping("/livros-list")
    public List<Livro> list() {
        return (List<Livro>) this.livrosRepository.findAll();    
    }

    @PostMapping("/livros-add")
    public ModelAndView create(@RequestBody Livro livro) {
        ModelAndView mv = new ModelAndView("livros-add");
        livrosRepository.save(livro);
        return mv;
    }
    
    


    

}



