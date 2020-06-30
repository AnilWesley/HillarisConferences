package com.applications.hillarisconferences.api;

import com.applications.hillarisconferences.models.AbsrtactResponse;
import com.applications.hillarisconferences.models.BaseResponse;
import com.applications.hillarisconferences.models.BrochureDownload;
import com.applications.hillarisconferences.models.ConferenceBanner;
import com.applications.hillarisconferences.models.ConferenceProducts;
import com.applications.hillarisconferences.models.Events;
import com.applications.hillarisconferences.models.FilterData;
import com.applications.hillarisconferences.models.PaymentRegistration;
import com.applications.hillarisconferences.models.PaymentStripe;
import com.applications.hillarisconferences.models.RegistrationsListResponse;
import com.applications.hillarisconferences.models.Sessions;
import com.applications.hillarisconferences.models.SubmitAbstract;
import com.applications.hillarisconferences.models.Template;
import com.applications.hillarisconferences.models.TrackName;
import com.applications.hillarisconferences.models.UserCreation;
import com.applications.hillarisconferences.models.UserLogin;
import com.google.gson.JsonObject;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;


/**
 * Pagination
 * Created by Suleiman19 on 10/27/16.
 * Copyright (c) 2016. Suleiman Ali Shakir. All rights reserved.
 */

public interface ApiInterface {



    @Headers("Content-Type: application/json")
    @POST("api/get/mobiledata_all")
    Call<Events> processDataAll(@Body JsonObject body);


    @Headers("Content-Type: application/json")
    @POST("api/get/mobiledata_conference")
    Call<ConferenceBanner> processDataConference(@Body JsonObject body);

    @Headers("Content-Type: application/json")
    @POST("api/conference/get_registration_products")
    Call<ConferenceProducts> processDataConferenceProducts(@Body JsonObject body);


    @Headers("Content-Type: application/json")
    @POST("stripe/public/create-payment-intent.php")
    Call<PaymentStripe> processDataConferencePayment(@Body JsonObject body);


    @Headers("Content-Type: application/json")
    @POST("api/conference/insert_registration")
    Call<PaymentRegistration> processDataSendConferencePayment(@Body JsonObject body);

    @Headers("Content-Type: application/json")
    @POST("api/conference/update_registration")
    Call<PaymentRegistration> processDataSendConferencePaymentStatus(@Body JsonObject body);



    @Headers("Content-Type: application/json")
    @POST("api/conference/get_tracks")
    Call<TrackName> processDataGetTrackName(@Body JsonObject body);

    @Headers("Content-Type: application/json")
    @POST("api/conference/get_abstract_template_file")
    Call<Template> processDataGetTemplate(@Body JsonObject body);


    @Headers("Content-Type: application/json")
    @POST("api/conference/insert_app_user")
    Call<UserCreation> processDataInsertAppUser(@Body JsonObject body);


    @Headers("Content-Type: application/json")
    @POST("api/conference/app_user_login")
    Call<UserLogin> processDataAppUser(@Body JsonObject body);

    @Multipart
    @POST("api/conference/insert_abstract")
    Call<SubmitAbstract> processDataSendAbstract(
            @Part MultipartBody.Part file,
            @Part("conf_id") RequestBody conf_id,
            @Part("title") RequestBody title,
            @Part("name") RequestBody name,
            @Part("country") RequestBody country,
            @Part("email") RequestBody email,
            @Part("phone") RequestBody phone,
            @Part("category") RequestBody category,
            @Part("track_name") RequestBody track_name,
            @Part("address") RequestBody address,
            @Part("date") RequestBody date,
            @Part("app_user_id") RequestBody app_user_id,
            @Part("source") RequestBody source);




    @Headers("Content-Type: application/json")
    @POST("api/conference/brochure_download")
    Call<BrochureDownload> processDataBrochureDownload(@Body JsonObject body);

    @Headers("Content-Type: application/json")
    @POST("api/get/mobiledata_insert_subscription")
    Call<BaseResponse> processDataInsertSubscription(@Body JsonObject body);

    @Headers("Content-Type: application/json")
    @POST("api/conference/get_filters")
    Call<FilterData> processDataCountryandCity(@Body JsonObject body);

    @Headers("Content-Type: application/json")
    @POST("api/conference/get_track_details")
    Call<Sessions> processDataSessionsandTracks(@Body JsonObject body);


    @Headers("Content-Type: application/json")
    @POST("api/conference/mobiledata_insert_feedback")
    Call<BaseResponse> processDataFeedBack(@Body JsonObject body);

    @Headers("Content-Type: application/json")
    @POST("api/conference/abstracts")
    Call<AbsrtactResponse> processDataAbstractList(@Body JsonObject body);

    @Headers("Content-Type: application/json")
    @POST("api/conference/registrations")
    Call<RegistrationsListResponse> processDataRegistrationsList(@Body JsonObject body);
}