package com.unify.ta.interview;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Solution.class})
public class SolutionTest
{
    @Autowired
    private ISolution solution;

    @Getter
    @AllArgsConstructor
    private enum ResultMap
    {
        A("a", "#2=1\n");

        private final String letter;
        private final String result;
    }

    @Test
    public void simpleTest()
    {
        String found = solution.getSolution(ResultMap.A.getLetter());
        assertEquals("Result does not match with expected output", ResultMap.A.getResult(), found);
    }
}
