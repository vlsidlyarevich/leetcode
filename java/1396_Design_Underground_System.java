import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Design_Underground_System.
 *
 * @author Vladislav Sidlyarevich
 * @since 28.08.2023
 */
class Design_Underground_System {

    public class UndergroundSystem {

        Map<Integer, Passenger> passengersInTrip;
        Map<String, Route> routes;


        public UndergroundSystem() {
            passengersInTrip = new HashMap<>();
            routes = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            if (passengersInTrip.containsKey(id)) return;

            passengersInTrip.put(id, new Passenger(stationName, t));
        }

        public void checkOut(int id, String stationName, int t) {
            var passenger = passengersInTrip.get(id);
            var route = routes.get(passenger.startStation + "-" + stationName);
            if (route == null) {
                route = new Route(passenger.startStation, stationName);
                routes.put(passenger.startStation + "-" + stationName, route);
            }

            route.rides.add(new Ride(passenger.checkInTime, t));
            passengersInTrip.remove(id);
        }

        public double getAverageTime(String startStation, String endStation) {
            var route = routes.get(startStation + "-" + endStation);
            double sum = 0;
            for (Ride ride : route.rides) {
                sum += ride.checkOutTime - ride.checkInTime;
            }
            return sum / route.rides.size();
        }

        public class Passenger {

            String startStation;

            int checkInTime;

            public Passenger(String startStation, int checkInTime) {
                this.startStation = startStation;
                this.checkInTime = checkInTime;
            }
        }

        public class Ride {

            int checkInTime;

            int checkOutTime;

            public Ride(int checkInTime, int checkOutTime) {
                this.checkInTime = checkInTime;
                this.checkOutTime = checkOutTime;
            }
        }

        public class Route {

            String startStation;

            String endStation;

            List<Ride> rides;

            public Route(String startStation, String endStation) {
                this.startStation = startStation;
                this.endStation = endStation;
                this.rides = new ArrayList<>();
            }

            public String getRouteKey() {
                return startStation + "-" + endStation;
            }
        }
    }
}
