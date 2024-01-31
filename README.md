# CI-Test [![codecov](https://codecov.io/gh/olillin/CI-Test/branch/main/graph/badge.svg?token=95YZXW0XSY)](https://codecov.io/gh/olillin/CI-Test)
I did it!
## Process
1. Designate a team bot in the yaml settings at [Codecov](https://codecov.io). Either global or for the repository.
```yml
codecov:
  bot: olillin
```
2. Config GitHub Actions workflow with [Gradle Build Action](https://github.com/marketplace/actions/gradle-build-action) and [Codecov](https://github.com/marketplace/actions/codecov) actions. *[See the workflow file](.github/workflows/gradle.yml)*
3. Configure [build.gradle](build.gradle) to generate coverage reports using [JaCoCo](https://docs.gradle.org/current/userguide/jacoco_plugin.html).
4. Run `git update-index --chmod=+x gradlew` to make `gradlew` runnable by GitHub Actions and avoid `Error: Gradle script '/home/runner/**/gradlew' is not executable.`
5. Get badge/shield from https://app.codecov.io/gh/olillin/CI-Test/settings/badge. Alternatively https://shields.io/category/coverage
