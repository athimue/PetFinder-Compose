package finder.data.repository

import com.athimue.domain.repository.AnimalRepository
import com.mathieu.finder.domain.model.Animal
import finder.data.network.api.PetFinderApi
import javax.inject.Inject

class AnimalRepositoryImpl @Inject constructor(
  private val petFinderApi: PetFinderApi
) : AnimalRepository {

  override suspend fun getAnimals(): List<Animal> {
    val response = petFinderApi.getAnimals()
    return response.takeIf { it.isSuccessful }?.body()?.let {
      it.animals.map { animalDto -> animalDto.toAnimal() }
    } ?: listOf()
  }
}