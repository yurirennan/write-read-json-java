package conversao;

import org.json.JSONObject;
import org.json.Property;

import java.util.Properties;

public class PropertiesConversion {
    //JSON to PROPERTIES
    private static Properties PropertyToExampleConversion() {

        //Cria um JSONObject passando a string

        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
        JSONObject example = new JSONObject(string);

        //E obtemos as propriedades com o metodo roperty.toProperties()

        Properties output = Property.toProperties(example);
        System.out.println("Final Properties: " + output);

        return output;
    }

    //PROPERTIES TO JSON
    private static void PropertyFromExampleConversion() {

        //Criamos um objeto com as propriedades

        Properties input = PropertyToExampleConversion();

        //E obtemos em formato JSON com a função Property.toJSONObject()

        JSONObject output = Property.toJSONObject(input);
        System.out.println("Final JSONObject: " + output);
    }

    public static void main(String[] args) {
        PropertyToExampleConversion();
        PropertyFromExampleConversion();
    }
}
