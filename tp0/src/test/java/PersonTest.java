import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getFullNameShouldReturnCorrectFullName() {
        // Arrange
        Person person = new Person("Bouhafs", "Adem", 23);

        // Act
        String fullName = person.getFullName();

        // Assert
        assertEquals("Bouhafs Adem", fullName);
    }

    @Test
    void isAdultShouldReturnTrueForAdultPerson() {
        // Arrange
        Person adultPerson = new Person("Mebarkia", "Ameur", 21);

        // Act
        boolean isAdult = adultPerson.isAdult();

        // Assert
        assertTrue(isAdult);
    }

    @Test
    void isAdultShouldReturnFalseForNonAdultPerson() {
        // Arrange
        Person nonAdultPerson = new Person("Bouaacha", "Seif", 17);

        // Act
        boolean isAdult = nonAdultPerson.isAdult();

        // Assert
        assertFalse(isAdult);
    }
}
