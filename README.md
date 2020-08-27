# spring-cloud-eureka-zuul

Service Discovery With Eureka and Zuul
# Zuul
  As an edge service, Zuul provides a lot of different functions. The main pieces are the dynamic proxy and security.
  Zuul will serve as our API gateway.
  
  # Load Balancing with Zuul
  When Zuul receives a request, it picks up one of the physical locations available and forwards requests to the actual service instance. The whole process of caching the location of  the service instances and forwarding the request to the actual location is provided out of the box with no additional configurations needed.
  
  
  ![alt text](http://www.mediafire.com/convkey/c61e/1e9ypbkz2hn5rhx9g.jpg?size_id=4)
  	
  
# Eureka
  Eureka has a server and client component. A service registry with Eureka Server and a Discovery client with Eureka Client. We will set up a simple Eureka Server and a client                  to register with this server to be available through our gateway.
  
# Eureka Server
 Add the Eureka Server dependency to the Spring Boot pom.

	  <dependency>
	   <groupId>org.springframework.cloud</groupId>
	   <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
	 </dependency>

# Eureka Client
Add the Eureka Client dependency to the Spring Boot pom.

	<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
	</dependency>
  
  	
# Final Thoughts
  You can containerize these services in Docker to make it even easier to deploy to individual containers.
  Service discovery allows us to deploy these applications and auto-configure routing to these services without the need to bring down and reconfigure our gateway-while also providing    security to all the underlying services.
