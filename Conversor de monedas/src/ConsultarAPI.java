import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.lang.reflect.Type;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConsultarAPI
{
    public double consultarCambio(String divisaBase, String divisaAConvertir) throws IOException, InterruptedException {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/421042c2b58dba8c41bdbfc1/pair/"+divisaBase+"/"+divisaAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        //Obtiene el JSON, dentro del JSON busca "conversion_rate" y lo convierte a double y lo regresa
        return JsonParser.parseString(response.body()).getAsJsonObject().get("conversion_rate").getAsDouble();

    }
}
