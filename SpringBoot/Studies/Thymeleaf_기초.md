# Spring Boot Study - Thymeleaf
## 1. 템플릿 엔진이란  ?
'템플릿 엔진'은 템플릿 양식과 특정 데이터 모델에 따른 입력 자료를 합성하여 결과 문서를 출력하는 소프트웨어 또는 소프트웨어 컴포넌트를 말한다. 특히, 웹 템플릿 엔진은 웹 문서가 출력되는 템플릿 엔진을 말한다.

즉, 웹 템플릿 엔진은 템플릿 양식과 데이터가 합쳐져서 HTML 문서를 출력하는 소프트 웨어를 말한다. 

템플릿 엔진이 무엇인지 먼저 알아본 이유는 Thymeleaf 가 이러한 템플릿 엔진의 일종이기 때문이다. 정확히는 '서버 사이드 템플릿 엔진'이라 하며 서버에서 DB 혹은 API 가져온 데이터를 미리 정의된 템플릿에 넣어 HTML 문서를 만들어 클라이언트에 전달해주는 역활을 해주는 역할을 한다.

---
## 2. Thymeleaf 란?
위에서도 잠깐 설명했듯이, 템플릿 엔진의 일종으로 HTML 태그에 속성을 추가해 페이지에 동적으로 값을 추가하거나 처리할 수 있게 해준다.

타임리프를 통해서 백엔드 쪽에서 클라이언트에게 응답할 브라우저 화면을 만들어 주는 역할을 한다. 타임리프는 기존의 템플릿 엔진과 아래와 같은 차별점이 있다.
-  서버상에서 동작하지 않아도 된다.
-  순수 HTML 구조를 가진다.

위 차별점이 중요한 이유는 기존의 템플릿으로는 항상 서버를 구동시켜 결과물을 확인해야 하지만 타임리프의 경우 static 파일을 사용하여 해당 내용을 브라우저에서 바로 확인할 수 있다는 장점이 있다. 이것이 가능한 이유는 타임리프가 HTML 속성(Attribute) 기반으로 작성되기 때문에 기존의 HTML 구조를 건드리지 않기 때문이다.

---

### 3. 기본 문법 알아보기
#### 3-1. 설정
##### :memo: **xmlns:th=""**
```html
<html lang="en" xmlns:th="http://www.thymeleaf.org">
```
-  타임리프의 th 속성을 사용하기 위해 선언된 네임스페이스이다.
-  순수 HTML로만 이루어진 페이지인 경우 선언하지 않아도 된다.
<br></br>

#### 3-2. 기본 기능

##### :memo: **th:text="${}"**
```html
<div th:text="${data}"></div>
```
-  JSP의 EL 표현식인 ${}와 마찬가지로 ${} 표현식을 사용해서 컨트롤러에서 전달받은 데이터에 접근할 수 있다.

##### :memo: **th:href="@{}"**
```html
<body>
  <a th:hrf="@{/boardListPage?currentPageNum={page}}"></a>
</body>
```
-  `<a> `태그의 href 속성과 동일하다.
-  괄호안에 클릭시 이동하고자 하는 url을 입력하면 된다.

##### :memo: **th:with=${}**
```html
<div th:with=”userId=${number}” th:text=”${usesrId}”>
```
-  변수 형태의 값을 재정의하는 속성이다. 즉, `th:with`를 이용하여 새로운 변수값을 생성할 수 있다.

##### :memo: **th:value="${}"**
```html
<input type="text" id="userId" th:value="${userId} + '의 이름은 ${userName}"/>
```
-  input의 vaule에 값을 삽입할 때 사용한다.
-  여려개의 값을 넣을땐 + 기호를 사용한다.
<br></br>
#### 3-3. Layout
##### :memo: **th:block**
```html
<html lagn="ko" 
      xmlns:th="http://www.thymeleaf.org"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<body>
  	//전체 레이아웃
	<th:block th:fragment="footerFragment">
 	</th:block>
</body>  
  
</html>
```
-  block은 타임리프 표현을 어느 곳에서든 사용할 수 있도록 하는 구문이다.
-  해당 기능은 동적인 처리가 필요할 때 사용된다. 주로 layout 기능이나 switch에 사용이 많이 된다.

