import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {
private Stack stack = new Stack();
@BeforeEach
    @Test
    void pushAndPopShouldWorkCorrectly() {
        // Arrange



        // Act
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Assert
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void peekShouldReturnTopElementWithoutRemoving() {
        // Arrange
        //Stack stack = new Stack();

        // Act
        stack.push(10);
        stack.push(20);

        // Assert
        assertEquals(20, stack.peek());
        assertEquals(2, stack.size()); // Size should remain unchanged
    }

    @Test
    void popOnEmptyStackShouldThrowException() {
        // Arrange
      //  Stack emptyStack = new Stack();

        // Act and Assert
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    void peekOnEmptyStackShouldThrowException() {
        // Arrange
       // Stack emptyStack = new Stack();

        // Act and Assert
        assertThrows(IllegalStateException.class, stack::peek);
    }

    @Test
    void sizeShouldReturnCorrectStackSize() {
        // Arrange
        //Stack stack = new Stack();

        // Act
        stack.push(5);
        stack.push(10);

        // Assert
        assertEquals(2, stack.size());
    }

    @Test
    void isEmptyShouldReturnTrueForEmptyStack() {
        // Arrange
      //  Stack emptyStack = new Stack();

        // Assert
        assertTrue(stack.isEmpty());
    }

    @Test
    void isEmptyShouldReturnFalseForNonEmptyStack() {
        // Arrange
     //   Stack stack = new Stack();

        // Act
        stack.push(42);

        // Assert
        assertFalse(stack.isEmpty());
    }
}
