import static org.junit.Assert.*;
import org.junit.Test;

public class MergeSortedArraysTest {

    @Test
    public void testMergeBasic() {
        int[] A = {1, 3, 5};
        int[] B = {2, 4, 6};

        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = MergeSortedArrays.merge(A, B);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeWithEmptyArray() {
        int[] A = {};
        int[] B = {1, 2, 3};

        int[] expected = {1, 2, 3};
        int[] actual = MergeSortedArrays.merge(A, B);

        assertArrayEquals(expected, actual);
    }
}
