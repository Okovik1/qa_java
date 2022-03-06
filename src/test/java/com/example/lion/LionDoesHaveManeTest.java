package com.example.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)

public class LionDoesHaveManeTest {

    @Mock
    Feline feline;

    private final String SEX;
    private final boolean EXPECTED;

    public LionDoesHaveManeTest(String sex, boolean EXPECTED) {
        this.SEX = sex;
        this.EXPECTED = EXPECTED;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"самец", true},
                {"самка", false},
                {" Самец", true},
                {"Самка ", false},
                {" Самец ", true},
                {" Самка ", false},
        };
    }

    @Test
    public void lionDoesHaveManeTest() throws Exception {
        Lion lion = new Lion(SEX, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(EXPECTED, actual);


    }
}
