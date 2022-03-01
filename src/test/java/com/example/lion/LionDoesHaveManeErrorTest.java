package com.example.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionDoesHaveManeErrorTest {
    @Mock
    Feline feline;

    private final String EXPECTED = "Используйте допустимые значения пола животного - самец или самка";

    @Test
    public void lionDoesHaveManeErrorCheck() {
        try {
            Lion lion = new Lion("Самец1", feline);
            boolean actual = lion.doesHaveMane();
            Assert.fail("Переход к ошибке не произошел, проверь параметры на входе");
        } catch (java.lang.Exception exception) {
            assertEquals(EXPECTED, exception.getMessage());
        }
    }
}
