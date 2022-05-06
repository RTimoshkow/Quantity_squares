package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculationOfQuantitySquares() {

        SQRService service = new SQRService();

        int min = 200;
        int max = 300;

        int expected = 3;
        int actual = service.calculationOfQuantitySquares(min, max);

        assertEquals(expected, actual);
        System.out.println(actual);
    }
}