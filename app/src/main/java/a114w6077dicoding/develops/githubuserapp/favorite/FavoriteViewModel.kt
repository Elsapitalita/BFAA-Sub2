package a114w6077dicoding.develops.githubuserapp.favorite

import a114w6077dicoding.develops.githubuserapp.Room.FavoriteUser
import a114w6077dicoding.develops.githubuserapp.Room.FavoriteUserDao
import a114w6077dicoding.develops.githubuserapp.Room.UserDatabase
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class FavoriteViewModel(application: Application) : AndroidViewModel(application) {
    private var userDao: FavoriteUserDao?
    private var userDb: UserDatabase? = UserDatabase.getDatabase(application)

    init {
        userDao = userDb?.favoriteUserDao()
    }

    fun getFavoriteUser() : LiveData<List<FavoriteUser>>?{
        return userDao?.getFavoriteUser()
    }
}