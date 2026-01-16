# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build Commands

```bash
# Build the project
mvn clean compile

# Run unit tests
mvn test

# Run integration tests (requires network access to https://gehenna.shore.mbari.org/kb)
mvn verify

# Run a single test
mvn -Dtest=OniKiotaClientIT#testFindRoot test

# Run a single integration test
mvn -Dit.test=OniKiotaClientIT#testFindRoot failsafe:integration-test

# Package JAR
mvn package
```

## Regenerating the Kiota SDK

When the OpenAPI spec changes, regenerate the SDK:

1. Copy the OpenAPI yaml file into `src/main/resources/docs.yaml`
2. If needed, change the openapi version to 3.0.0 (Kiota does not support 3.1.0)
3. Run:
```bash
kiota generate -l java -c Oni -n org.mbari.vars.oni.sdk.kiota -d src/main/resources/docs.yaml -o ./src/main/java/org/mbari/vars/oni/sdk/kiota
```

## Architecture

This is a Java SDK for the Oni microservice (a knowledge base service). It uses Microsoft Kiota for API client generation.

### Package Structure

- `org.mbari.vars.oni.sdk` - Factory classes (`OniFactory`) for creating authenticated/anonymous clients
- `org.mbari.vars.oni.sdk.kiota` - Auto-generated Kiota API client (do not manually edit)
- `org.mbari.vars.oni.sdk.r1` - High-level service interfaces and implementations
- `org.mbari.vars.oni.sdk.r1.models` - Domain models that wrap Kiota models

### Key Components

**Service Interfaces** (`org.mbari.vars.oni.sdk.r1`):
- `ConceptService` - Query concepts in the knowledge base
- `UserService` - User account management
- `PreferencesService` - User preferences CRUD
- `LinkRealizationService` - Link realization operations
- `LinkTemplateService` - Link template operations

**Main Client**: `OniKiotaClient` implements all service interfaces and wraps the Kiota-generated `Oni` client. All methods return `CompletableFuture` for async operations using virtual threads.

**Caching**: `CachedConceptService` wraps `ConceptService` with Caffeine caching (120-minute TTL).

**Authentication**: `OniFactory.create(baseUrl, apiKey)` creates an authenticated client; `OniFactory.create(baseUrl)` creates a read-only anonymous client.

### Testing

Integration tests (`*IT.java`) require network access to the Oni service. They use the Maven Failsafe plugin and run during `mvn verify`.
