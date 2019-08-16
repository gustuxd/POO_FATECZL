package aula1.memoria;

import java.util.ArrayList;
import java.util.List;

public class EstourarHeap {
	
//	public static void main(String[] args) {
//
//		List<EstourarHeap> list = new ArrayList<EstourarHeap>();
//		list.add(new EstourarHeap());
//		
//		while(true) {
//			list.addAll(list);
//			System.out.println(list.size());
//		}
//		
//	}
	
//	public static void main(String[] args) {
//		String a = "a";
//		while(true)
//			a = a + a;
//	}
	
//	public static void main(String[] args) {
//		int[][] vetor = new int[5000][];
//		for(int i = 0; i < vetor.length; i++) {
//			vetor[i] = new int[vetor.length * vetor.length];
//		}
//	}
	
	public static void main(String[] args) {
		EstourarHeap eh = new EstourarHeap();
		Node cabeca = eh.new Node();
		Node n = cabeca;
		while(n.prox == null) {
			n.prox = eh.new Node();
			n = n.prox;
		}
	}
	
	class Node {
		
		int[] vetor = new int[10000];
		
		Node prox;
		
	}
	
}
