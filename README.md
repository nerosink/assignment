# Enterprise health lookup 

 generate and save random health state  each time health check is triggered to simulate the real enterprise
 
 
 healthcheck url is http://<server URL>:8080/healthcheck?eid=EID
 eg.  http://localhost:8080/healthcheck?eid=104
  
  
 # Create enterprise 
 
 
 POST \enterprise with JSON Body
 
 ```
  {
  "name": "ullamco sunt cupidatat laboris",
  "url": "officia ullamco",
  "authentication": "occaecat officia ex",
  "health": true
}
 ```
 
 
 
 
 # Delete enterprise
 
 DELETE \enterprise\{eid}
 
 # Update Enterprise
 
 PUT \enterprise with JSON body
 
 ```
 {
  "eid": 104,
  "name": "ullamco sunt cupidatat laboris",
  "url": "officia ullamco",
  "authentication": "occaecat officia ex",
  "health": true
}
 ```
 
 
  
 open enterprise_openapi.json in https://editor.swagger.io/ to generate commands
 
 activity diagram in diagram.PNG
 
 azure VM ip : http://20.117.148.31:8080/enterprise 
 credentials sent seperately

 to run unit test 
 
 ```
 mvn clean test
 ```
 
 
  to run locally can use below ( Required  Java and Maven )
 
 ``` 
 mvn clean spring-boot:run 
 ```
