POST /routes - creates a new route, given the following parameters

startLocation - the route start location name
endLocation - the route end location name.
distance - the route distance in km (e.g. 15.2)
This command returns the route unique identifier.

GET /routes/{rid} - returns the details for the route identified by rid

GET /routes - returns the list of routes.