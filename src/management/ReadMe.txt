Phase 1 requirements
For phase 1, the management application must support the following commands.

User Management
POST /users - creates a new user, given the following parameters

name - the user's name
email - the user's unique email.
This command returns the user's unique identifier.

GET /users/{uid} - returns the details for the user identified by uid

GET /users - returns the list of users.

Route Management
POST /routes - creates a new route, given the following parameters

startLocation - the route start location name
endLocation - the route end location name.
distance - the route distance in km (e.g. 15.2)
This command returns the route unique identifier.

GET /routes/{rid} - returns the details for the route identified by rid

GET /routes - returns the list of routes.

Sports and Activities Management
POST /sports - creates a new sport, given the following parameters

name - the sport's name.
description - the sport's description.
This command returns the sport's unique identifier.

GET /sports - returns a list with all sports.

GET /sports/{sid} - returns the detailed information for the sport identified by sid.

POST /sports/{sid}/activities - creates a new activity for the sport identified by sid, given the following parameters

uid - user identifier
duration - duration time in the format hh:mm:ss.ffff
date - activity date in the format yyyy-mm-dd
rid - route identifier (optional)
This command returns the physical activity unique identifier.

GET /sports/{sid}/activities - returns all the activities for the sport identified by sid.

GET /sports/{sid}/activities/{aid} - returns the full information for the activity aid.

GET /users/{uid}/activities - returns all the activities made from the user identified by uid.

GET /tops/activities - returns a list with the activities, given the following parameters

sid - sport identifier
orderBy - order by duration time, this parameter only has two possible values - ascending or descending
date - activity date (optional)
rid - route identifier (optional)
Other
EXIT / - terminates the application.