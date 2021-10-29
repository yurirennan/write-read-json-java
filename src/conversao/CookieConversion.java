package conversao;

import org.json.Cookie;
import org.json.JSONObject;

public class CookieConversion {
    // JSON TO COOKIE
    private static void CookieToExampleConversion() {

        //Criamos um JSONObject
        //O JSONOBject precisa que a entrada contenha o nome do cookie e o nome do campo "name" do cookie
        //O formato Cookie não suporta valores booleanos

        String string = "{\"name\":\"Cookie-Name\",\"value\":\"cookie-value\",\"1\":5,\"2\":-2.345E68,\"3\":'true'}";
        JSONObject example = new JSONObject(string);

        //Utilizamos o metodo .toString() para obter o cookie

        String output = Cookie.toString(example);
        System.out.println("Final Cookie: " + output);
    }

    //COOKIE TO JSON
    private static void CookieFromExampleConversion() {

        //Inicializamos a string no formato Cookie

        String string = "Cookie-Name=name;1=5;2=-2.345E%2b68;3=true";

        //E passamos para a função Cookie.toJSONOBject()
        JSONObject output = Cookie.toJSONObject(string);
        System.out.println("Final JSONObject: " + output);
    }

    public static void main(String[] args) {
        CookieToExampleConversion();
        CookieFromExampleConversion();
    }
}
