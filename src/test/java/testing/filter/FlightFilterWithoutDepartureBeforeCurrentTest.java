package testing.filter;

import com.gridnine.testing.filter.FlightFilter;
import com.gridnine.testing.filter.FlightFilterWithoutDepartureBeforeCurrent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static testing.TestData.ORIGIN;
import static testing.TestData.WITHOUT_DEPARTURE_BEFORE_CURRENT;

class FlightFilterWithoutDepartureBeforeCurrentTest {

    FlightFilter flightFilter = new FlightFilterWithoutDepartureBeforeCurrent();

    @Test
    void filter() {
        assertEquals(flightFilter.filter(ORIGIN), WITHOUT_DEPARTURE_BEFORE_CURRENT);
    }
}