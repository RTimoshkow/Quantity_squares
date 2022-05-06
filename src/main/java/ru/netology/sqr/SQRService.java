package ru.netology.sqr;

public class SQRService {

    public int calculationOfQuantitySquares(int min, int max) {

        int quantitySquares = 0;

        for (int i = 10; i < 99; i++) {
            int sqr = i * i;
            if (sqr >= min && sqr <= max) {
                quantitySquares++;
            }
        }
        return quantitySquares;
    }
}
