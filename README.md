# sample-springboot-katharsis
sample springboot app uses spring data cassandra and katharsis


Config steps:
1. Create directory - /etc/app/api. 
2. Copy files under conf to /etc/app/api/.
	i.e application.propeties and logback-spring.xml
3. sudo mkdir /var/log/app
4. sudo chmod 777 /var/log/app

To run as jar:
java -jar app-api/target/app-api-1.0-SNAPSHOT.jar
