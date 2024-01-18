
# ApexNova Protobuf Definitions

## Overview

This repository contains the Protocol Buffer (`.proto`) definitions used by ApexNova services. These definitions are crucial for generating client and server code used for gRPC communication between services.

## Structure

The `.proto` files are organized as follows:

```
proto/
    |── service1/
    │    └── service1.proto
    |
    |── service2/
    │    └── service2.proto
    |
    └── common/
         └── common_types.proto
```

- `service1/`, `service2/`: Directories containing `.proto` files specific to a service.
- `common/`: Directory containing `.proto` files for common types used across different services.

## Usage

To use these `.proto` files in your project, you can either clone this repository or reference it directly if your build system supports remote `.proto` file dependencies.

### Cloning the Repository

```bash
git clone https://github.com/apexnova-vc/proto.git
```

### Using Remote `.proto` Files

If your build system supports it, you can directly reference the `.proto` files in this repository. For example, in a Gradle project, you might use the `protobuf` dependency as follows:

```groovy
dependencies {
    implementation 'com.apexnova:proto:<version>'
}
```

Replace `<version>` with the specific version you want to use.

## Generating Source Code

You can generate client and server code in your preferred language by using the Protocol Buffer compiler (`protoc`) along with the appropriate plugins for your language.

Example for generating Java source files:

```bash
protoc --java_out=java/ --proto_path=proto/ proto/*.proto
```

## Contribution

Contributions to this repository are welcome. Please ensure that any changes to the `.proto` files are backward compatible to avoid breaking changes in services that depend on these definitions.

## License

The `.proto` files in this repository are licensed under the Apache License, Version 2.0. See the [LICENSE](LICENSE) file for more details.
