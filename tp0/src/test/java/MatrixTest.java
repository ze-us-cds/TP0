import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    @Test
    void setAndGetShouldWorkCorrectly() {
        // Arrange
        Matrix matrix = new Matrix(3);

        // Act
        matrix.set(1, 2, 5);

        // Assert
        assertEquals(5, matrix.get(1, 2));
    }

    @Test
    void addShouldWorkCorrectly() {
        // Arrange
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(2);

        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        // Act
        matrix1.add(matrix2);

        // Assert
        assertEquals(6, matrix1.get(0, 0));
        assertEquals(8, matrix1.get(0, 1));
        assertEquals(10, matrix1.get(1, 0));
        assertEquals(12, matrix1.get(1, 1));
    }

    @Test
    void addShouldThrowExceptionForDifferentSizes() {
        // Arrange
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(3);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> matrix1.add(matrix2));
    }

    @Test
    void multiplyShouldWorkCorrectly() {
        // Arrange
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(2);

        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        // Act
        matrix1.multiply(matrix2);

        // Assert
        assertEquals(19, matrix1.get(0, 0));
        assertEquals(22, matrix1.get(0, 1));
        assertEquals(43, matrix1.get(1, 0));
        assertEquals(50, matrix1.get(1, 1));
    }

    @Test
    void multiplyShouldThrowExceptionForDifferentSizes() {
        // Arrange
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(3);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> matrix1.multiply(matrix2));
    }

    @Test
    void transposeShouldWorkCorrectly() {
        // Arrange
        Matrix matrix = new Matrix(2);

        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(1, 0, 3);
        matrix.set(1, 1, 4);

        // Act
        matrix.transpose();

        // Assert
        assertEquals(1, matrix.get(0, 0));
        assertEquals(3, matrix.get(0, 1));
        assertEquals(2, matrix.get(1, 0));
        assertEquals(4, matrix.get(1, 1));
    }

    @Test
    void toStringShouldReturnFormattedString() {
        // Arrange
        Matrix matrix = new Matrix(2);

        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(1, 0, 3);
        matrix.set(1, 1, 4);

        // Act
        String result = matrix.toString();

        // Assert
        assertEquals("[1, 2]\n[3, 4]\n", result);
    }


    @Test
    void addShouldThrowExceptionForNullMatrix() {
        // Arrange
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> matrix1.add(matrix2));
    }

    @Test
    void multiplyShouldThrowExceptionForNullMatrix() {
        // Arrange
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> matrix1.multiply(matrix2));
    }

    @Test
    void transposeShouldThrowExceptionForNullMatrix() {
        // Arrange
        Matrix matrix = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> matrix.transpose());
    }

    @Test
    void toStringShouldThrowExceptionForNullMatrix() {
        // Arrange
        Matrix matrix = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> matrix.toString());
    }
}

