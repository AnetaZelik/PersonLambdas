package lambda;

import java.util.List;
import java.util.stream.Collectors;

import static lambda.Person.nameFromB;

public class Main {
    public static void main(String[] args) {
        //interfaces' implementations
        InterfaceForLambda1 impl1 = new LambdaExercises1();
        InterfaceForLambda2 impl2 = new LambdaExercises2();
        InterfaceForLambda3 impl3 = new LambdaExercises3();

        //anonymous implementations
        InterfaceForLambda1 anonymImpl1 = new InterfaceForLambda1() {
            @Override
            public void go() {
            }
        };
        InterfaceForLambda2 anonymImpl2 = new InterfaceForLambda2() {
            @Override
            public String go() {
                return "goes";
            }
        };
        InterfaceForLambda3 anonymImpl3 = new InterfaceForLambda3() {
            @Override
            public String go(String name) {
                return name + " goes";
            }
        };

        //lambdas
        InterfaceForLambda1 lambdaImpl1 = () -> {
        };
        InterfaceForLambda2 lambdaImpl2 = () -> "goes";
        InterfaceForLambda3 lambdaImpl3 = name -> name + " goes";

        List<Person> people = List.of(
                new Person("Bill"),
                new Person("John"),
                new Person("Jack"),
                new Person("Mary"));
        var collect = people
                .stream()
                .filter(nameFromB)
                .collect(Collectors.toList());
    }
}