package lambda;

public class Main {
    public static void main(String[] args) {
        //implementacje interfejsów
        InterfaceForLambda1 implInterfejsu1 = new Lambda1Exercises1();
        InterfaceForLambda2 implInterfejsu2 = new LambdaExercises2();
        InterfaceForLambda3 implInterfejsu3 = new LambdaExercises3();

        //anonimowe implementacje
        InterfaceForLambda1 anonimowaImplInterfejsu1 = new InterfaceForLambda1() {
            public void go() {
            }
        };
        InterfaceForLambda2 anonimowaImplInterfejsu2 = new InterfaceForLambda2() {
            @Override
            public String go() {
                return "idzie";
            }
        };
        InterfaceForLambda3 anonimowaImplInterfejsu3 = new InterfaceForLambda3() {
            @Override
            public String go(String name) {
                return name + " idzie";
            }
        };
        //lambdy
        InterfaceForLambda1 lambdaImplInterfejsu1 = () -> {
        };
        InterfaceForLambda2 lambdaImplInterfejsu2 = () -> "idzie";
        InterfaceForLambda3 lambdaImplInterfejsu3 = name -> name + " idzie";
    }
}