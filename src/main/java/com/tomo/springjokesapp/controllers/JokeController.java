package com.tomo.springjokesapp.controllers;

import com.tomo.springjokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController
{
    private final JokesService jokesService;

//    @Autowired -- we can omit annotation
    public JokeController(JokesService jokesService)
    {
        this.jokesService = jokesService;
    }
    @RequestMapping({"/", ""})
    public String getJoke(Model model)
    {
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
}
