package org.example.solutions.KeypadTextEntry;

import static org.junit.Assert.*;
import org.junit.Test;

public class KeypadTest {
    @Test
    public void simpleTest() {
      assertEquals(9, KeypadBetterSolution.presses("LOL"));
      assertEquals(13, KeypadBetterSolution.presses("HOW R U"));
    }
}