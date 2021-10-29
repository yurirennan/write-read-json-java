package conversao;

import org.json.HTTP;
import org.json.JSONObject;

public class HttpConversion {
    // JSON to HTTP
    private static void HTTPToExampleConversion() {

        //Criamos um JSONObject
        //O JSONObject precisa de um header com no minuto a versão do HTTP o endpoint o Method
        // Exemplo => GET / HTTP/1.1

        String string = "{\"Method\":\"POST\",\"Request-URI\":'/',\"HTTP-Version\":'HTTP/1.1',\"Value1\":true,\"Value2\":2,\"Value3\":-2.345E68}";

        JSONObject example = new JSONObject(string);

        //Obtemos a String no formato HTTP com o metodo HTTP.toString()

        String output = HTTP.toString(example);
        System.out.println("Final HTTP: " + output);
    }

    // HTTP to JSON
    private static void HTTPFromExampleConversion() {

        //Criamos uma string no formato http

        String string = "Final HTTP: POST '/' HTTP/1.1 Value3: -2.345E+68 Value1: true Value2: 2";

        //E convrtemos com o metodo HTTP.toJSONOBject()

        JSONObject output = HTTP.toJSONObject(string);
        System.out.println("Final JSONObject: " + output);
    }


    public static void main(String[] args) {
        HTTPToExampleConversion();
        HTTPFromExampleConversion();
    }
}
