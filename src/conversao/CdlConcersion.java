package conversao;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

public class CdlConcersion {


    // JSON TO CDL
    private static void CDLToExampleConversion() {

        //Começamos criando alguns JSONObjects com os mesmos valores nas chaves
        // mas nos campo "valor" tem valores diferentes

        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
        JSONObject example = new JSONObject(string);

        String string2 = "{\"0\":\"value2\",\"1\":6,\"2\":-8.345E68,\"3\":false}";
        JSONObject example2 = new JSONObject(string2);

        //Crianmo um JSONArray e adicionamos os objetos dentro

        JSONArray array = new JSONArray();
        array.put(example);
        array.put(example2);

        //WE obtemos como resposta a string com o metodo CDL.toString()

        String output = CDL.toString(array);
        System.out.println("Final CDL: \r\n" + output);
    }

    //CDL TO JSON
    private static void CDLFromExampleConversion() {

        //Começamos criando uma string no formato CDL.

        String string = "0,1,2,3\n"
                + "value,5,-2.345E+68,true\n"
                + "value2,6,-8.345E+68,false";

        //E usamos o método CDL..toJSONArray() para converter

        JSONArray output = CDL.toJSONArray(string);
        System.out.println("Final JSONArray: " + output);
    }

    public static void main(String[] args) {
        CDLToExampleConversion();
        CDLFromExampleConversion();
    }

}
