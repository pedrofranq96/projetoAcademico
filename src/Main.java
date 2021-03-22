import model.Aluno;

import java.util.Scanner;

public class Main {

    public static Aluno aluno = new Aluno();

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner menu = new Scanner(System.in);

        boolean continuar = true;
        while(continuar){
            System.out.println();
            System.out.println("############## CONTROLE ACADÊMICO ###############");
            System.out.println();
            System.out.println("|------------Digite a opção desejada------------|");
            System.out.println("| Opção 1-  Registrar as notas de um novo aluno.|");
            System.out.println("| Opção 2 - Consultar boletim de um aluno.      |");
            System.out.println("| Opção 3 - Consultar notas da turma.           |");
            System.out.println("| Opção 4 - Sair.                               |");
            System.out.println("|-----------------------------------------------|");
            int opcao = menu.nextInt();
            switch (opcao){
                case 1:
                    cadastro();
                    break;
                case 2:
                    consultaBoletim();
                    break;
                case 3:
                    consultaNotas();
                    break;
                case 4:
                    System.out.print("\nPrograma encerrado");
                    continuar = false;
                    break;
                default:
                    System.out.print("\nOpção inválida");
                    menu();
            }
        }
    }

    public static void cadastro() {
        Scanner cadastro = new Scanner(System.in);

        System.out.println("Cadastro");

        System.out.println("Digite o nome do Aluno: ");
        String nomeAluno = cadastro.nextLine();

        System.out.println("Digite a nota da AV1: ");
        float av1 = Float.parseFloat(cadastro.nextLine());

        System.out.println("Digite a nota da AV2: ");
        float av2 = Float.parseFloat(cadastro.nextLine());

        Aluno novoAluno = new Aluno(nomeAluno, av1, av2);

        aluno.setAlunos(novoAluno);

        System.out.println("Aluno cadastrado");
    }

    public static void consultaBoletim(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        String nome = teclado.next();

        for(var item : aluno.getAlunos()){
            if(item.getNome().equals(nome)){
                System.out.println("Nome do Aluno: "+ item.getNome());
                System.out.println("Nota da Av1: "+ item.getAV1());
                System.out.println("Nota da Av2: "+ item.getAV2());
                float media = ((item.getAV1() + item.getAV2()) / 2);
                System.out.println("Média final: "+ media );
                if(media <=4){
                    System.out.println("Situação: Reprovado");
                }
                else if(media >4 && media <7){
                    System.out.println("Situação: Prova final.");
                }
                else if(media >=7){
                    System.out.println("Situação: Aprovado.");
                }

                break;
            }
        }
    }

    public static void consultaNotas(){
        for(var item : aluno.getAlunos()){
            System.out.println("Nome: " + item.getNome());
            System.out.println("Nota da Av1: " + item.getAV1());
            System.out.println("Nota da Av2: "+ item.getAV2());
            float media = ((item.getAV1() + item.getAV2()) / 2);
            System.out.println("Média final: "+ media );
            if(media <=4){
                System.out.println("Situação: Reprovado");
            }
            else if(media >4 && media <7){
                System.out.println("Situação: Prova final.");
            }
            else if(media >=7){
                System.out.println("Situação: Aprovado.");
            }

        }
    }
}
