package keywords.modificadorPrivate;
/*Private
 * -nada de fora consegue acessar
 * -classes não podem ser herdadas
 */

public final class Client {

    private static String staticName;

    public static String getStaticName(){
        return staticName;
    }

    public static void setStaticName( final String param){
        staticName = param;
    }
}

