package com.dbbyte.multitenancy.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dbbyte.multitenancy.domains.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
