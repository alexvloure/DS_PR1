package edu.uoc.ds.adt;

import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.traversal.Iterator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static edu.uoc.ds.adt.util.PeriodicFn.LEN;
import static edu.uoc.ds.adt.util.PeriodicFn.f;


public class PR1QueueTest {
    PR1Queue pr1q;

    private void fillQueue() {
        for (int i = 0; i < LEN; i++) {
            pr1q.add(f(i));

        }
    }
    @Before
    public void setUp() {
        this.pr1q = new PR1Queue();

        assertNotNull(this.pr1q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void queueTest() {
        assertEquals(this.pr1q.CAPACITY, this.pr1q.getQueue().size());
        Assert.assertEquals(2, pr1q.poll(), 0);
        Assert.assertEquals(7, pr1q.poll(), 0);
        Assert.assertEquals(12, pr1q.poll(), 0);
        Assert.assertEquals(17, pr1q.poll(), 0);
        Assert.assertEquals(22, pr1q.poll(), 0);
        Assert.assertEquals(27, pr1q.poll(), 0);
        Assert.assertEquals(32, pr1q.poll(), 0);
        Assert.assertEquals(37, pr1q.poll(), 0);
        Assert.assertEquals(42, pr1q.poll(), 0);
        Assert.assertEquals(47, pr1q.poll(), 0);
        Assert.assertEquals(52, pr1q.poll(), 0);
        Assert.assertEquals(57, pr1q.poll(), 0);
        Assert.assertEquals(62, pr1q.poll(), 0);
        Assert.assertEquals(67, pr1q.poll(), 0);
        Assert.assertEquals(72, pr1q.poll(), 0);
        assertEquals(0, this.pr1q.getQueue().size());
    }

    @Test
    public void queueTest2() {

        Queue<Integer> queue = pr1q.getQueue();
        Iterator<Integer> it = queue.values();
        assertTrue(it.hasNext());
        assertEquals(2, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(7, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(12, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(17, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(22, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(27, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(32, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(37, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(42, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(47, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(52, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(57, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(62, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(67, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(72, it.next(), 0);
    }

}
