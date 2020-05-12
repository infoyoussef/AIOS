package com.example.demo.util.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class CheckDateLivraisonValidator implements ConstraintValidator<CheckDateLivraison, Date>{

    @Override
    public boolean isValid(Date date, ConstraintValidatorContext constraintValidatorContext) {

        Calendar expected = Calendar.getInstance();
        expected.setTime(new Date());
        expected.add(Calendar.WEEK_OF_YEAR, 1);

        System.out.println("date = "+date.toString());
        System.out.println("expected.getTime() = "+expected.getTime().toString());

        return !expected.getTime().after(date);
        //return ! expected.after();
    }
}
