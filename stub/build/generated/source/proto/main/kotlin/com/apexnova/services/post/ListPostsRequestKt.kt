// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: com/apexnova/services/post/post.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.apexnova.services.post;

@kotlin.jvm.JvmName("-initializelistPostsRequest")
public inline fun listPostsRequest(block: com.apexnova.services.post.ListPostsRequestKt.Dsl.() -> kotlin.Unit): com.apexnova.services.post.ListPostsRequest =
  com.apexnova.services.post.ListPostsRequestKt.Dsl._create(com.apexnova.services.post.ListPostsRequest.newBuilder()).apply { block() }._build()
/**
 * ```
 * The request message for listing all posts.
 * ```
 *
 * Protobuf type `post.ListPostsRequest`
 */
public object ListPostsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.apexnova.services.post.ListPostsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.apexnova.services.post.ListPostsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.apexnova.services.post.ListPostsRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.apexnova.services.post.ListPostsRequest.copy(block: `com.apexnova.services.post`.ListPostsRequestKt.Dsl.() -> kotlin.Unit): com.apexnova.services.post.ListPostsRequest =
  `com.apexnova.services.post`.ListPostsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

