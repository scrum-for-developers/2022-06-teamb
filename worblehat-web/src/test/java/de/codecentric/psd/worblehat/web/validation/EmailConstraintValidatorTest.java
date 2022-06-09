package de.codecentric.psd.worblehat.web.validation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mock;

import javax.validation.ConstraintValidatorContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailConstraintValidatorTest {

  private EmailConstraintValidator emailConstraintValidator;

  private ConstraintValidatorContext constraintValidatorContext;

  @BeforeEach
  public void setUp() throws Exception {
    emailConstraintValidator = new EmailConstraintValidator();
    constraintValidatorContext = mock(ConstraintValidatorContext.class);
  }

  @Test
  void initializeShouldTakeEmail() {
    Email email = mock(Email.class);
    assertDoesNotThrow(() -> emailConstraintValidator.initialize(email));
  }

  @Test
  void shouldReturnTrueIfBlank() throws Exception {
    boolean actual = emailConstraintValidator.isValid("", constraintValidatorContext);
    assertTrue(actual);
  }

  @Test
  void shouldReturnTrueIfValidEmail() throws Exception {
    boolean actual = emailConstraintValidator.isValid("a@b.cd", constraintValidatorContext);
    assertTrue(actual);
  }

  @Test
  void shouldReturnFalseIfInvalidEmail() throws Exception {
    boolean actual = emailConstraintValidator.isValid("a@b", constraintValidatorContext);
    assertFalse(actual);
    actual = emailConstraintValidator.isValid("ab.de.de", constraintValidatorContext);
    assertFalse(actual);
  }
}
