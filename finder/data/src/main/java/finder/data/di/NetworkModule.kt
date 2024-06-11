package finder.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import finder.data.network.api.PetFinderApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

  @Singleton
  @Provides
  fun provideOkHttpClient(): OkHttpClient =
    OkHttpClient
      .Builder()
      .build()

  @Singleton
  @Provides
  fun provideRetrofitInstance(client: OkHttpClient): Retrofit =
    Retrofit.Builder()
      .addConverterFactory(GsonConverterFactory.create())
      .baseUrl(PetFinderApi.PETFINDER_API)
      .client(client)
      .build()


  @Provides
  @Singleton
  fun provideApi(retrofit: Retrofit): PetFinderApi =
    retrofit.create(PetFinderApi::class.java)

}