import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && stack.peek() > 0 && a < 0) {
                int top = stack.peek();
                if (Math.abs(top) < Math.abs(a)) {
                    stack.pop();
                    continue;
                } else if (Math.abs(top) == Math.abs(a)) {
                    stack.pop();
                }
                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack.push(a);
            }
        }
        Integer[] res=stack.toArray(new Integer[0]);
        int[] resArr=new int[res.length];
        for(int i=0;i<res.length;i++){
            resArr[i]=res[i];
        }
        return resArr;
    }
}
