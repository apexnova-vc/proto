// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/grpc/examples/routeguide/route_guide.proto

// Protobuf Java Version: 3.25.1
package io.grpc.examples.routeguide;

public interface RectangleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.grpc.examples.routeguide.Rectangle)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.io.grpc.examples.routeguide.Point lo = 1;</code>
   * @return Whether the lo field is set.
   */
  boolean hasLo();
  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.io.grpc.examples.routeguide.Point lo = 1;</code>
   * @return The lo.
   */
  io.grpc.examples.routeguide.Point getLo();

  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.io.grpc.examples.routeguide.Point hi = 2;</code>
   * @return Whether the hi field is set.
   */
  boolean hasHi();
  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.io.grpc.examples.routeguide.Point hi = 2;</code>
   * @return The hi.
   */
  io.grpc.examples.routeguide.Point getHi();
}
