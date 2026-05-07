FROM eclipse-temurin:17
WORKDIR /app
COPY . .
RUN javac Implementação/Sequencia/SequenciaVazia.java \
          Implementação/Sequencia/SequenciaDupla.java \
          Implementação/Sequencia/No.java \
          Implementação/Sequencia/Sequencia.java \
          Implementação/Sequencia/TestesSequencia.java
CMD ["java", "Implementação.Sequencia.TestesSequencia"]