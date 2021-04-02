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