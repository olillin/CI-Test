# CI-Test [![codecov](https://codecov.io/gh/OliTheHoodieBoi/CI-Test/branch/main/graph/badge.svg?token=95YZXW0XSY)](https://codecov.io/gh/OliTheHoodieBoi/CI-Test)
I did it!
## Process
1. Designate a team bot in the yaml settings at [Codecov](https://codecov.io). Either global or for the repository.
```yml
codecov:
  bot: OliTheHoodieBoi
```
2. Config GitHub actions workflow with [Gradle Build Action](https://github.com/marketplace/actions/gradle-build-action) and [Codecov](https://github.com/marketplace/actions/codecov) actions. *[See the workflow file](.github/workflows/gradle.yml)*
3. Configure [build.gradle](build.gradle) to generate coverage reports using [JaCoCo](https://docs.gradle.org/current/userguide/jacoco_plugin.html).
4. Get badge/shield from https://app.codecov.io/gh/OliTheHoodieBoi/CI-Test/settings/badge. Alternatively https://shields.io/category/coverage
