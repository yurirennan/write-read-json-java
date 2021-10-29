package criacao;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonObject {

    private static void JSONExampleObject1() {

        //Criamos o json passando a string no construtor
        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
        JSONObject example = new JSONObject(string);
        System.out.println("Final JSONObject: " + example);

    }

    private static void JSONExampleObject2() {

        //Podemnos também inicializa-lo vazio e inserir os valores depois
        JSONObject example = new JSONObject();

        //Aqui inserirmos os valores com o metodo .put() passando a chave e o valor no formato de STRING
        example.put("key", "value");

        //Primeiro é a CHAVE e depois o VALOR.
        example.put("key2", 5);
        example.put("key3", -23.45e67);
        example.put("trueValue", true);

        //Não podemos adicionar valores nulos, isso não é possível
        //example.put("nullValue", null);

        System.out.println("Final JSONOBject: " + example);
    }


    private static void JSONExampleObject3() {

        //Podemos também criar um objeto json a partir de um MAP no java
        //Desde as chaves sejam no formato STRING os valores pode ser qualquer outra coisa
        Map<String,Double> map = new HashMap<>();

        map.put("key1", 1.0);
        map.put("key2", -23.45e67);
        map.put("key3", 1.0);

        //Então passamos o MAP no construtor
        JSONObject example = new JSONObject(map);
        System.out.println("Final JSONOBject: " + example);
    }


    public static void main(String[] args) {
        JSONExampleObject1();
        JSONExampleObject2();
        JSONExampleObject3();
    }
}
