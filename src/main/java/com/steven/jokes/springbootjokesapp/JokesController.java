package com.steven.jokes.springbootjokesapp;

import com.steven.jokes.springbootjokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * stevmc created on 2/11/20
 */
@Controller
public class JokesController {

	private final JokeService jokeService;

	public JokesController(JokeService jokeService) {
		this.jokeService = jokeService;
	}

	@RequestMapping({"/", ""})
	public String getRandomJoke(Model model) {

		model.addAttribute("joke", jokeService.getjoke());

		return "jokes/chucknorris";
	}
}
