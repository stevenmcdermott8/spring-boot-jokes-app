package com.steven.jokes.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

/**
 * stevmc created on 2/11/20
 */
@Component
public class ChuckNorrisJokeServicempl implements JokeService {
	@Override
	public String getjoke() {
		return new ChuckNorrisQuotes().getRandomQuote();
	}
}
