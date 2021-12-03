/*
 *  Print ***
 */


package recursion;


class PatternRecursive {
    public static void print_star(int row, int col) {
        if(row == 0)
            return;
        if(row > col) {
            System.out.print("*");
            print_star(row,col+1);
        }
        else{
            System.out.println("");
            print_star(row-1,0);
        }
    }

    public static void print_reverse_star(int row, int col) {
        if(row == 0)
            return;
        if(row > col) {
            print_reverse_star(row,col+1);
            System.out.print("*");
        }
        else{
            print_reverse_star(row-1,0);
            System.out.println("");
        }
    }
}