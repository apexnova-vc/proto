// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: com/apexnova/services/post/post.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.apexnova.services.post;

@kotlin.jvm.JvmName("-initializepostReply")
public inline fun postReply(block: com.apexnova.services.post.PostReplyKt.Dsl.() -> kotlin.Unit): com.apexnova.services.post.PostReply =
  com.apexnova.services.post.PostReplyKt.Dsl._create(com.apexnova.services.post.PostReply.newBuilder()).apply { block() }._build()
/**
 * ```
 * The response message for a post.
 * ```
 *
 * Protobuf type `post.PostReply`
 */
public object PostReplyKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.apexnova.services.post.PostReply.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.apexnova.services.post.PostReply.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.apexnova.services.post.PostReply = _builder.build()

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

    /**
     * `string title = 2;`
     */
    public var title: kotlin.String
      @JvmName("getTitle")
      get() = _builder.getTitle()
      @JvmName("setTitle")
      set(value) {
        _builder.setTitle(value)
      }
    /**
     * `string title = 2;`
     */
    public fun clearTitle() {
      _builder.clearTitle()
    }

    /**
     * `string content = 3;`
     */
    public var content: kotlin.String
      @JvmName("getContent")
      get() = _builder.getContent()
      @JvmName("setContent")
      set(value) {
        _builder.setContent(value)
      }
    /**
     * `string content = 3;`
     */
    public fun clearContent() {
      _builder.clearContent()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.apexnova.services.post.PostReply.copy(block: `com.apexnova.services.post`.PostReplyKt.Dsl.() -> kotlin.Unit): com.apexnova.services.post.PostReply =
  `com.apexnova.services.post`.PostReplyKt.Dsl._create(this.toBuilder()).apply { block() }._build()

