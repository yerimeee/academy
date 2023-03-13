package collection.treeSet03;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> score = new TreeSet<Integer>();
		score.add(Integer.valueOf(89));
		score.add(100);
		score.add(45);
		score.add(91);
		score.add(75);
		
		System.out.println("가장 낮은 점수: " + score.first());
		System.out.println("가장 높은 점수: " + score.last());
		
		System.out.println("97점보다 하나 낮은 점수: " + score.lower(91));
		System.out.println("97점보다 하나 높은 점수: " + score.higher(91));
		
		System.out.println("90점과 같거나 하나 낮은 점수: " + score.floor(90));
		System.out.println("90점과 같거나 하나 높은 점수: " + score.ceiling(90));
	}
}
