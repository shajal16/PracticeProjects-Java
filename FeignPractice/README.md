Once the server starts it will open in your localhost and port 8081.

For test use this URL to call the api -
best way to call it is using post man. Currently you can not change any data or any thing as
Using just the get method. 

127.0.0.1:8081/api/v1/posts?tags=tech
----------------------------------------------------------------------

**Try changing the tags-> tech/history/health .. etc**

For now it only fetches data from an external API using tags. 

Future plan - 
------------------------------------------------------------------------
One might notice some pagination parameters as fales in the controller. 

meanwhile I am learning to pagination and will implement the update once I achieve the goal.

Another feature will be to search using multiple tags. 
