package testing.filter;

import com.gridnine.testing.filter.FlightFilter;
import com.gridnine.testing.filter.FlightFilterWithoutArrivalBeforeDeparture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static testing.TestData.ORIGIN;
import static testing.TestData.WITHOUT_ARRIVAL_BEFORE_DEPARTURE;

class FlightFilterWithoutArrivalBeforeDepartureTest {

    FlightFilter flightFilter = new FlightFilterWithoutArrivalBeforeDeparture();

    @Test
    void filter() {
        assertEquals(flightFilter.filter(ORIGIN), WITHOUT_ARRIVAL_BEFORE_DEPARTURE);
    }
}