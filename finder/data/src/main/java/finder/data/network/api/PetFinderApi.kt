package finder.data.network.api

import finder.data.network.dto.AnimalResponseDto
import retrofit2.Response
import retrofit2.http.GET

interface PetFinderApi {
  @GET("v2/animals")
  suspend fun getAnimals(): Response<AnimalResponseDto>

  companion object {
    const val PETFINDER_API = "https://api.petfinder.com"
  }
}
