import exercises.Exercise1;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * DO NOT MODIFY THIS FILE!
 */
public class Exercise1Test {

    Exercise1 exercise1 = new Exercise1();

    @Test
    public void case_1() {

        List<Integer> h1 = Arrays.asList(3, 2, 1, 1, 1);
        List<Integer> h2 = Arrays.asList(4, 3, 2);
        List<Integer> h3 = Arrays.asList(1, 1, 4, 1);

        int result = exercise1.equalStacks(h1, h2, h3);

        Assert.assertEquals(result, 5);

    }

    @Test
    public void case_2() {

        List<Integer> h1 = Arrays.asList(0);
        List<Integer> h2 = Arrays.asList(0);
        List<Integer> h3 = Arrays.asList(0);

        int result = exercise1.equalStacks(h1, h2, h3);

        Assert.assertEquals(result, 0);

    }

    @Test
    public void case_3() {

        List<Integer> h1 = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> h2 = Arrays.asList(3, 2);
        List<Integer> h3 = Arrays.asList(1, 2, 3);

        int result = exercise1.equalStacks(h1, h2, h3);

        Assert.assertEquals(result, 3);

    }

    @Test
    public void case_4() {

        List<Integer> h1 = Arrays.asList(1, 4, 4, 1, 1);
        List<Integer> h2 = Arrays.asList(1, 2, 3);
        List<Integer> h3 = Arrays.asList(1, 3, 10, 20);

        int result = exercise1.equalStacks(h1, h2, h3);

        Assert.assertEquals(result, 1);

    }

}
