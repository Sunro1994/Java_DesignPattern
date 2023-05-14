/*
    StringBuffer는 멀티쓰레드에 안전하도록 동기화되어 있다.
    멀티쓰레드로 작성된 프로그램이 아닌 경우, 성능만 떨어뜨리게 된다.
    쓰레드의 동기화뫈 뺀 StringBuilder가 새로 추가되었다.
    완전히 똑같은 기능으로 작성되어 있다.

    참조변수를 선언한 부분과 생서자만 바꾸면 된다.
 */