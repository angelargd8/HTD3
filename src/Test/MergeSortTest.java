package Test;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import Modelo.MergeSort;
import java.util.Arrays;
import java.util.List;

public class MergeSortTest {
    @Test
    void sortTest() {
        MergeSort mergeSort = new MergeSort();
        Integer[] Vector = {2,3,4,1,6,5,7};
        Integer[] VectorOrdenado = {1,2,3,4,5,6,7};
        mergeSort.MergeSortt(Vector);
        Assert.assertArrayEquals(Vector, VectorOrdenado);
    }
    
}
