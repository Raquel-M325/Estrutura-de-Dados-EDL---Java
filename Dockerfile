FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

# Compila todos os arquivos de Pilha
RUN javac Fila/Lista/Fila_Lista/*.java

# Executa o teste
CMD ["java", "Fila.Lista.Fila_Lista.TesteFilaLista"]