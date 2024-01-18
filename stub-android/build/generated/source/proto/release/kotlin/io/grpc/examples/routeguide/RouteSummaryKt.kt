// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: io/grpc/examples/routeguide/route_guide.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package io.grpc.examples.routeguide;

@kotlin.jvm.JvmName("-initializerouteSummary")
public inline fun routeSummary(block: io.grpc.examples.routeguide.RouteSummaryKt.Dsl.() -> kotlin.Unit): io.grpc.examples.routeguide.RouteSummary =
  io.grpc.examples.routeguide.RouteSummaryKt.Dsl._create(io.grpc.examples.routeguide.RouteSummary.newBuilder()).apply { block() }._build()
/**
 * ```
 * A RouteSummary is received in response to a RecordRoute rpc.
 *
 * It contains the number of individual points received, the number of
 * detected features, and the total distance covered as the cumulative sum of
 * the distance between each point.
 * ```
 *
 * Protobuf type `io.grpc.examples.routeguide.RouteSummary`
 */
public object RouteSummaryKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.grpc.examples.routeguide.RouteSummary.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.grpc.examples.routeguide.RouteSummary.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.grpc.examples.routeguide.RouteSummary = _builder.build()

    /**
     * <pre>
     * The number of points received.
     * </pre>
     *
     * <code>int32 point_count = 1;</code>
     */
    public var pointCount: kotlin.Int
      @JvmName("getPointCount")
      get() = _builder.getPointCount()
      @JvmName("setPointCount")
      set(value) {
        _builder.setPointCount(value)
      }
    /**
     * ```
     * The number of points received.
     * ```
     *
     * `int32 point_count = 1;`
     */
    public fun clearPointCount() {
      _builder.clearPointCount()
    }

    /**
     * <pre>
     * The number of known features passed while traversing the route.
     * </pre>
     *
     * <code>int32 feature_count = 2;</code>
     */
    public var featureCount: kotlin.Int
      @JvmName("getFeatureCount")
      get() = _builder.getFeatureCount()
      @JvmName("setFeatureCount")
      set(value) {
        _builder.setFeatureCount(value)
      }
    /**
     * ```
     * The number of known features passed while traversing the route.
     * ```
     *
     * `int32 feature_count = 2;`
     */
    public fun clearFeatureCount() {
      _builder.clearFeatureCount()
    }

    /**
     * <pre>
     * The distance covered in metres.
     * </pre>
     *
     * <code>int32 distance = 3;</code>
     */
    public var distance: kotlin.Int
      @JvmName("getDistance")
      get() = _builder.getDistance()
      @JvmName("setDistance")
      set(value) {
        _builder.setDistance(value)
      }
    /**
     * ```
     * The distance covered in metres.
     * ```
     *
     * `int32 distance = 3;`
     */
    public fun clearDistance() {
      _builder.clearDistance()
    }

    /**
     * ```
     * The duration of the traversal.
     * ```
     *
     * `.google.protobuf.Duration elapsed_time = 4;`
     */
    public var elapsedTime: com.google.protobuf.Duration
      @JvmName("getElapsedTime")
      get() = _builder.getElapsedTime()
      @JvmName("setElapsedTime")
      set(value) {
        _builder.setElapsedTime(value)
      }
    /**
     * ```
     * The duration of the traversal.
     * ```
     *
     * `.google.protobuf.Duration elapsed_time = 4;`
     */
    public fun clearElapsedTime() {
      _builder.clearElapsedTime()
    }
    /**
     * ```
     * The duration of the traversal.
     * ```
     *
     * `.google.protobuf.Duration elapsed_time = 4;`
     * @return Whether the elapsedTime field is set.
     */
    public fun hasElapsedTime(): kotlin.Boolean {
      return _builder.hasElapsedTime()
    }
  }
}
public inline fun io.grpc.examples.routeguide.RouteSummary.copy(block: `io.grpc.examples.routeguide`.RouteSummaryKt.Dsl.() -> kotlin.Unit): io.grpc.examples.routeguide.RouteSummary =
  `io.grpc.examples.routeguide`.RouteSummaryKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val io.grpc.examples.routeguide.RouteSummaryOrBuilder.elapsedTimeOrNull: com.google.protobuf.Duration?
  get() = if (hasElapsedTime()) getElapsedTime() else null
