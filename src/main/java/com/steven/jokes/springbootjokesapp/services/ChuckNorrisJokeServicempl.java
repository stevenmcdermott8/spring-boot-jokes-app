package com.steven.jokes.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * stevmc created on 2/11/20
 */
@Service
public class ChuckNorrisJokeServicempl implements JokeService {
	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public ChuckNorrisJokeServicempl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
