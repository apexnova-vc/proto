// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: io/grpc/examples/helloworld/hello_world.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package io.grpc.examples.helloworld;

@kotlin.jvm.JvmName("-initializehelloReply")
public inline fun helloReply(block: io.grpc.examples.helloworld.HelloReplyKt.Dsl.() -> kotlin.Unit): io.grpc.examples.helloworld.HelloReply =
  io.grpc.examples.helloworld.HelloReplyKt.Dsl._create(io.grpc.examples.helloworld.HelloReply.newBuilder()).apply { block() }._build()
/**
 * ```
 * The response message containing the greetings
 * ```
 *
 * Protobuf type `helloworld.HelloReply`
 */
public object HelloReplyKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.grpc.examples.helloworld.HelloReply.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.grpc.examples.helloworld.HelloReply.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.grpc.examples.helloworld.HelloReply = _builder.build()

    /**
     * `string message = 1;`
     */
    public var message: kotlin.String
      @JvmName("getMessage")
      get() = _builder.getMessage()
      @JvmName("setMessage")
      set(value) {
        _builder.setMessage(value)
      }
    /**
     * `string message = 1;`
     */
    public fun clearMessage() {
      _builder.clearMessage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.grpc.examples.helloworld.HelloReply.copy(block: `io.grpc.examples.helloworld`.HelloReplyKt.Dsl.() -> kotlin.Unit): io.grpc.examples.helloworld.HelloReply =
  `io.grpc.examples.helloworld`.HelloReplyKt.Dsl._create(this.toBuilder()).apply { block() }._build()

