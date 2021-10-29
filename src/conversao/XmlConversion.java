package conversao;

import org.json.JSONObject;
import org.json.XML;

public class XmlConversion {

    //JSON TO XML

    private static void XMLToExampleConversion() {

        //Crimaos um JSONObject

        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
        JSONObject example = new JSONObject(string);

        //E passamos como parametro para obter uma string com formato de XML
        String output = XML.toString(example);
        System.out.println("Final XML: " + output);
    }

    // XML TO JSON

    private static void XMLFromExampleConversion() {

        //Criamos uma String no formato XML

        String string = "<0>value</0><1>5</1><2>-2.345E+68</2><3>true</3>";

        //E obtemos um JSONObject com a funcao XML.toJSONOBject()

        JSONObject output = XML.toJSONObject(string);

        System.out.println("Final JSONObject: " + output);
    }


    public static void main(String[] args) {
        XMLToExampleConversion();
        XMLFromExampleConversion();
    }
}
