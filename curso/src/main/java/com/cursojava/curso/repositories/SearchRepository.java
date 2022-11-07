package com.cursojava.curso.repositories;

import com.cursojava.curso.entities.WebPage;

import java.util.List;

public interface SearchRepository {

    List<WebPage> search(String textSearch);

    List<WebPage> getLinksToIndex();

    void save(WebPage webPage);

    WebPage getByUrl(String url);

    boolean exist(String link);
}
