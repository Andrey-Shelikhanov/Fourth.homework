package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationCalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void testCalculateRestMonths(int income, int expenses, int threshold, int expected) {
        VacationCalcService vacationCalcService = new VacationCalcService();

        int actual = vacationCalcService.calculateRestMonths(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
