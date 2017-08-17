package com.dbbyte.multitenancy.controllers;

/**
 * step_6 - The last step is to implement a Rest controller to access to the
 * data. Note that the Uri of the endpoint contains the 'tenantId' pattern. Of
 * course, there are different ways to do that. For example using domains or
 * subdomains and so on.
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.dbbyte.multitenancy.domains.Article;
import com.dbbyte.multitenancy.repositories.ArticleRepository;

@RestController
//@RequestMapping("/{tenantId}/article")
public class ArticleController {
    
    @Autowired
    private ArticleRepository repository;
    
    @RequestMapping(path= "/", method = RequestMethod.GET)
    public String isUp() {
       return "OK";
    }

    @RequestMapping(path= "/{tenantId}/articles", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Article> getArticleByTenant() {
       return Lists.newArrayList(repository.findAll());
    }
    
    @RequestMapping(path= "/articles", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Article> getAllArticles() {
       return Lists.newArrayList(repository.findAll());
    }

}
