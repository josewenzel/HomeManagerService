# Home Manager Service

[![HomeManager](https://circleci.com/gh/josewenzel/HomeManagerService.svg?style=shield)](https://circleci.com/gh/josewenzel/HomeManagerService)

This is a backend service for my imaginary application written in _Kotlin_, is used to manage my house from finances.

## Tools and Frameworks

- [Strikt](https://strikt.io/): Is a fluent testing library that uses Junit5's runner.
- [MockK](https://mockk.io/): A simple and powerful mocking library.
- [Ktlint](https://pinterest.github.io/ktlint/): An opinionated linter.

## Infrastructure

### CI

I'm currently using [CircleCI](https://app.circleci.com/pipelines/github/josewenzel/HomeManagerService) as my CI tool, I
develop my application in a truck based way so the only branch I care to track (as there are no others) is `main`.