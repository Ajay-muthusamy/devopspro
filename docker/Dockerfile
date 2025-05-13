# -------- Build Stage --------
FROM maven:3.9.9-eclipse-temurin-21-jammy AS build

# Clone repo and build
RUN git clone https://github.com/Ajay-muthusamy/devopspro.git
WORKDIR /devopspro
RUN mvn clean install -DskipTests

# -------- Run Stage --------
FROM tomcat:10-jdk21

# Clean default apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR file from build stage to Tomcat
COPY --from=build /devopspro/target/display-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]