##### :memo: **th:fragment**
```html
<head th:fragment="head(title)"> // 매개 변수를 받을 수 있다!
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <link href="starter-template.css" th:href="@{/starter-template.css}" rel="stylesheet">

    <title th:text="${title}">Hello, Spring Boot!</title>
</head>
```
-  웹페이지의 메뉴 탭이나 네비게이션바와 같이 공통으로 반복해서 나타나는 영역이 존재한다. 이 공통 영역들을 매 페이지마다 HTML 코드와 반복해서 쓰면 코드가 지저분해지거나 귀찮아 지는데 fragment를 이용하여 공통 영역을 정의하여 코드를 정리할 수 있다.
-  또 `th:fragment="head(title)"` 이런 식으로 정의하여 괄호안에 전달받을 파라미터를 넣어 선언할 수 있다. 이 파라미터를 `th:text="${title}"` 이렇게 받아 사용할 수 있다.
-  `th:replace"[파일경로 :: 조각 이름]"` 을 통해 HTML 파일에서 삽입할 수 있다.

##### :memo: **th:replace="[파일 경로 :: fragment 이름]"**
```html
<head th:replace="fragments/common :: head('게시판')">
```
-  JSP의 <include> 태그와 유사한 속성이다.
-  fragment로 조각화한 공통 영역을 HTML에 삽입하는 역할을 ㅎ란다.
-  `::` 기준으로 앞은 fragment가 존재하는 경로 뒤에는 fragment 의 이름을 넣어준다.
-  insert와는 다르게 완전하게 대체한다.

##### :memo: **th:insert="[파일 경로 :: fragment 이름]"**
```html
<head th:insert="fragments/common :: head('게시판')">
```
-  `insert`는 태그 내로 fragment를 삽입하는 방법이다. `replace`는 완전하게 대체하기 때문에 `replace` 태그가 입력된 `<div>`가 사라지고 `fragment`로 조각화한 코드가 완전히 대체된다. 하지만 `insert`는 `insert`가 입력된 `<div>`안에 `fragment`를 삽입하는 개념이기 때문에 `<div>`안에 조각화한 코드가 삽입된다.
-  형식은 `replace`와 동일하다.

<br></br>

#### 3-4. Form
##### :gem: `예시코드`
```html
<body>
  <form th:action="@{/join}" th:object="${joinForm}" method="post">
    <input type="text" id="userId" th:field="*{userId}" >
    <input type="password" id="userPw" th:field="*{userPw}" >
  </form>
</body>
```

##### :memo: **th:action="@{}"**
-  `<form>` 태그 사용시, 해당 경로로 요청을보낼 때 사용한다.

##### :memo: **th:object="${}"**
-  `<form>` 태그에서 데이터를 보내기 위해 Submit을 할 때 데이터가 `th:object` 속성을 통해 object 에 지정한 객체에 값을 담아 넘긴다. 이 때 값을 `th:field` 속성과 함께 사용하여 넘긴다.
-  Controller 와 View 사이의 DTO 클래스 객체라고 생각하면 된다.

##### :memo: **th:field="*{}"**
-  `th:object` 속성과 함께 `th:field` 를 이용해서 HTML 태그에 멤버 변수를 매핑할 수 있다.
-  `th:field` 을 이용한 사용자 입력 필드는 id, name, value 속성 값이 자동으로 매핑된다.
-  `th:object` 와 `th:field` 는 Controller에서 특정 클래스의 객체를 전달 받은 경우에만 사용이 가능하다. 

<br></br>

#### 3-5. 조건문과 반복문
##### :memo: **th:if="${}"**
##### :memo: **th:unless="${}"**
```html
 <span class="sr-only" th:if="${menu} == 'home'">(current)</span>
 <span class="sr-only" th:unless="${menu} == 'board'"></span>
```
- Java의 조건문에 해당하는 속성이다. 각 각 `if` 와 `else` 를 뜻한다.
- `th:unless`는 일반적인 언어의 `else` 문과는 달리 `th:if`에 들어가는 조건과 동일한 조건을 지정해야 한다.

##### :memo: **th:each="변수 : ${list}"**
```html
<body>
  <li th:each="pageButton" : ${#numbers.sequece(paging.firstPage, paging.lastPage)}></li>
</body>
```
- Java `for문`을 뜻한다.
- `${list}` 로 받아온 값을 변수로 하나씩 가져온다는 뜻으로, 변수의 이름은 임의대로 지정 가능하다.

##### :memo: **th:switch, th:case**
```html
<th:block th:switch="${userNum}"> 
  <span th:case="1">권한1</span> 
  <span th:case="2">권한2</span> 
</th:block>
```
- Java의 `Switch-Case`문과 동일하다.
- `Switch-Case`문으로 제어할 태그 `th:block`으로 설정하고, 그 안에 코드를 작성한다.

---
