import java.util.Scanner;

public class mapa {
	public static int ponto1 = 1;
	public static int ponto3 = 3;
	public static int totalPontosRodadaP1 = 0;
	public static int totalPontosPartidaP1 = 0;
	public static int totalPontosRodadaP2 = 0;
	public static int totalPontosPartidaP2 = 0;

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		String p1;
		String p2;
		Scanner input = new Scanner(System.in);

		System.out.println("Digite seu nome player 1: ");
		p1 = input.next();

		System.out.println("Digite seu nome player 2:");
		p2 = input.next();

		System.out.println("comecando a partida: ");
		System.out.println("aperte 1 para ganhar 1 ponto!: ");
		System.out.println("aperte 2 para ganhar 3 ponto!: ");
		System.out.println("aperte 3 para perde 1 ponto!: ");
		System.out.println("aperte 4 para resetar a rodada!: ");
		System.out.println("aperte 5 para resetar a partida!: ");

		Scanner entrada = new Scanner(System.in);
		int ControleDeFluxo = 0;
		while (ControleDeFluxo == 0) {

			int controle = entrada.nextInt();

			switch (controle) {

			case 1:// 1 ponto
				System.out.println("para dar 1 ponto");
				System.out.println("digite 1 para: " + p1);
				System.out.println("digite 2 para:" + p2);
				int Ponto1 = entrada.nextInt();
				switch (ponto1) {

				case 1:
					System.out.println("player:" + p1 + ", ganhou 1 ponto");
					totalPontosRodadaP1 = totalPontosRodadaP1 + 1;
					break;

				case 2:
					System.out.println("player:" + p2 + ", ganhou 1 ponto");
					totalPontosRodadaP2 = totalPontosRodadaP2 + 1;
					System.out.println("total de pontos do player 2 " + totalPontosRodadaP2);
					break;
				}

				break;

			case 2: // 3 pontos
				System.out.println("para dar 3 ponto");
				System.out.println("digite 1 para: " + p1);
				System.out.println("digite 2 para:" + p2);
				int Ponto2 = entrada.nextInt();
				switch (Ponto2) {

				case 1:
					System.out.println("player:" + p1 + ", ganhou 3 ponto");
					totalPontosRodadaP1 = totalPontosRodadaP1 + 3;
					break;

				case 2:
					System.out.println("player:" + p2 + ", ganhou 3 ponto");
					totalPontosRodadaP2 = totalPontosRodadaP2 + 3;
					break;
				}

				break;

			case 3: // - 1ponto
				System.out.println("para tirar 1 ponto");
				System.out.println("digite 1 para: " + p1);
				System.out.println("digite 2 para:" + p2);
				int PontoNegativo = entrada.nextInt();
				switch (PontoNegativo) {

				case 1:
					System.out.println("player:" + p1 + ", perdeu 1 ponto");
					totalPontosRodadaP1 = totalPontosRodadaP1 - 1;
					break;

				case 2:
					System.out.println("player:" + p2 + ", perdeu 1 ponto");
					totalPontosRodadaP2 = totalPontosRodadaP2 - 1;
					break;
				}
				break;

			case 4:// reset rodada
				System.out.println("rodada resetada");
				totalPontosPartidaP1 = 0;
				totalPontosPartidaP2 = 0;
				break;

			case 5:// reset partida
				System.out.println("partida resetada");
				totalPontosPartidaP1 = 0;
				totalPontosPartidaP2 = 0;
				totalPontosRodadaP1 = 0;
				totalPontosRodadaP2 = 0;

			default:
				System.out.println("Número inválido");
				break;
			}
			System.out.println("comecando a partida: ");
			System.out.println("aperte 1 para ganhar 1 ponto: ");
			System.out.println("aperte 2 para ganhar 3 ponto: ");
			System.out.println("aperte 3 para perde 1 ponto: ");
			System.out.println("aperte 4 para resetar a rodada: ");
			System.out.println("aperte 5 para resetar a partida: ");
			if (ControleDeFluxo != 0) {

			}
			if (totalPontosPartidaP1 == 3) {
				System.out.println("o ganhador foi: " + p1);
				System.out.println("total pontos do " + p1 + ":" + totalPontosRodadaP1 + ":->" + totalPontosPartidaP1);
				System.out.println("total pontos do " + p2 + ":" + totalPontosRodadaP2 + ":->" + totalPontosPartidaP2);

			}
			if (totalPontosPartidaP1 == 3) {
				System.out.println("o ganhador foi: " + p2);
				System.out.println("total pontos do " + p1 + ":" + totalPontosRodadaP1 + ":->" + totalPontosPartidaP1);
				System.out.println("total pontos do " + p2 + ":" + totalPontosRodadaP2 + ":->" + totalPontosPartidaP2);

			}

		}
	}
}
