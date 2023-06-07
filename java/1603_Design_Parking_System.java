import java.util.ArrayList;
import java.util.List;

/**
 * Design_Parking_System.
 *
 * @author Vladislav Sidlyarevich
 * @since 06.06.2023
 */
class Design_Parking_System {

    class ParkingSystem {

        private int smallPLaces;
        private int mediumPLaces;
        private int bigPLaces;

        public ParkingSystem(int big, int medium, int small) {
            this.smallPLaces = small;
            this.mediumPLaces = medium;
            this.bigPLaces = big;
        }

        public boolean addCar(int carType) {
            if (carType == 1) {
                return bigPLaces-- > 0;
            } else if (carType == 2) {
                return mediumPLaces-- > 0;
            }

            return smallPLaces-- > 0;
        }
    }
}
