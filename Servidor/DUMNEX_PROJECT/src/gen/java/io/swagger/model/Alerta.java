/*
 * Procesar datos
 * Procesado de información relativa a usuarios y mediciones de valores de salud.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: jbermejod@alumnos.unex.es
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;


import java.util.Objects;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



import javax.validation.constraints.*;




/**
 * Alerta
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-29T18:41:10.265Z[GMT]")
public class Alerta   {
  
    
      
  
  @JsonProperty("alertaId")
  
  
  
  
  private String alertaId = null;
  

  
    
      
  
  @JsonProperty("usuarioId")
  
  
  
  
  private String usuarioId = null;
  

  
    
      
  
  @JsonProperty("tipoAlerta")
  
  
  
  
  private String tipoAlerta = null;
  

  
    
      
  
  @JsonProperty("fecha")
  
  
  
  
  private String fecha = null;
  

  
    
      
  
  @JsonProperty("mensaje_id")
  
  
  
  
  private Integer mensaje_id = null;


  @JsonProperty("mensaje")




  private String mensaje = null;
  

  
  
  
  public Alerta alertaId(String alertaId) {
    this.alertaId = alertaId;
    return this;
  }

  public Alerta(String alertaId, String usuarioId,Integer mensaje_id,String fecha, String tipoAlerta,
                 String mensaje) {
    this.alertaId = alertaId;
    this.usuarioId = usuarioId;
    this.tipoAlerta = tipoAlerta;
    this.fecha = fecha;
    this.mensaje_id = mensaje_id;
    this.mensaje = mensaje;
  }

    public Alerta(String usuarioId,Integer mensaje_id,String fecha, String tipoAlerta,
                  String mensaje) {
        this.usuarioId = usuarioId;
        this.tipoAlerta = tipoAlerta;
        this.fecha = fecha;
        this.mensaje_id = mensaje_id;
        this.mensaje = mensaje;
    }

  /**
  
  
   * Get alertaId
  
  
  
   * @return alertaId
   **/
 
  
  @JsonProperty("alertaId")
  
  @ApiModelProperty(value = "")

  public String getAlertaId() {
    return alertaId;
  }
  

  public void setAlertaId(String alertaId) {
    this.alertaId = alertaId;
  }
  

  
  
  public Alerta usuarioId(String usuarioId) {
    this.usuarioId = usuarioId;
    return this;
  }
  
  

  
  /**
  
  
   * Get usuarioId
  
  
  
   * @return usuarioId
   **/
 
  
  @JsonProperty("usuarioId")
  
  @ApiModelProperty(required = true, value = "")

  @NotNull

  public String getUsuarioId() {
    return usuarioId;
  }
  

  public void setUsuarioId(String usuarioId) {
    this.usuarioId = usuarioId;
  }
  

  
  
  public Alerta tipoAlerta(String tipoAlerta) {
    this.tipoAlerta = tipoAlerta;
    return this;
  }
  
  

  
  /**
  
  
   * Get tipoAlerta
  
  
  
   * @return tipoAlerta
   **/
 
  
  @JsonProperty("tipoAlerta")
  
  @ApiModelProperty(required = true, value = "")

  @NotNull

  public String getTipoAlerta() {
    return tipoAlerta;
  }
  

  public void setTipoAlerta(String tipoAlerta) {
    this.tipoAlerta = tipoAlerta;
  }
  

  
  
  public Alerta fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }
  
  

  
  /**
  
  
   * Get fecha
  
  
  
   * @return fecha
   **/
 
  
  @JsonProperty("fecha")
  
  @ApiModelProperty(required = true, value = "")

  @NotNull

  public String getFecha() {
    return fecha;
  }
  

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }
  

  
  
  public Alerta prioridad(Integer mensaje_id) {
    this.mensaje_id = mensaje_id;
    return this;
  }
  
  

  
  /**
  
  
   * Get mensaje_id
  
  
  
   * @return prioridad
   **/
 
  
  @JsonProperty("mensaje_id")
  
  @ApiModelProperty(required = true, value = "")

  @NotNull

  public Integer getMensaje_id() {
    return mensaje_id;
  }
  

  public void setMensaje_id(Integer prioridad) {
    this.mensaje_id = prioridad;
  }


  /**


   * Get mensaje



   * @return mensaje
   **/


  @JsonProperty("mensaje")

  @ApiModelProperty(required = true, value = "")

  @NotNull

  public String getMensaje() {
    return mensaje;
  }


  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }





  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alerta alerta = (Alerta) o;
    return Objects.equals(this.alertaId, alerta.alertaId) &&
        Objects.equals(this.usuarioId, alerta.usuarioId) &&
        Objects.equals(this.tipoAlerta, alerta.tipoAlerta) &&
        Objects.equals(this.fecha, alerta.fecha) &&
        Objects.equals(this.mensaje_id, alerta.mensaje_id) &&
            Objects.equals(this.mensaje, alerta.mensaje);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertaId, usuarioId, tipoAlerta, fecha, mensaje_id, mensaje);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alerta {\n");
    
    sb.append("    alertaId: ").append(toIndentedString(alertaId)).append("\n");
    sb.append("    usuarioId: ").append(toIndentedString(usuarioId)).append("\n");
    sb.append("    tipoAlerta: ").append(toIndentedString(tipoAlerta)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    prioridad: ").append(toIndentedString(mensaje_id)).append("\n");
    sb.append("    prioridad: ").append(toIndentedString(mensaje)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


