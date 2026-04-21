FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN javac Fila/Deque/*.java

CMD ["java", "Fila.Deque.TesteDeque"]