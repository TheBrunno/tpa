/*
 * O Brasil possui atualmente 220 milhões de habitantes, sendo que 53% da população são mulheres e 47% homens. A cada ano nascem aproximadamente 1.7 milhões de novos bebês. Contudo houve uma mudança recente no padrão dos nascimentos,  sendo que a maioria dos nascimentos atuais é composta por meninos (52% são meninos ante 48% de meninas). Ou seja, atualmente nascem cerca de 0,88 milhões de meninos e 0,82 milhões de meninas por ano. Em se mantendo esse padrão, em quantos anos o número de homens irá ultrapassar o número de mulheres no país?
 *
*/

public class Prova {
	public static void main(String[] args) {
		double popBrasil = 220, nBebes = 1.7;
		double nMulheres = popBrasil * 0.53;
		double nHomens = popBrasil * 0.47;
		double nBH = nBebes * 0.52;
		double nBM = nBebes * 0.48;
		int i = 0;
		while(nHomens <= nMulheres) {
			nMulheres += nBM;
			nHomens += nBH;
			i++;
		}
		System.out.println(i);
	}
}
