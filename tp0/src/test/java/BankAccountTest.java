import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void depositShouldIncreaseBalanceForPositiveAmount() {
        // Arrange
        BankAccount account = new BankAccount(1000, 0.02);

        // Act
        account.deposit(500);

        // Assert
        assertEquals(1500, account.getBalance());
    }

    @Test
    void depositShouldThrowExceptionForNegativeAmount() {
        // Arrange
        BankAccount account = new BankAccount(1000, 0.02);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-500));
    }

    @Test
    void withdrawShouldDecreaseBalanceForSufficientFunds() {
        // Arrange
        BankAccount account = new BankAccount(1000, 0.02);

        // Act
        account.withdraw(500);

        // Assert
        assertEquals(500, account.getBalance());
    }

    @Test
    void withdrawShouldThrowExceptionForNegativeAmount() {
        // Arrange
        BankAccount account = new BankAccount(1000, 0.02);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-500));
    }

    @Test
    void withdrawShouldThrowExceptionForInsufficientFunds() {
        // Arrange
        BankAccount account = new BankAccount(500, 0.02);

        // Act and Assert
        assertThrows(IllegalStateException.class, () -> account.withdraw(1000));
    }

    @Test
    void transferShouldMoveMoneyBetweenAccounts() {
        // Arrange
        BankAccount sourceAccount = new BankAccount(1000, 0.02);
        BankAccount targetAccount = new BankAccount(500, 0.02);

        // Act
        sourceAccount.transfer(200, targetAccount);

        // Assert
        assertEquals(800, sourceAccount.getBalance());
        assertEquals(700, targetAccount.getBalance());
    }

    @Test
    void transferShouldThrowExceptionForNegativeAmount() {
        // Arrange
        BankAccount sourceAccount = new BankAccount(1000, 0.02);
        BankAccount targetAccount = new BankAccount(500, 0.02);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> sourceAccount.transfer(-200, targetAccount));
    }

    @Test
    void transferShouldThrowExceptionForNullTargetAccount() {
        // Arrange
        BankAccount sourceAccount = new BankAccount(1000, 0.02);

        // Act and Assert
        assertThrows(NullPointerException.class, () -> sourceAccount.transfer(200, null));
    }

    @Test
    void addInterestShouldIncreaseBalanceAccordingToInterestRate() {
        // Arrange
        BankAccount account = new BankAccount(1000, 0.02);

        // Act
        account.addInterest();

        // Assert
        assertEquals(1020, account.getBalance());
    }
}
