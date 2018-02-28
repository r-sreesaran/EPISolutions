package StackAndqueues;

import StacksAndqueues.Stack;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestStackImplementation {

    Stack<Integer> stack = new Stack<Integer>();

    @BeforeTest
    public void setupTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }


    @Test
    public void testStackLength() {
        Assert.assertEquals(stack.getSize(),3);
    }

    @Test
    public void testPop() {
        int data =  stack.pop();
        Assert.assertEquals(data,3);
        data = stack.pop();
        Assert.assertEquals(data,2);
    }




}
