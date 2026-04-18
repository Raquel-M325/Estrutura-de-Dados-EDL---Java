FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN javac Fila/Lista/Vector/*.java

CMD ["java", "Fila.Lista.Vector.TesteFilaVector"]