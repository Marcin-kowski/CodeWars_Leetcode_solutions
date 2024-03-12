package org.example.solutions.SortBinaryTreeByLevels;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void nullTest() {
      assertEquals(Arrays.asList(), Kata.treeByLevels(null));
    }
    
    @Test
    public void basicTest() {
      assertEquals(Arrays.asList(1,2,3,4,5,6), Kata.treeByLevels(new Node(new Node(null, new Node(null, null, 4), 2), new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1)));
    }
}