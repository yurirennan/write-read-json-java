package conversao;

import org.json.JSONArray;
import org.json.JSONObject;

public class ConversionToJsonArray {

    private static org.json.JSONArray listNumberArray(int max){
        org.json.JSONArray res = new org.json.JSONArray();
        for (int i=0; i<max;i++) {
            //The value of the labels must be an String in order to make it work
            res.put(String.valueOf(i));
        }
        return res;
    }

    private static void JSONObjectToArray() {
        //Crimamos um JSONObject
        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
        JSONObject example = new JSONObject(string);


        //Pegamos as chaves
        JSONArray keyStrings = listNumberArray(example.length());
        System.out.println(keyStrings);

        //Passamos as chaves e temos como retorno um array com os valores de cada chave
        JSONArray array = example.toJSONArray(keyStrings);

        System.out.println("Final JSONArray: " + array);
    }

    public static void main(String[] args) {
         JSONObjectToArray();
    }

}
