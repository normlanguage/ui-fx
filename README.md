# ui.fx

[English](README.md) | [简体中文](README.zh-CN.md)

Module identity and dependencies: [module.norm](ui/fx/module.norm). Package toolchain: [workflow](.github/workflows/package.yml).

Build: `norm package ui/fx --output build/repository`.

Tests: `norm test ui/fx`.

Validated on Windows x64 with JVM execution and Native application startup. JavaFX artifacts are resolved from Maven Central; Norm packages are distributed through GitHub Releases.

[Sample ownership](samples/README.md).
