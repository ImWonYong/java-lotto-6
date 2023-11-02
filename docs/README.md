# 로또

## 기능 요구 사항
- [ ] 구매 금액을 입력받는다. InputManager#receiveUserInput
  - [x] 1000원으로 나누어 떨어지지 않으면 예외 처리한다. InputValidator#validateDivision1000
  - [x] 숫자가 아니면 예외 처리한다. InputValidator#validateIsNumeric
  - [ ] 공백이 있다면 없애버린다.
- [ ] 당첨 번호를 입력받는다.
  - [ ] 쉼표로 구분한다.
  - [ ] 공백이 있다면 없애버린다.
  - [ ] 1-45 숫자가 아니면 예외 처리한다.
  - [ ] 6개의 숫자가 아니면 예외 처리한다.
  - [ ] 숫자에 중복이 있으면 예외 처리한다.
- [ ] 보너스 번호를 입력받는다.
  - [ ] 공백이 있다면 없애버린다. 
  - [ ] 1-45 숫자가 아니면 예외 처리한다.
  - [ ] 당첨 번호와 중복된 숫자가 있으면 예외 처리한다.
- [x] 범위 1-45까지의 숫자를 중복되지 않게 6개 뽑아 로또를 발행한다. LottoNumberGenerator#generateLottoNumber
- [x] 입력 받은 값만큼 로또를 만들어 발행한다. LottoNumberGenerator#generateLottoNumbers
- [ ] 1등부터 5등까지의 금액을 나타낸다.
- [ ] 해당 로또가 몇 등인지 체크한다.
  - [ ] 1등: 6개 일치
  - [ ] 2등: 5개 일치 + 보너스 번호 일치
  - [ ] 3등: 5개 일치
  - [ ] 4등: 4개 일치
  - [ ] 5등: 3개 일치
- [ ] 당첨 내역을 출력한다.
- [ ] 수익률을 계산한다.
  - [ ] 수익률은 소수점 둘째 자리에서 반올림한다.

## 지켜야 할 사항
- [ ] 예외 상황 시 "[ERROR]"로 시작하는 에러 문구를 출력한다.
- [ ] indent depth 3이 넘지 않도록 한다.
- [ ] 3항 연산자를 쓰지 않는다.
- [ ] 함수가 한 가지 일만 하도록 작게 만든다.
  - [ ] 길이 15라인을 넘지 않도록 구현한다.
- 기능 목록이 정상 동작함을 테스트 코드로 확인한다.
- [ ] else를 쓰지 않는다.
- [ ] Java Enum을 적용한다.
- [ ] 도메인 로직에 단위 테스트를 구현한다.
  - [ ] 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 분리한다.
- [ ] camp.nextstep.edu.missionutils.Randoms의 pickUniqueNumbersInRange()를 활용한다.
- [ ] camp.nextstep.edu.missionutils.Console의 readLine()을 활용한다.