package Test;


import Modelo.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sort() {
        BubbleSort bs = new BubbleSort();
        Comparable[] n = {9,5,3,1,2};
        Comparable[] ordenado = {1,2,3,5,9};
        assertEquals(Arrays.stream(ordenado).toList(), Arrays.stream(bs.sort(n)).toList());
    }




}