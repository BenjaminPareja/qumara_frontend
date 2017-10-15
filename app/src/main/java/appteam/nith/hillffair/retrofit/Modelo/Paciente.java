package appteam.nith.hillffair.retrofit.Modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 15/10/2017.
 */

public class Paciente {

    private String id;
    private String nombre;
    private String telefono;
    private String nroEmbarazos;
    private String estadoEmbar;
    private String dni;
    private Integer v;
    private List<Object> resultados = null;
    private List<Hijo> hijos = null;
    private String genero;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNroEmbarazos() {
        return nroEmbarazos;
    }

    public void setNroEmbarazos(String nroEmbarazos) {
        this.nroEmbarazos = nroEmbarazos;
    }

    public String getEstadoEmbar() {
        return estadoEmbar;
    }

    public void setEstadoEmbar(String estadoEmbar) {
        this.estadoEmbar = estadoEmbar;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public List<Object> getResultados() {
        return resultados;
    }

    public void setResultados(List<Object> resultados) {
        this.resultados = resultados;
    }

    public List<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(List<Hijo> hijos) {
        this.hijos = hijos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
