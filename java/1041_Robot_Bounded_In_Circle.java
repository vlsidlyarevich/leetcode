/**
 * Robot_Bounded_In_Circle.
 *
 * @author Vladislav Sidlyarevich
 * @since 30.07.2023
 */
class Robot_Bounded_In_Circle {

    public enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public boolean isRobotBounded(String instructions) {

        var direction = Direction.NORTH;
        int yCoordinate = 0;
        int xCoordinate = 0;

        for (char c : instructions.toCharArray()) {
            switch (c) {
                case 'G' -> {
                    switch (direction) {
                        case NORTH -> yCoordinate++;
                        case EAST -> xCoordinate++;
                        case SOUTH -> yCoordinate--;
                        case WEST -> xCoordinate--;
                    }
                }
                case 'L' -> direction = turnLeft(direction);
                case 'R' -> direction = turnRight(direction);
            }
        }

        return (xCoordinate == 0 && yCoordinate == 0) || direction != Direction.NORTH;
    }

    public Direction turnLeft(Direction current) {
        return switch (current) {
            case NORTH -> Direction.WEST;
            case SOUTH -> Direction.EAST;
            case EAST -> Direction.NORTH;
            case WEST -> Direction.SOUTH;
        };
    }

    public Direction turnRight(Direction current) {
        return switch (current) {
            case NORTH -> Direction.EAST;
            case SOUTH -> Direction.WEST;
            case EAST -> Direction.SOUTH;
            case WEST -> Direction.NORTH;
        };
    }
}
