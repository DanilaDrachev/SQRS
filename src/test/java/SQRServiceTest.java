package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import ru.netology.javaqa.javaqamvn.services.SQRService;

public class SQRServiceTest {
    @Test
    void DiapozonFirst ()
    {SQRServise servise;
        servise = new SQRServise();

        int min = 200;
        int max = 300;
        int expected = 3;

        int index = SQRServise.calculate (min, max);

        assertEquals(expected, index);
    }

    @Test
    void DiapozonSecond ()
    {SQRServise servise;
        servise = new SQRServise();

        int min = 100;
        int max = 300;
        int expected = 8;

        int index = SQRServise.calculate (min, max);

        assertEquals(expected, index);
    }
}
