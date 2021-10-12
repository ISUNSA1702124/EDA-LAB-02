import org.junit.Assert;
import org.junit.Test;


/**
 * DO NOT MODIFY THIS FILE!
 */
public class QueueTest {

    java.util.Queue queueBase = new datastructures.Queue<Integer>();

    @Test
    public void should_return_empty_when_created() {
        java.util.Queue qTest = queueBase;

        Assert.assertTrue(qTest.isEmpty());
    }

    @Test
    public void should_return_non_empty_when_there_is_elements() {
        java.util.Queue qTest = queueBase;
        qTest.add(1);
        Assert.assertFalse(qTest.isEmpty());
    }

    @Test
    public void should_return_empty_after_some_operations() {
        java.util.Queue qTest = queueBase;

        qTest.add(1);
        qTest.poll();

        Assert.assertTrue(qTest.isEmpty());

        qTest.add(1);
        qTest.add(4);
        qTest.poll();

        Assert.assertFalse(qTest.isEmpty());

        qTest.poll();

        Assert.assertTrue(qTest.isEmpty());
    }

    @Test
    public void should_add_elements_correctly() {
        java.util.Queue qTest = queueBase;

        qTest.add(1);
        Assert.assertEquals(qTest.element(), 1);
        qTest.add(3);
        Assert.assertEquals(qTest.element(), 1);
        qTest.add(5);
        Assert.assertEquals(qTest.element(), 1);
        qTest.add(7);
        Assert.assertEquals(qTest.element(), 1);
    }

    @Test
    public void should_poll_elements_correctly() {
        java.util.Queue qTest = queueBase;
        qTest.add(1);
        qTest.add(3);
        qTest.add(5);
        qTest.add(7);

        Assert.assertEquals(qTest.poll(), 1);
        Assert.assertEquals(qTest.poll(), 3);
        Assert.assertEquals(qTest.poll(), 5);
        Assert.assertEquals(qTest.poll(), 7);
    }

    @Test
    public void should_return_element_when_peek_list_elements() {
        java.util.Queue qTest = queueBase;
        qTest.add(3);
        Assert.assertEquals(qTest.peek(), 3);
    }

    @Test
    public void should_return_null_when_peek_empty_list() {
        java.util.Queue qTest = queueBase;
        Assert.assertEquals(qTest.peek(), null);
    }

}
