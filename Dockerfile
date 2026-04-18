FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN javac Fila/Clinica/*.java

CMD ["java", "Fila.Clinica.TesteFilaClinica"]