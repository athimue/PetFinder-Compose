package finder.data.di

import com.athimue.domain.repository.AnimalRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import finder.data.repository.AnimalRepositoryImpl

@InstallIn(ViewModelComponent::class)
@Module
abstract class RepositoryModule {
    @Binds
    @ViewModelScoped
    abstract fun provideAnimalRepository(animalRepositoryImpl: AnimalRepositoryImpl): AnimalRepository

}
