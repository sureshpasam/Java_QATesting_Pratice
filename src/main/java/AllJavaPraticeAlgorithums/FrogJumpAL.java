package AllJavaPraticeAlgorithums;

public class FrogJumpAL {
    /*A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to reach its target.

Write a function:

class Solution { public int solution(int X, int Y, int D); }

that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:

  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100
Write an efficient algorithm for the following assumptions:

X, Y and D are integers within the range [1..1,000,000,000];
X ≤ Y.

    Complexity:
    expected worst-case time complexity is O(1);
    expected worst-case space complexity is O(1).
    This is the solution I gave which fetched me 50% and time complexity of O(Y-X). Can anyone please suggest a better solution?

  */
        //X=start, Y=end, D=distance for code clarity
        public int solution(int start, int end, int distance) {

// write your code in Java SE 8
            int progress = start;
            int count=0;
            while(progress<end) {
                progress=progress+distance;
                count++;
            }
            return count;
        }

        public static void main(String[] args){
            FrogJumpAL f = new FrogJumpAL();
            int X=10,Y=100,D=58;
            System.out.println("Frog jumpping::"+f.solution(X,Y,D));
        }
}
