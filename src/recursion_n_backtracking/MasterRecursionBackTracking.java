package recursion_n_backtracking;

public class MasterRecursionBackTracking {

	public static void main(String args[]) {
		System.out.println("Start execution of the Recursion & BackTracking programs");
		System.out.println(PowerN.isPower2(5));
		System.out.println(PowerN.isPower2(4));
		System.out.println(PowerN.isPower2(8));
		System.out.println(PowerN.isPower3(8));
		System.out.println(PowerN.isPower4(8));
		System.out.println(PowerN.isPower3(9));
		System.out.println(PowerN.isPower4(4));
		System.out.println("Start execution of the Subsets Problems ");
		int x[] = {1,2,3};
		Subsets.printSubsets(x);
		int x1[] = {1,2,2};
		Subsets.printSubsets(x1);
		System.out.println("Subsets with DFS Approach");
		SubsetsApproachII.printSubsets(x);
		SubsetsApproachII.printSubsets(x1);
		System.out.println("Unique Subsets with Duplicate Numbers");
		SubsetsII.printsubsetsWithDup(x);
		SubsetsII.printsubsetsWithDup(x1);
		System.out.println("Start execution of the Permuatation Problems ");
		Permuatations.permute(x);
		System.out.println("Permutations with Duplicate Numbers");
		PermuatationsDuplicate.permuteDuplicate(x1);
		System.out.println("Unique Permutations with Duplicate Numbers");
		PermuatationsII.permuteUnique(x1);
		System.out.println("Combinations Problems");
		System.out.println(CombinationSum.combinationSum(x,4));
		System.out.println("Unique Combination with number used only once");
		System.out.println(CombinationSumII.combinationSum2(x,4));
		System.out.println(CombinationSumIII.combinationSum3(3,7));
		System.out.println(CombinationSumIII.combinationSum3(3,9));
		System.out.println(Combinations.combine(4,2));
		System.out.println(LetterCombinations.letterCombinations("23"));
		System.out.println(GenerateParentheses.generateParenthesis(1));
		System.out.println(GenerateParentheses.generateParenthesis(3));
		System.out.println("Maze Related Problems");
		int m[][] = { { 1, 0, 0, 0, 0 },
				{ 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1 },
				{ 0, 0, 0, 0, 1 },
				{ 0, 0, 0, 0, 1 } };
		System.out.println(Maze.findPath(m));
		int maze[][] = { { 1, 0, 0, 0 },
				{ 1, 1, 1, 1 },
				{ 1, 1, 1, 0 },
				{ 1, 0, 1, 1 } };
		MazeII.solveMaze(maze);

	}
}