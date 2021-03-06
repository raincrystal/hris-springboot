package com.hisptz.hris.Bundles.FormBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class FormQuery extends ModelQuery<Form>{
    @Autowired
    private FormRepository formRepository;

    private ModelSpecification spec;

    public FormQuery(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    public Form getFormById(Long id){
        return formRepository.getOne(id);
    }

    public List<Form> Forms(String where, String sort){
        return query(where, spec, formRepository, sort);
    }
}
