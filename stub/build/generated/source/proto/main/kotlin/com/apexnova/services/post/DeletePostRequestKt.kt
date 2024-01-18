// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: com/apexnova/services/post/post.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.apexnova.services.post;

@kotlin.jvm.JvmName("-initializedeletePostRequest")
public inline fun deletePostRequest(block: com.apexnova.services.post.DeletePostRequestKt.Dsl.() -> kotlin.Unit): com.apexnova.services.post.DeletePostRequest =
  com.apexnova.services.post.DeletePostRequestKt.Dsl._create(com.apexnova.services.post.DeletePostRequest.newBuilder()).apply { block() }._build()
/**
 * ```
 * The request message for deleting a post.
 * ```
 *
 * Protobuf type `post.DeletePostRequest`
 */
public object DeletePostRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.apexnova.services.post.DeletePostRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.apexnova.services.post.DeletePostRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.apexnova.services.post.DeletePostRequest = _builder.build()

    /**
     * `string postId = 1;`
     */
    public var postId: kotlin.String
      @JvmName("getPostId")
      get() = _builder.getPostId()
      @JvmName("setPostId")
      set(value) {
        _builder.setPostId(value)
      }
    /**
     * `string postId = 1;`
     */
    public fun clearPostId() {
      _builder.clearPostId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.apexnova.services.post.DeletePostRequest.copy(block: `com.apexnova.services.post`.DeletePostRequestKt.Dsl.() -> kotlin.Unit): com.apexnova.services.post.DeletePostRequest =
  `com.apexnova.services.post`.DeletePostRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

