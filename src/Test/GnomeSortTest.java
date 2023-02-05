package Test;

import Modelo.GnomeSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GnomeSortTest {

    @Test
    void gnomeSrt() {
        GnomeSort gs = new GnomeSort();
        Comparable[] n = {9,5,3,1,2};
        Comparable[] ordenado = {1,2,3,5,9};
        gs.gnomeSrt(n);
        assertEquals(Arrays.stream(ordenado).toList(), Arrays.stream(n).toList());
    }
}