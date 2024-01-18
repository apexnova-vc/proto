// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: io/grpc/examples/helloworld/hello_world.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package io.grpc.examples.helloworld;

@kotlin.jvm.JvmName("-initializehelloRequest")
public inline fun helloRequest(block: io.grpc.examples.helloworld.HelloRequestKt.Dsl.() -> kotlin.Unit): io.grpc.examples.helloworld.HelloRequest =
  io.grpc.examples.helloworld.HelloRequestKt.Dsl._create(io.grpc.examples.helloworld.HelloRequest.newBuilder()).apply { block() }._build()
/**
 * ```
 * The request message containing the user's name.
 * ```
 *
 * Protobuf type `helloworld.HelloRequest`
 */
public object HelloRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.grpc.examples.helloworld.HelloRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.grpc.examples.helloworld.HelloRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.grpc.examples.helloworld.HelloRequest = _builder.build()

    /**
     * `string name = 1;`
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * `string name = 1;`
     */
    public fun clearName() {
      _builder.clearName()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.grpc.examples.helloworld.HelloRequest.copy(block: `io.grpc.examples.helloworld`.HelloRequestKt.Dsl.() -> kotlin.Unit): io.grpc.examples.helloworld.HelloRequest =
  `io.grpc.examples.helloworld`.HelloRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

