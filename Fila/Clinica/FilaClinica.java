package Fila.Clinica;

public interface FilaClinica {
    public void enqueue(String nome);
    public String dequeue() throws FilaClinicaVazia;
    public int size();
    public boolean isEmpty();

    //Object só funciona em números, então deve trocar para String
}
