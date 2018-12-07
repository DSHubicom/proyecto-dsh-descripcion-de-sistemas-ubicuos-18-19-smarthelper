package io.swagger.api.impl;

import com.google.gson.Gson;
import database.Jdbc;
import io.swagger.api.*;
import io.swagger.model.*;



import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-29T18:41:10.265Z[GMT]")

public class OxigenoApiServiceImpl extends OxigenoApiService {
    
    @Override
    public Response obtenerOxigeno( @NotNull String usuarioId, SecurityContext securityContext) throws NotFoundException {

        // do some magic!
        boolean encontrado = false;

        int valoracion = 0;

        /*

        int valoracion = 0;

        Mediciones mediciones = null;
        try {
            mediciones = Jdbc.obtenerTodosLasMediciones();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < mediciones.size() && !encontrado; i++) {

            if (mediciones.get(i).getUsuarioId().equalsIgnoreCase(usuarioId)){
                valoracion = mediciones.get(i).getOxigeno();
                encontrado = true;

            }

        }

        */

        Medicion medicion_oxigeno = null;

        try {
            medicion_oxigeno = Jdbc.obtenerUltimoOxigeno(usuarioId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        valoracion = medicion_oxigeno.getOxigeno();

        Gson gson = new Gson();

        // 1. Java object to JSON, and save into a file
        // gson.toJson(obj, new FileWriter("D:\\file.json"));

        // 2. Java object to JSON, and assign to a String
        String jsonInString = gson.toJson(valoracion);

        return Response.ok(jsonInString, MediaType.APPLICATION_JSON).build();


    }
    
}

