package com.ideal.studentlog.helpers.validators.implementations;

import com.ideal.studentlog.database.repositories.SubjectRepository;
import com.ideal.studentlog.helpers.validators.annotations.ValidAdminId;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AdminIdValidityChecker implements ConstraintValidator<ValidAdminId, Integer> {

    @Autowired
    private SubjectRepository repository;

    @Override
    public void initialize(ValidAdminId constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer id, ConstraintValidatorContext context) {
        return repository.findById(id).isPresent();
    }

}
