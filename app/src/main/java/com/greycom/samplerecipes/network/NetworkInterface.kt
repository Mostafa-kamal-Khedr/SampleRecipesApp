package com.greycom.samplerecipes.network

import com.greycom.samplerecipes.pojo.RecipesResponse
import retrofit2.Response
import retrofit2.http.GET

interface NetworkInterface {
    @GET("android-test/recipes.json")
    suspend fun getRecipesRequest(): Response<RecipesResponse>

}