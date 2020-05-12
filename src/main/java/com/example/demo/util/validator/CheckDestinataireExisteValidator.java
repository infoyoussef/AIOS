package com.example.demo.util.validator;

import com.example.demo.model.Destinataire;
import com.example.demo.service.DestinataireService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class CheckDestinataireExisteValidator implements ConstraintValidator<CheckQuantiteMultipleVaingCinque, Destinataire> {

    @Autowired
    DestinataireService destinataireService;

    @Override
    public boolean isValid(Destinataire destinataire, ConstraintValidatorContext constraintValidatorContext) {

        List<Destinataire> destinatairesExistes = destinataireService.getAllDestinataires();
        return ! destinatairesExistes.contains(destinataire);
    }
}
