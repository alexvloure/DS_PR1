package edu.uoc.ds.adt;

import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.traversal.Iterator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;

import static edu.uoc.ds.adt.util.PeriodicFn.LEN;
import static edu.uoc.ds.adt.util.PeriodicFn.f;
import static org.junit.Assert.*;

public class PR1StackTest {

    PR1Stack pr1q;

    private void fillStack() {
        int count = 0;
        int num = 0;

        while (count < LEN ) {
            if (f(num)) {
                pr1q.push(num);
                count++;
            }
            num++;
        }
    }

    @Before
    public void setUp() {
        this.pr1q = new PR1Stack();

        assertNotNull(this.pr1q.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void stackTest() {

        assertEquals(this.pr1q.CAPACITY, this.pr1q.getStack().size());

        assertEquals(47, pr1q.pop(), 0);
        assertEquals(43, pr1q.pop(), 0);
        assertEquals(41, pr1q.pop(), 0);
        assertEquals(37, pr1q.pop(), 0);
        assertEquals(31, pr1q.pop(), 0);
        assertEquals(29, pr1q.pop(), 0);
        assertEquals(23, pr1q.pop(), 0);
        assertEquals(19, pr1q.pop(), 0);
        assertEquals(17, pr1q.pop(), 0);
        assertEquals(13, pr1q.pop(), 0);
        assertEquals(11, pr1q.pop(), 0);
        assertEquals(7, pr1q.pop(), 0);
        assertEquals(5, pr1q.pop(), 0);
        assertEquals(3, pr1q.pop(), 0);
        assertEquals(2, pr1q.pop(), 0);
        assertEquals(0, this.pr1q.getStack().size());
    }

}
