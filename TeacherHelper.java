import java.util.Random;
import java.util.Scanner;
 
class TeacherHelper {

    public static final double horaAula = 17.50;
    
    public static void main(String[] args) {
    	int opcao=0, numeroAulas, qtdeAlunos, i;
		double salarioBase, horaAtividade, descansoSemanalRemunerado, salario, notaAluno, mediaAlunos;
		double horaAula;
		Random gerador = new Random();
		
		Scanner leitor = new Scanner(System.in);
		
		while(opcao!=4) {
			System.out.println("FERRAMENTA DE AUXiLIO AO PROFESSOR!");
			System.out.println("Selecione a opcaoo desejada:");
			System.out.println("1 - Calcular sal�rio");
			System.out.println("2 - Calcular m�dia de notas dos alunos");
			System.out.println("3 - Exibir a motiva��o do dia!");
			opcao = leitor.nextInt();
			
			switch (opcao) {
			case 1:
		
				System.out.println("Para calcular seu salario base precisamos saber quantas aulas semanais o professor tem na institui��o");
				numeroAulas = leitor.nextInt();
				System.out.println("valor hora aula");
				horaAula = leitor.nextDouble();
				salarioBase = numeroAulas * 4.5 * horaAula;
				horaAtividade = salarioBase * 0.05;
				descansoSemanalRemunerado = (salarioBase + horaAtividade) / 6;
				salario = salarioBase + horaAtividade + descansoSemanalRemunerado;
				
				System.out.println("O salario do professor esta composto da seguinte forma:");
				System.out.println("Sal�rio base R$" + salarioBase);
				System.out.println("Hora-atividade R$" + horaAtividade);
				System.out.println("DSR R$" + descansoSemanalRemunerado);
				System.out.println("Sal�rio total R$" + salario);
				
				break;
			case 2:
				System.out.println("Para calcularmos a media das notas dos alunos preciso saber, primeiramente, quantos alunos estao na turma:");
				qtdeAlunos = leitor.nextInt();
				i = 0;
				mediaAlunos=0;
				while (i<qtdeAlunos) {
					System.out.println("Digite a nota do " + (i+1) + "e aluno:");
					notaAluno = leitor.nextDouble();
					mediaAlunos = mediaAlunos + notaAluno;
				}
				mediaAlunos = mediaAlunos / qtdeAlunos;
				System.out.println("A m�dia de notas dos alunos dessa turma � " + mediaAlunos);
				
				break;
			case 3:
				
				switch(gerador.nextInt(7)) {
				case 1:
					System.out.println("Voc� � um professor incr�vel!");
					break;
				case 2:
					System.out.println("Que o seu dia seja produtivo!");
					break;
				case 3:
					System.out.println("Que os seus alunos notem a paix�o com que voc� ensina!");
					break;
				case 4:
					System.out.println("Seu trabalho ajuda a fazer do mundo um lugar melhor!");
					break;
				case 5:
					System.out.println("Quem ensina com o cora��o cria um tesouro para a vida toda!");
					break;
				case 6:
					System.out.println("Obrigado por se colocar � disposi��o do saber!");
					break;
					
				}
				
				break;
			case 4:
				System.out.println("Encerrando o sistema...");
				break;
				
			}
		}
	
		leitor.close();
    }
   }
