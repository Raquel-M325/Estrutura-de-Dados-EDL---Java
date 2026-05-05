FROM eclipse-temurin:17
WORKDIR /app
COPY . .
RUN javac Implementação/Lista/Array/ListaVazia.java \
          Implementação/Lista/Array/ListaArray.java \
          Implementação/Lista/Array/TestesLista.java
CMD ["java", "Implementação.Lista.Array.TestesLista"]