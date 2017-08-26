package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieTitlesShower {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movieMap = new HashMap<>();
        movieMap = movieStore.getMovies();

        String movieTitles = movieMap.entrySet().stream()
                .flatMap(list -> list.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movieTitles);
    }
}
