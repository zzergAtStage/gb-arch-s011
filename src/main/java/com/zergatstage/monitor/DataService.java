package com.zergatstage.monitor;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class DataService {
    private static final String SERVICE_URL = "http://localhost:8080/main/all";

    public static List<Client> fetchData() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(SERVICE_URL))
                .build();
        final ObjectMapper objectMapper = new ObjectMapper();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseData = response.body();

            System.out.println(responseData);
            return objectMapper.readValue(responseData,
                    objectMapper
                            .getTypeFactory()
                            .constructCollectionType(List.class, Client.class));
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
