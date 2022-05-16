package com.example.food;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RetrofitInterface {

    @POST("register")
    @FormUrlEncoded
    Observable<String> registerUser(@Field("full_name") String name,
                                    @Field("email") String email,
                                    @Field("mobile_number") String mobile_number,
                                    @Field("password") String password);

   /* @POST("login")
    @FormUrlEncoded
    Observable<String> registerUser(@Field("email") String email,
                                    @Field("password") String password
                                    );

*/
}
