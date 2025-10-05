package edu.uoc.ds.adt;

import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.traversal.Iterator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static edu.uoc.ds.adt.util.PeriodicFn.LEN;
import static edu.uoc.ds.adt.util.PeriodicFn.f;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class PR1QueueTest {
    PR1Queue pr1q;

    private void fillQueue() {
        int count = 0;
        int num = 0;

        while (count < LEN ) {
            if (f(num)) {
                pr1q.add(num);
                count++;
            }
            num++;
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
        assertEquals(2, pr1q.poll(), 0);
        assertEquals(3, pr1q.poll(), 0);
        assertEquals(5, pr1q.poll(), 0);
        assertEquals(7, pr1q.poll(), 0);
        assertEquals(11, pr1q.poll(), 0);
        assertEquals(13, pr1q.poll(), 0);
        assertEquals(17, pr1q.poll(), 0);
        assertEquals(19, pr1q.poll(), 0);
        assertEquals(23, pr1q.poll(), 0);
        assertEquals(29, pr1q.poll(), 0);
        assertEquals(31, pr1q.poll(), 0);
        assertEquals(37, pr1q.poll(), 0);
        assertEquals(41, pr1q.poll(), 0);
        assertEquals(43, pr1q.poll(), 0);
        assertEquals(47, pr1q.poll(), 0);
        assertEquals(0, this.pr1q.getQueue().size());
    }

    @Test
    public void queueTest2() {

        Queue<Integer> queue = pr1q.getQueue();
        Iterator<Integer> it = queue.values();
        assertTrue(it.hasNext());
        assertEquals(2, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(3, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(5, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(7, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(11, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(13, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(17, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(19, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(23, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(29, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(31, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(37, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(41, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(43, it.next(), 0);

        assertTrue(it.hasNext());
        assertEquals(47, it.next(), 0);

    }

}
