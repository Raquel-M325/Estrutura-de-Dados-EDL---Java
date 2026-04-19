FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN javac Fila/Deque/DequeVector/*.java

CMD ["java", "Fila.Deque.DequeVector.TesteDequeVector"]