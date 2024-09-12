package telran.datesort.tests;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

import telran.datesort.model.SortByDates;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DateSortTest {

    @Test
    void test() {
        String[] dates = {"07-05-1990", "28-01-2010", "11-08-1990", "15-01-2010", "16/06/1970"};
        String[] expected = {"16/06/1970", "07-05-1990", "11-08-1990", "15-01-2010", "28-01-2010"};

        Comparator<String> comp = (d1, d2) -> {
            String date1 = SortByDates.format(d1);
            String date2 = SortByDates.format(d2);
            return date1.compareTo(date2);
        };

        Arrays.sort(dates, comp);

        assertArrayEquals(expected, dates);
    }
}
