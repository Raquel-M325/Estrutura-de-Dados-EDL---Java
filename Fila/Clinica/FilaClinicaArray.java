package Fila.Clinica;
import java.util.Vector;

public class FilaClinicaArray implements FilaClinica{
    private Vector <String> lista_nomes = new Vector<>();

    public void enqueue(String nome){
        lista_nomes.add(nome);
    }

    public String dequeue() throws FilaClinicaVazia{
        if (isEmpty()){
            throw new FilaClinicaVazia("Não tem nenhum paciente na fila");
        }

        return lista_nomes.remove(0);
    }

    public boolean isEmpty(){
        return lista_nomes.isEmpty(); //se há pacientes
    }

    public int size(){
        return lista_nomes.size(); //quantidade total de pacientes
    }
}
