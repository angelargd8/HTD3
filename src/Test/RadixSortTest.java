package Test;

import Modelo.BubbleSort;
import Modelo.RadixSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {

    @Test
    void sort() {
        RadixSort rs = new RadixSort();
        Comparable[] n = {10,5,3,1,2, 9};
        Comparable[] ordenado = {1,2,3,5,9,10};
        assertEquals(Arrays.stream(ordenado).toList(), Arrays.stream(rs.sort(n)).toList());
    }

}