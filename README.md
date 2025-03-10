# android-memo

### 프로그래밍 요구사항
- MVVM 아키텍처로 구현한다.
- ViewModel의 모든 로직에 대한 단위 테스트를 작성한다.
- SQLite를 사용하지 않고 메모리에만 저장한다.
- 데이터를 저장하거나 저장된 데이터를 읽어오는 로직은 data 모듈에 위치해야 한다.
- 도메인과 연관된 핵심 비즈니스 로직은 domain 모듈에 위치해야 한다

## Step1 - 모듈 분리

프로그래밍 요구 사항
- 순수 코틀린 모듈인 domain 모듈을 만든다.
- 순수 코틀린 모듈인 data 모듈을 만든다.
- data 모듈은 domain 모듈에 의존해야 한다.
- app 모듈은 domain 모듈에 의존해야 한다.

## Step2 - 메모 ( Create, Read )

### 요구 사항
- 리스트 형태의 메모 앱을 구현한다.
- + 버튼을 누르면 화면에 텍스트를 입력할 수 있는 추가 화면이 떠야 한다.
- 추가 화면에는 텍스트 입력 칸, 취소 버튼, 확인 버튼이 있어야 한다.
- 추가 화면에서 텍스트를 입력하고 확인 버튼을 누르면 메모가 저장되고 리스트 화면에는 저장한 메모가 업데이트되어야 한다.


## Step3 - 메모 (Update, Delete)

### 요구 사항
- 메모 리스트 아이템 하나를 길게 누르면 삭제 다이얼로그가 떠야 한다.
- 삭제 다이얼로그에는 취소 버튼, 확인 버튼이 있어야 한다.
- 삭제 다이얼로그의 확인 버튼을 누르면 해당 메모가 삭제되어야 한다.
- 메모 리스트 아이템 하나를 짧게 누르면 해당 메모를 수정할 수 있는 화면이 떠야 한다.

## Step4 - 메모 (리팩터링)

### 요구사항
- app 모듈은 data 모듈의 구현체에 의존하지 않아야 한다.
- 모듈 간 의존성은 상관없음
- 즉, app 모듈이 data 모듈에 의존해도 되지만 구현체 클래스는 참조해서는 안됨
- data 모듈의 구현체는 모두 internal class여야 한다.

