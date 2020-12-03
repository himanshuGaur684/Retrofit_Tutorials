package gaur.himanshu.august.retrofittutorials.retrofit

import gaur.himanshu.august.retrofittutorials.`object`.CommentResponce
import gaur.himanshu.august.retrofittutorials.`object`.JsonAPiResponse
import retrofit2.Response
import retrofit2.http.*

interface JsonApi {

    @GET("posts")
    suspend fun getPosts(): Response<List<JsonAPiResponse>>


    @GET("posts/{id}")
    suspend fun getPostsParticularId(@Path("id") id: Int): Response<JsonAPiResponse>


    @GET("comments")
    suspend fun getCommentPostId(@Query("postId") postId: Int): Response<List<CommentResponce>>


    @POST("posts")
    suspend fun postDataToServer(@Body jsonAPiResponse: JsonAPiResponse):Response<JsonAPiResponse>

}