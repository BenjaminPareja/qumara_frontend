package appteam.nith.hillffair.retrofit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ASUS on 15/10/2017.
 */

public class QumaraAdapter {
    private static QumaraService API_SERVICE;

    public static QumaraService getApiService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpCLient = new OkHttpClient.Builder();
        httpCLient.addInterceptor(logging);

        String baseUrl= "https://quwara-backend-hypesthesic-admiral.mybluemix.net/api/";

        if(API_SERVICE==null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpCLient.build())
                    .build();
            API_SERVICE = retrofit.create(QumaraService.class);


        }

        return  API_SERVICE;

    }
}
