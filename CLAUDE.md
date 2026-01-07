# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Java SDK for the Oni microservice, a knowledgebase API for managing taxonomic concepts, associations, and preferences. The SDK is generated using Microsoft Kiota and provides both low-level auto-generated clients and higher-level service abstractions.

## Build Commands

### Compile and package
```bash
mvn clean package
```

### Run all tests (unit + integration)
```bash
mvn verify
```

### Run only unit tests
```bash
mvn test
```

### Run only integration tests
```bash
mvn integration-test
```

### Run a single test class
```bash
mvn test -Dtest=SanityTest
```

### Run a single integration test
```bash
mvn integration-test -Dit.test=OniKiotaClientIT
```

### Generate javadocs
```bash
mvn javadoc:javadoc
```

### Build without tests
```bash
mvn clean package -DskipTests
```

## Code Architecture

### Multi-Layer Design

The SDK has three distinct layers:

1. **Kiota-Generated Layer** (`org.mbari.vars.oni.sdk.kiota.*`)
   - Auto-generated from OpenAPI specification (src/main/resources/docs.yaml)
   - Low-level HTTP client code
   - Do NOT manually edit files in this package - they are regenerated from the OpenAPI spec

2. **Service Interface Layer** (`org.mbari.vars.oni.sdk.r1.*`)
   - High-level service interfaces: `ConceptService`, `UserService`, `PreferencesService`
   - Provides clean, idiomatic Java API using CompletableFuture
   - `OniKiotaClient` implements all three service interfaces

3. **Factory & Authentication** (`org.mbari.vars.oni.sdk.*`)
   - `OniFactory`: Creates configured Oni client instances with/without authentication
   - `OniAccessTokenProvider`: Handles JWT token authentication via API keys

### Key Design Patterns

**Async-First API**: All service methods return `CompletableFuture<T>`. The SDK uses virtual threads (Java 21+) via `Executors.newVirtualThreadPerTaskExecutor()` for efficient concurrent operations.

**Caching Services**: `CachedConceptService` and `CachedPreferencesService` wrap the base services with Caffeine caching. These cache concept hierarchies, templates, and names with 120-minute expiration. Use for read-heavy workloads.

**Model Mapping**: Models in `r1.models` package provide conversion methods:
- `fromKiota(kiotaModel)` - Convert from auto-generated Kiota models
- `toKiota()` / `toKiotaCreate()` / `toKiotaUpdate()` - Convert to Kiota models

### Authentication

The SDK supports two modes:
- **Authenticated**: Pass API key to `OniFactory.create(baseUrl, apiKey)` for write operations
- **Anonymous**: Use `OniFactory.create(baseUrl)` for read-only operations

JWT tokens are automatically managed by `OniAccessTokenProvider`, which refreshes expired tokens.

## Regenerating SDK from OpenAPI

When the Oni API changes, regenerate the Kiota-generated code:

1. Copy the new OpenAPI spec to `src/main/resources/docs.yaml`
2. Ensure OpenAPI version is 3.0.0 (Kiota doesn't support 3.1.0)
3. Run:
```bash
kiota generate -l java -c Oni -n org.mbari.vars.oni.sdk.kiota -d src/main/resources/docs.yaml -o ./src/main/java/org/mbari/vars/oni/sdk/kiota
```

## Project Configuration

- **Java Version**: 21 (uses virtual threads)
- **Module Name**: `org.mbari.vars.oni.sdk`
- **Maven Central Publishing**: Configured with GPG signing and central-publishing-maven-plugin
- **Test Framework**: JUnit 5
- **Key Dependencies**:
  - Microsoft Kiota for HTTP client generation
  - Caffeine for caching
  - Auth0 JWT for token validation
  - OkHttp for HTTP operations
