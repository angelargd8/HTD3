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
        Comparable[] n = {9,5,3,1,2};
        Comparable[] ordenado = {1,2,3,5,9};
        assertEquals(Arrays.stream(ordenado).toList(), Arrays.stream().toList());
    }

}