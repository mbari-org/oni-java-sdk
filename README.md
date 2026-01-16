# oni-java-sdk

Java SDK for the [Oni microservice](https://github.com/mbari-org/oni), a knowledgebase API for managing taxonomic concepts, associations, media, and user preferences. This SDK provides both low-level auto-generated clients and higher-level service abstractions with caching support.

## Features

- **Async-First API**: All operations return `CompletableFuture` for non-blocking I/O
- **Virtual Thread Support**: Uses Java 21 virtual threads for efficient concurrency
- **Built-in Caching**: Optional caching services for concepts, templates, and names
- **Type-Safe**: Generated from OpenAPI specification using Microsoft Kiota
- **Flexible Authentication**: Supports both authenticated and anonymous (read-only) access

## Requirements

- Java 21 or higher
- Maven 3.6+

## Installation

Add the dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>org.mbari.vars</groupId>
    <artifactId>oni-java-sdk</artifactId>
    <version>0.0.5</version>
</dependency>
```

## Quick Start

### Read-Only Access (No Authentication)

```java
import org.mbari.vars.oni.sdk.r1.OniKiotaClient;
import java.net.URI;

var client = new OniKiotaClient(URI.create("https://your-oni-server.org/kb"));

// Find the root concept
var root = client.findRoot().join();
System.out.println("Root: " + root.getName());

// Find a specific concept
var concept = client.findConcept("Nanomia").join();
concept.ifPresent(c -> System.out.println("Found: " + c.getName()));

// Get all concept names
var names = client.findAllNames().join();
System.out.println("Total concepts: " + names.size());
```

### Authenticated Access (Write Operations)

```java
import org.mbari.vars.oni.sdk.r1.OniKiotaClient;
import java.net.URI;

var client = new OniKiotaClient(
    URI.create("https://your-oni-server.org/kb"),
    "your-api-key"
);

// Create a preference node
var node = new PreferenceNode("myapp", "theme", "dark");
var created = client.create(node).join();
```

### Using Cached Services

For read-heavy workloads, use the cached service implementations:

```java
import org.mbari.vars.oni.sdk.r1.CachedConceptService;
import org.mbari.vars.oni.sdk.r1.OniKiotaClient;

var baseClient = new OniKiotaClient(URI.create("https://your-oni-server.org/kb"));
var cachedService = new CachedConceptService(baseClient);

// First call hits the API
var concept1 = cachedService.findConcept("Nanomia").join();

// Subsequent calls use cache (120 minute TTL)
var concept2 = cachedService.findConcept("Nanomia").join();
```

## Architecture

The SDK has three layers:

1. **Kiota-Generated Layer** (`org.mbari.vars.oni.sdk.kiota.*`) - Auto-generated HTTP client code
2. **Service Interfaces** (`org.mbari.vars.oni.sdk.r1.*`) - High-level async APIs
3. **Factory & Auth** (`org.mbari.vars.oni.sdk.*`) - Client creation and JWT management

See [CLAUDE.md](CLAUDE.md) for detailed architecture documentation.

## Building

```bash
# Compile and run tests
mvn clean verify

# Build without tests
mvn clean package -DskipTests

# Run only unit tests
mvn test

# Run only integration tests
mvn integration-test
```

## To regenerate the SDK

1. Copy the open api yaml file into each project's src/main/resources folder as docs.yaml
2. Some may need the openapi version changed to 3.0.0 as kiota does not support 3.1.0
3. Run the following command in the project's root directory

```shell
kiota generate -l java -c Oni -n org.mbari.vars.oni.sdk.kiota -d src/main/resources/docs.yaml -o ./src/main/java/org/mbari/vars/oni/sdk/kiota
```

## License

Licensed under the Apache License, Version 2.0. See [LICENSE](LICENSE) for details.

## Contributing

Contributions welcome! Please open an issue or pull request on GitHub.
