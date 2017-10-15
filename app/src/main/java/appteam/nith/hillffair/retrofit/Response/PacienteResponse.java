package appteam.nith.hillffair.retrofit.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import appteam.nith.hillffair.retrofit.Modelo.Paciente;
import appteam.nith.hillffair.retrofit.Modelo.Recomendaciones;

/**
 * Created by ASUS on 15/10/2017.
 */

public class PacienteResponse {

        private List<Paciente> paciente = null;
        private List<Object> horario = null;
        private List<Recomendaciones> recomendaciones = null;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public List<Paciente> getPaciente() {
            return paciente;
        }

        public void setPaciente(List<Paciente> paciente) {
            this.paciente = paciente;
        }

        public List<Object> getHorario() {
            return horario;
        }

        public void setHorario(List<Object> horario) {
            this.horario = horario;
        }

        public List<Recomendaciones> getRecomendaciones() {
            return recomendaciones;
        }

        public void setRecomendaciones(List<Recomendaciones> recomendaciones) {
            this.recomendaciones = recomendaciones;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }


}
