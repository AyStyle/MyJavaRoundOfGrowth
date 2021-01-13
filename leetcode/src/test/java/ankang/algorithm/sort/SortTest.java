package ankang.algorithm.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

class SortTest {

    @ParameterizedTest
    @ValueSource(classes = {BubbleSort.class , SelectionSort.class , InsertionSort.class ,
            ShellSort.class , MergeSort.class , QuickSort.class , QuickSort2.class})
    void testSort(Class<Sort<Integer>> cls) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final Integer[] elements = {7 , 1 , 4 , 2 , 6 , 8 , 5 , 3 , 9 , 0};

        final Integer[] expected = {0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9};
        final Integer[] actual = cls.getConstructor().newInstance().sort(elements);

        Assertions.assertTrue(Arrays.equals(expected , actual) , "排序结果不正确：" + Arrays.toString(actual));
    }

}