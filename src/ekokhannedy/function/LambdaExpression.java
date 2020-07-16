package ekokhannedy.function;





@FunctionalInterface
interface LambdaInterface{
    void lambdaInVariable(String string1, String string2);
}

public class LambdaExpression {
    public static void main(String[] args) {
        LambdaInterface lambdaInterface =
                (String string1, String string2) ->
                        System.out.println(string1 + " " + string2);

        lambdaInterface.lambdaInVariable("Java1", "Java2");
    }
}
