package appteam.nith.hillffair.retrofit.Modelo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ASUS on 15/10/2017.
 */

public class Hijo {
    private String idPaciente;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
