import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

/**
 * DO NOT MODIFY THIS FILE!
 */
public class StackTest {

    java.util.Stack stackBase = new datastructures.Stack<Integer>();

    @Test
    public void should_return_empty_stack_as_true_when_created() {
        java.util.Stack sTest = stackBase;
        Assert.assertTrue(sTest.empty());
    }

    @Test
    public void should_return_non_empty_stack_when_there_is_elements() {
        java.util.Stack sTest = stackBase;
        sTest.push(1);
        Assert.assertFalse(sTest.empty());
    }

    @Test
    public void should_return_empty_after_some_operations() {
        java.util.Stack sTest = stackBase;
        sTest.push(1);
        sTest.pop();
        Assert.assertTrue(sTest.empty());

        sTest.push(2);
        sTest.push(3);
        sTest.pop();
        Assert.assertFalse(sTest.empty());

        sTest.pop();
        Assert.assertTrue(sTest.empty());
    }


    @Test
    public void should_push_elements_correctly() {
        java.util.Stack sTest = stackBase;

        sTest.push(1);
        Assert.assertEquals(sTest.peek(), 1);

        sTest.push(3);
        Assert.assertEquals(sTest.peek(), 3);

        sTest.push(5);
        Assert.assertEquals(sTest.peek(), 5);

        sTest.push(8);
        Assert.assertEquals(sTest.peek(), 8);
    }

    @Test
    public void should_pop_elements_correctly() {
        java.util.Stack sTest = stackBase;

        sTest.push(1);
        sTest.push(3);
        sTest.push(5);
        sTest.push(8);

        Assert.assertEquals(sTest.pop(), 8);
        Assert.assertEquals(sTest.pop(), 5);
        Assert.assertEquals(sTest.pop(), 3);
        Assert.assertEquals(sTest.pop(), 1);
    }

    @Test
    public void should_search_elements_correctly() {
        java.util.Stack sTest = stackBase;

        sTest.push(1);
        sTest.push(3);
        sTest.push(5);
        sTest.push(8);

        Assert.assertEquals(sTest.search(8), 1);
        Assert.assertEquals(sTest.search(3), 3);
        Assert.assertEquals(sTest.search(20), -1);
    }

    @Test(expected = EmptyStackException.class)
    public void should_thrown_exception_when_peek_without_elements() {
        java.util.Stack sTest = stackBase;
        sTest.peek();
    }

    @Test(expected = EmptyStackException.class)
    public void should_thrown_exception_when_peek_without_elements_after_operations() {
        java.util.Stack sTest = stackBase;

        sTest.push(1);
        sTest.push(3);

        sTest.pop();
        sTest.pop();

        sTest.peek();
    }

}
