import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {

    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<String>();
        ArrayList<String> descricao = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. Adicionar tarefa\n");
            System.out.println("2. Listar tarefas\n");
            System.out.println("3. Remover tarefa\n");
            System.out.println("4. Sair\n");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Nome da tarefa: ");
                    String nomeTarefa = scanner.nextLine();
                    System.out.println("Descricao da tarefa: ");
                    String descricaoTarefa = scanner.nextLine();
                    nome.add(nomeTarefa);
                    descricao.add(descricaoTarefa);
                    System.out.println("Tarefa concluida com sucesso!!!");
                    break;

                case 2:
                    System.out.println("Listagem de tarefas: ");
                    for(int i = 0; i < nome.size(); i++){
                        System.out.println(nome.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Numero da tarefa a remover: ");
                    int numeroTarefa =  scanner.nextInt();
                    if(numeroTarefa > 0 && numeroTarefa <= nome.size()){
                        nome.remove(numeroTarefa -1);
                        descricao.remove(numeroTarefa -1);
                        System.out.println("Tarefa " + numeroTarefa + " removida com sucesso");

                    }
                    else {
                        System.out.println("Numero da tarefa invalido ");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;

            }

        }

    }
}

