import java.util.List;

import org.junit.Test;

/**
 * 
 */

/**
 * @author debmalyajash
 *
 */
public class MainTest {

	/**
	 * Test method for {@link Main#processEachInput(int)}.
	 */
	@Test
	public final void testProcessEachInput() {
	    Permutation.processEachInput(3);		
	    Permutation.processEachInput(1);
	    Permutation.processEachInput(10);

		System.out.println("Thanks");
	}

}
