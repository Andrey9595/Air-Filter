package testing.filter;

import com.gridnine.testing.filter.FlightFilter;
import com.gridnine.testing.filter.FlightFilterWithoutMoreThanTwoHoursGroundTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static testing.TestData.ORIGIN;
import static testing.TestData.WITHOUT_MORE_THAN_TWO_HOURS_GROUND_TIME;

class FlightFilterWithoutMoreThanTwoHoursGroundTimeTest {

    FlightFilter flightFilter = new FlightFilterWithoutMoreThanTwoHoursGroundTime();

    @Test
    void filter() {
        assertEquals(flightFilter.filter(ORIGIN), WITHOUT_MORE_THAN_TWO_HOURS_GROUND_TIME);
    }
}