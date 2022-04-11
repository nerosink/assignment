# Enterprise health lookup 

 generate and save random health state  each time health check is triggered to simulate the real enterprise
 
 
 healthcheck url is http://<server URL>:8080/healthcheck?eid=EID
 eg.  http://localhost:8080/healthcheck?eid=104
  
  
 send POST to create for enterprise  \
 send DELETE to delete for enterprise \
 send PUT to update for enterpise 
  
 open enterprise_openapi.json in https://editor.swagger.io/ to generate commands
 
 activity diagram in diagram.PNG
 
 azure VM ip : http://20.117.148.31:8080/enterprise 
 credentials sent seperately

  to run locally can use below ( Required  Java and Maven )
 
 ``` mvn clean spring-boot:run ```
