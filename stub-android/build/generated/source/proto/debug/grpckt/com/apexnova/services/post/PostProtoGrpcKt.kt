package com.apexnova.services.post

import com.apexnova.services.post.PostGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for post.Post.
 */
public object PostGrpcKt {
  public const val SERVICE_NAME: String = PostGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createPostMethod: MethodDescriptor<PostRequest, PostReply>
    @JvmStatic
    get() = PostGrpc.getCreatePostMethod()

  public val getPostMethod: MethodDescriptor<GetPostRequest, PostReply>
    @JvmStatic
    get() = PostGrpc.getGetPostMethod()

  public val listPostsMethod: MethodDescriptor<ListPostsRequest, PostReply>
    @JvmStatic
    get() = PostGrpc.getListPostsMethod()

  public val deletePostMethod: MethodDescriptor<DeletePostRequest, DeletePostReply>
    @JvmStatic
    get() = PostGrpc.getDeletePostMethod()

  /**
   * A stub for issuing RPCs to a(n) post.Post service as suspending coroutines.
   */
  @StubFor(PostGrpc::class)
  public class PostCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<PostCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): PostCoroutineStub =
        PostCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun createPost(request: PostRequest, headers: Metadata = Metadata()): PostReply =
        unaryRpc(
      channel,
      PostGrpc.getCreatePostMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getPost(request: GetPostRequest, headers: Metadata = Metadata()): PostReply =
        unaryRpc(
      channel,
      PostGrpc.getGetPostMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun listPosts(request: ListPostsRequest, headers: Metadata = Metadata()): Flow<PostReply>
        = serverStreamingRpc(
      channel,
      PostGrpc.getListPostsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deletePost(request: DeletePostRequest, headers: Metadata = Metadata()):
        DeletePostReply = unaryRpc(
      channel,
      PostGrpc.getDeletePostMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the post.Post service based on Kotlin coroutines.
   */
  public abstract class PostCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for post.Post.CreatePost.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createPost(request: PostRequest): PostReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method post.Post.CreatePost is unimplemented"))

    /**
     * Returns the response to an RPC for post.Post.GetPost.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getPost(request: GetPostRequest): PostReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method post.Post.GetPost is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for post.Post.ListPosts.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun listPosts(request: ListPostsRequest): Flow<PostReply> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method post.Post.ListPosts is unimplemented"))

    /**
     * Returns the response to an RPC for post.Post.DeletePost.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deletePost(request: DeletePostRequest): DeletePostReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method post.Post.DeletePost is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PostGrpc.getCreatePostMethod(),
      implementation = ::createPost
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PostGrpc.getGetPostMethod(),
      implementation = ::getPost
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = PostGrpc.getListPostsMethod(),
      implementation = ::listPosts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PostGrpc.getDeletePostMethod(),
      implementation = ::deletePost
    )).build()
  }
}
