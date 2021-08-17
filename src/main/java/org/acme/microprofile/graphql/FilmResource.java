package org.acme.microprofile.graphql;

import java.util.Collections;
import java.util.List;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class FilmResource {

    @Query("allFilms")
    @Description("Get all Films from a galaxy far far away")
    public List<Film> getAllFilms() {
        return Collections.emptyList();
    }

    @Mutation("watch")
    @Description("Watch a film")
    public FilmWatched watch(@Name("data") Film resource) {

        return new FilmWatched();
    }
}