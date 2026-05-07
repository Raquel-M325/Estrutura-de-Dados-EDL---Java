FROM eclipse-temurin:17
WORKDIR /app
COPY . .
RUN javac Implementação/Lista/Duplamente/ListaVazia.java \
          Implementação/Lista/Duplamente/ListaDuplamenteEncadeada.java \
          Implementação/Lista/Duplamente/No.java \
          Implementação/Lista/Duplamente/Lista.java \
          Implementação/Lista/Duplamente/TestesLista.java
CMD ["java", "Implementação.Lista.Duplamente.TestesLista"]