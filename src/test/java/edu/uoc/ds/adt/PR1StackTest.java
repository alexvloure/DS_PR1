package edu.uoc.ds.adt;

import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.traversal.Iterator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.*;

import static edu.uoc.ds.adt.util.PeriodicFn.LEN;
import static edu.uoc.ds.adt.util.PeriodicFn.f;

public class PR1StackTest {

    PR1Stack pr1q;

    private void fillStack() {
        for (int i = 0; i < LEN; i++) {
            pr1q.push(f(i));
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

        Assert.assertEquals(72, pr1q.pop(), 0);
        Assert.assertEquals(67, pr1q.pop(), 0);
        Assert.assertEquals(62, pr1q.pop(), 0);
        Assert.assertEquals(57, pr1q.pop(), 0);
        Assert.assertEquals(52, pr1q.pop(), 0);
        Assert.assertEquals(47, pr1q.pop(), 0);
        Assert.assertEquals(42, pr1q.pop(), 0);
        Assert.assertEquals(37, pr1q.pop(), 0);
        Assert.assertEquals(32, pr1q.pop(), 0);
        Assert.assertEquals(27, pr1q.pop(), 0);
        Assert.assertEquals(22, pr1q.pop(), 0);
        Assert.assertEquals(17, pr1q.pop(), 0);
        Assert.assertEquals(12, pr1q.pop(), 0);
        Assert.assertEquals(7, pr1q.pop(), 0);
        Assert.assertEquals(2, pr1q.pop(), 0);
        assertEquals(0, this.pr1q.getStack().size());
    }

}
