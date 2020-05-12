package com.example.demo.util.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = QuantiteBananesValidator.class)
@Documented
public @interface CheckDestinataireExiste {

    String message() default "il existe deja un destinataire parfitement identique a ce que vous etes entrain de creer";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
