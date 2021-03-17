package com.example.firebasepushnotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAARHHzHoo:APA91bEsbQD8WCpWneWAy38z5ZqynvFuIA7e_lndJd-QgYBT1N3rXMCLewnaRbF1flUi1abJQZN278NSEUFRQmqtdMbGpHPgc-TKapXndecv7Q-8Hnb3x5SJGAX1GYJJ7vR9hZ-sABNn"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotifcation(@Body NotificationSender body);
}

