package lambda;

public class LambdaExercises3 implements InterfaceForLambda3 {
    @Override
    public String go(String name) {
        System.out.println("goes");
        return name + " goes";
    }
}
