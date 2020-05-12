package com.example.demo.util.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class QuantiteBananesValidator implements ConstraintValidator<CheckQuantiteMultipleVaingCinque, Integer> {

    private static final int CAPACITE_CAISSE_BANANES = 25;

    @Override
    public boolean isValid(Integer valeur, ConstraintValidatorContext constraintValidatorContext) {
        return valeur%CAPACITE_CAISSE_BANANES==0;
    }
}
