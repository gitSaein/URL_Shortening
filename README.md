# URL_Shortening
## 1. 기능

URL을 입력받아 짧게 줄이고, 줄인 URL을 입력받으면 원래 URL로 리다이렉트 


## 2. 프로젝트 환경 
```
* back-end: spring boot/maven
* front-end: thymeleaf
* DB: h2
* ORM: JPA
* 알고리즘: Base62 
* port:  80
```

## 3. 문제해결전략


 **에러처리**
 
 
 URL Shortening Key가 8 character초과할 경우 에러처리.
 

 **알고리즘**
  ```
   base62 테이블은 a-z-A-Z-0-9의 순서로 이루어짐.
 
   *encoding 계산법: 
   integer형태로 DB에 저장된 origin url의  key값으로  shortening key url을 구성한다.
 
              62진법: key 값이 2이면, 2/62 -->몫:0 나머지:2  base62테이블 {0:a}{1:b}{2:c} -> localhost/c
                
   *decoding 계산법: 
   shortening key을 decoding 해서 origin url의 key값을 찾는다.
  
              62진법: shortening key 값이 c이면, 2*62^0     -> key = 2
```
## 4.프로젝트 빌드방법
  maven
  
  
## 5.프로젝트 실행 및 테스트
  
  
  **실행방법**
  ```
  1. UrlShorteningApplication.class에서 'run as>spring boot app'  
  2. 도메인 창에  http://localhost/ 입력
  ```
  
  **테스트**
  
  
  @SpringBootTest를 사용한 JUnit 통합 테스트로 MVC test, 알고리즘 테스트 진행
