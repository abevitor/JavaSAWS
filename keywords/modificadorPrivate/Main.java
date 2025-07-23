package keywords.modificadorPrivate;

import static keywords.modificadorPrivate.Client.getStaticName;
import static keywords.modificadorPrivate.Client.setStaticName;

public class Main {
    public static void main(String[] args) {
        setStaticName("teste");
        System.out.println(getStaticName());
    }
}

