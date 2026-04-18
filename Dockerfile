FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN javac Fila/Lista/Pilha_Lista/*.java Fila/Lista/Fila_Lista/*.java Fila/Lista/InversoTeste.java

CMD ["java", "Fila.Lista.InversoTeste"]