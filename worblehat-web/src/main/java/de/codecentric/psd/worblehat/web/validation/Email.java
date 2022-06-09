package de.codecentric.psd.worblehat.web.validation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = EmailConstraintValidator.class)
@Documented
public @interface Email {

  String message() default "{de.codecentric.psd.worblehat.web.validation.Email}";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
