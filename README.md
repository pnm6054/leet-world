# leet-world

Kotlin으로 작성한 LeetCode 풀이와 학습 내용을 기록합니다.

## 개발 환경

| 항목 | 버전 |
| --- | --- |
| JDK | 27 |
| Kotlin | 2.4.21 |
| Gradle | 9.8.2 |

빌드에는 JDK 27을 사용합니다. Kotlin 컴파일러의 지원 범위에 맞춰 Kotlin과 Java의 바이트코드 대상은 JVM 26으로 설정했습니다.

Gradle Wrapper가 포함되어 있으므로 Gradle과 Kotlin 컴파일러를 별도로 설치할 필요가 없습니다.

## 시작하기

JDK 27을 설치하고 `JAVA_HOME`을 JDK 설치 폴더로 지정합니다. `PATH`에도 해당 JDK의 `bin` 폴더를 추가하세요. 새 터미널에서 다음 두 명령이 모두 버전 27을 표시해야 합니다.

```sh
java -version
javac -version
```

저장소를 내려받습니다. GitHub에서 ZIP으로 내려받아 압축을 풀어도 됩니다.

```sh
git clone https://github.com/pnm6054/leet-world.git
cd leet-world
```

### 빌드

Windows:

```powershell
.\gradlew.bat build
```

macOS/Linux:

```sh
sh ./gradlew build
```

첫 빌드에는 Gradle과 의존성을 내려받을 인터넷 연결이 필요합니다. 빌드 산출물은 `build/`에 생성되며 Git에 포함되지 않습니다.

## 풀이 작성

풀이 파일은 `src/main/kotlin/` 아래에 작성합니다. 예를 들어 1번 문제의 풀이는 `src/main/kotlin/p0001/Solution.kt`에 작성하고 `package p0001`을 선언할 수 있습니다.

여러 문제를 함께 빌드할 수 있도록 문제별로 패키지를 나누거나 클래스 이름을 다르게 지정하세요.

## VS Code

저장소 폴더를 열고 추천 확장 **Kotlin by JetBrains** (`JetBrains.kotlin-server`)를 설치합니다. Kotlin 파일을 열고 Gradle 프로젝트 분석이 끝나면 자동완성, 함수 인자 안내, 타입 힌트를 사용할 수 있습니다.

- `Ctrl+Space`: 자동완성 후보 표시
- `Ctrl+Shift+B`: 프로젝트 빌드

자동완성 후보가 나오지 않으면 명령 팔레트에서 `IntelliJ: Reload Workspace` 또는 `Developer: Reload Window`를 실행하세요. JDK 환경 변수를 변경했다면 VS Code를 완전히 종료한 뒤 다시 실행합니다.
