FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN javac Fila/*.java

CMD ["java", "Fila.TesteFila"]