// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: com/apexnova/services/sample/sample.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.apexnova.services.sample;

@kotlin.jvm.JvmName("-initializesampleReply")
public inline fun sampleReply(block: com.apexnova.services.sample.SampleReplyKt.Dsl.() -> kotlin.Unit): com.apexnova.services.sample.SampleReply =
  com.apexnova.services.sample.SampleReplyKt.Dsl._create(com.apexnova.services.sample.SampleReply.newBuilder()).apply { block() }._build()
/**
 * ```
 * The response message containing the sample response
 * ```
 *
 * Protobuf type `sample.SampleReply`
 */
public object SampleReplyKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.apexnova.services.sample.SampleReply.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.apexnova.services.sample.SampleReply.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.apexnova.services.sample.SampleReply = _builder.build()

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
public inline fun com.apexnova.services.sample.SampleReply.copy(block: `com.apexnova.services.sample`.SampleReplyKt.Dsl.() -> kotlin.Unit): com.apexnova.services.sample.SampleReply =
  `com.apexnova.services.sample`.SampleReplyKt.Dsl._create(this.toBuilder()).apply { block() }._build()

