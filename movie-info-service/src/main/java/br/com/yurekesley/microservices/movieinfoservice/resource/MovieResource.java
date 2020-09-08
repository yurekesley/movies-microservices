package br.com.yurekesley.microservices.movieinfoservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yurekesley.microservices.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		/*
		 * MovieSummary movieSummary = restTemplate.getForObject(
		 * "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey,
		 * MovieSummary.class); return new Movie(movieId, movieSummary.getTitle(),
		 * movieSummary.getOverview());
		 **/

		return new Movie("1f54bd990f1cdfb230adb312546d765d", "Movie", "Description");
	}

}