# MazeSolver
The findPath method takes the starting and ending locations on a map and returns a path that
navigates the map from start to end. This path must not contain any impassable tiles (Wall tiles)
and must be as short as possible.
For a path to be valid, each pair of consecutive tiles in the path must be adjacent to each other
on the map and none of the tiles can be impassable. Up, down, left, and right movements are
allowed and the 4 tiles connected to a tile in these directions are considered adjacent.

The getVelocity method takes a path and location and determines the velocity/direction that
should be traveled to move along the path.
To complete this method you should implement the following:
1. Determine where you currently are on the path
a. Based on the provided location, determine the tile for this location. To find the tile
coordinates of a vector you can take the floor of the x/y components
b. You can assume the current location is on the provided path. When writing tests,
ensure that this is always true (This also implies that the path is not empty)
2. Return the velocity that moves from the current location to the center of the next tile on
the path. To get a vector at the center of a tile, add 0.5 to the x/y coordinates of the tile.
You can subtract the x/y of the current location from the x/y of the center of the next tile in
the path to get a vector pointing in the right direction
3. The magnitude of the returned velocity must be 5.0. You can use the provided normal2d
method to get a vector with magnitude 1.0, then multiply both x and y by 5.0
4. If the current location is on the last tile of the path, the velocity should move towards the
center of that tile
5. If the current location is on the last tile of the path and is within 0.1 from the center of the
tile, return (0.0, 0.0) for the velocity. You can use the provided distance2d method to
compute the distance between two points
