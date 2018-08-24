package com.hisptz.hris.Bundles.ResourceBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.core.Model.ModelQuery;
import com.hisptz.hris.core.Model.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class ResourceQuery extends ModelQuery<Resource>{
    @Autowired
    ResourceRepository resourceRepository;

    private ModelSpecification<Resource> spec;

    public ResourceQuery(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    public Resource getResourceById(Long id){
        return resourceRepository.findOne(id);
    }

    public List<Resource> Resources(String where, String orderBy){
        return query(where, spec, resourceRepository, orderBy);
    }
}
