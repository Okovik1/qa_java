package com.example.lion;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {

    private final String SEX;
    private final boolean expected;

    public LionDoesHaveManeTest(String sex, boolean expected) {
        this.SEX = sex;
        this.expected = expected;
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
        public void lionDoesHaveManeCheck() {
            try {
                Lion lion = new Lion(SEX);
                boolean actual = lion.doesHaveMane();
                assertEquals(expected, actual);
            } catch (java.lang.Exception exception) {
                System.out.println("Ошибка при вводе пола");
            }

        }
    }
