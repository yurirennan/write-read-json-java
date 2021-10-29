package criacao;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.JSONWriter;

public class JsonWriter {
    private static void JSONExamplWriter() {

        //Esse método é bem similare ao JSONStringer
        //A diferença é que precisamos de um objeto Java chamado "Appendable" do tipo StringBuilder
        StringBuilder write = new StringBuilder();
        JSONWriter jsonWriter = new JSONWriter(write);

        //Aqui iniciamos o processo para adicionar os valores

        jsonWriter.object();

        jsonWriter.key("trueValue").value(true);
        jsonWriter.key("falseValue").value(false);
        jsonWriter.key("nullValue").value(null);
        jsonWriter.key("stringValue").value("hello world!");
        jsonWriter.key("complexStringValue").value("h\be\tllo w\u1234orld!");
        jsonWriter.key("intValue").value(42);
        jsonWriter.key("doubleValue").value(-23.45e67);

        //E encerramos o processo
        jsonWriter.endObject();

        //O resultado vai estar no objeto "write" do tipo StringBuilder
        System.out.println("JSON: " + write.toString());

        //E não precisamos converter para jsonObject
    }

    private static void JSONExampleTokener() {

        //A partir de una String podemos crear un JSONTokener, que lo podemos usar alternativamente para JSONArray,JSONObject

        String string = "this is not a valid JSON string";
        JSONTokener token = new JSONTokener(string);

        //Now you can use the token in JSONObject and Array the same way as a String

        JSONObject object = new JSONObject(token);
        JSONArray array = new JSONArray(token);

    }

    public static void main(String[] args) {
        JSONExamplWriter();

        //Da pau
        //JSONExampleTokener();

    }

}
