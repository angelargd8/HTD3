package Test;

import Modelo.QuikSort;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuikSortTest {

    @Test
    void sortTest() {
        QuikSort qs = new QuikSort();
        int[] list = {10,4,7,2,3,9,1};
        int[] listO = {1,2,3,4,7,9,10};
        qs.sort(list, 0 , list.length-1);
        Assert.assertArrayEquals(listO, list);
    }

}