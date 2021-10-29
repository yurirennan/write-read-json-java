package criacao;

import org.json.JSONObject;
import org.json.JSONStringer;

public class JsonStringer {

    private static void JSONExampleStringer() {

        //Inicializamos o criacao.JsonStringer
        JSONStringer jsonStringer = new JSONStringer();

        //E damos inicio ao processo para inserir valores no objecto
        jsonStringer.object();

        //Nos podemos adicionar elementos passando direto as chaves e os valores
        //com os metodos .key() e .values()
        jsonStringer.key("trueValue").value(true);
        jsonStringer.key("falseValue").value(false);
        jsonStringer.key("nullValue").value(null);
        jsonStringer.key("stringValue").value("hello world!");
        jsonStringer.key("complexStringValue").value("h\be\tllo w\u1234orld!");
        jsonStringer.key("intValue").value(42);
        jsonStringer.key("doubleValue").value(-23.45e67);

        //Agora fechamos o processo
        jsonStringer.endObject();

        //Uma vez que temos o jsonStringer podemos converter para json
        // utilizando o construtor do criacao.JsonObject, passando o jsonStringer como STRING
        String str = jsonStringer.toString();
        JSONObject jsonObject = new JSONObject(str);

        System.out.println("Final JSONOBject: " + jsonObject);
    }


    public static void main(String[] args) {
        JSONExampleStringer();
    }
}
