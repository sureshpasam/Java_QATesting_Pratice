package Java2024;

public class UnaryOperator {
    public static void main(String[] args){
        int x=10;
        x++;
        ++x;
        x--;
        --x;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
    }

}