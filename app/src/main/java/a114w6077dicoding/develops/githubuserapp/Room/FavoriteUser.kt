package a114w6077dicoding.develops.githubuserapp.Room

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "favorite_user")
data class FavoriteUser(
    val login: String,

    @PrimaryKey
    val id: Int,

    val avatarUrl : String
): Serializable
