package appteam.nith.hillffair.retrofit;

import appteam.nith.hillffair.retrofit.Response.PacienteResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ASUS on 15/10/2017.
 */

public interface QumaraService {

    @GET ("paciente")
    Call<PacienteResponse> getPaciente (@Query("dni") String dni);
}
