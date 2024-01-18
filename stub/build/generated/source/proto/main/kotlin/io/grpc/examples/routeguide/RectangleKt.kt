// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: io/grpc/examples/routeguide/route_guide.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package io.grpc.examples.routeguide;

@kotlin.jvm.JvmName("-initializerectangle")
public inline fun rectangle(block: io.grpc.examples.routeguide.RectangleKt.Dsl.() -> kotlin.Unit): io.grpc.examples.routeguide.Rectangle =
  io.grpc.examples.routeguide.RectangleKt.Dsl._create(io.grpc.examples.routeguide.Rectangle.newBuilder()).apply { block() }._build()
/**
 * ```
 * A latitude-longitude rectangle, represented as two diagonally opposite
 * points "lo" and "hi".
 * ```
 *
 * Protobuf type `io.grpc.examples.routeguide.Rectangle`
 */
public object RectangleKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.grpc.examples.routeguide.Rectangle.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.grpc.examples.routeguide.Rectangle.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.grpc.examples.routeguide.Rectangle = _builder.build()

    /**
     * ```
     * One corner of the rectangle.
     * ```
     *
     * `.io.grpc.examples.routeguide.Point lo = 1;`
     */
    public var lo: io.grpc.examples.routeguide.Point
      @JvmName("getLo")
      get() = _builder.getLo()
      @JvmName("setLo")
      set(value) {
        _builder.setLo(value)
      }
    /**
     * ```
     * One corner of the rectangle.
     * ```
     *
     * `.io.grpc.examples.routeguide.Point lo = 1;`
     */
    public fun clearLo() {
      _builder.clearLo()
    }
    /**
     * ```
     * One corner of the rectangle.
     * ```
     *
     * `.io.grpc.examples.routeguide.Point lo = 1;`
     * @return Whether the lo field is set.
     */
    public fun hasLo(): kotlin.Boolean {
      return _builder.hasLo()
    }

    /**
     * ```
     * The other corner of the rectangle.
     * ```
     *
     * `.io.grpc.examples.routeguide.Point hi = 2;`
     */
    public var hi: io.grpc.examples.routeguide.Point
      @JvmName("getHi")
      get() = _builder.getHi()
      @JvmName("setHi")
      set(value) {
        _builder.setHi(value)
      }
    /**
     * ```
     * The other corner of the rectangle.
     * ```
     *
     * `.io.grpc.examples.routeguide.Point hi = 2;`
     */
    public fun clearHi() {
      _builder.clearHi()
    }
    /**
     * ```
     * The other corner of the rectangle.
     * ```
     *
     * `.io.grpc.examples.routeguide.Point hi = 2;`
     * @return Whether the hi field is set.
     */
    public fun hasHi(): kotlin.Boolean {
      return _builder.hasHi()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.grpc.examples.routeguide.Rectangle.copy(block: `io.grpc.examples.routeguide`.RectangleKt.Dsl.() -> kotlin.Unit): io.grpc.examples.routeguide.Rectangle =
  `io.grpc.examples.routeguide`.RectangleKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val io.grpc.examples.routeguide.RectangleOrBuilder.loOrNull: io.grpc.examples.routeguide.Point?
  get() = if (hasLo()) getLo() else null

public val io.grpc.examples.routeguide.RectangleOrBuilder.hiOrNull: io.grpc.examples.routeguide.Point?
  get() = if (hasHi()) getHi() else null

