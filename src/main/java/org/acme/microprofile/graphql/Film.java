package org.acme.microprofile.graphql;

import java.time.LocalDate;

import org.eclipse.microprofile.graphql.Input;

@Input
public class Film implements Model {
    public String title;
    public Integer episodeID;
    public String director;
    public LocalDate releaseDate;
}
