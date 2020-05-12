package com.example.demo.util.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = QuantiteBananesValidator.class)
@Documented
public @interface CheckQuantiteMultipleVaingCinque {

    String message() default "la quantite doit etre un multiple de 25, parce qu’une caisse de bananes contient 25kg";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
