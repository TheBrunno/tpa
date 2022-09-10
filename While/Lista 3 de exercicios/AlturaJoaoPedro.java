public class AlturaJoaoPedro {
	public static void main(String[] args) {
		double altPedro=1.45, altJoao=1.34;
		int i=0;
		while(altPedro > altJoao) {
			altPedro+=0.02;
			altJoao+=0.025;
			i++;
		}
		System.out.println("Depois de "+i+" anos, João ficou maior que Pedro");
	}
}
