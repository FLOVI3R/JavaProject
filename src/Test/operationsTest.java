package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Operations.operations;

class operationsTest {
	@Test
	void test() {
		assertEquals(10, operations.add(5, 5));
	}
}
