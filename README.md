# URL_Shortening
설명 
1. 기능: URL을 입력받아 짧게 줄이고, 줄인 URL을 입력받으면 원래 URL로 리다이렉트 
2. 상세:
webapp URL 입력 폼 제공 -> shortening url 출력( URL Shortening Key 길이 <= 8 character )
shortening url 요청 시, 원래 URL로 리다이렉트 

3. 프로젝트 환경 
**back-end**: spring boot/maven
**front-end**: thymeleaf
**db**: h2
**알고리즘**: Base62 
  -- encoding : Encode base 10 integer to base 62 char from alphabet above
  -- decoding : Decode base 62 char from alphabet above to base 10 integer

4. 문제해결전략
 original url 입력 받고 -> [Base62 encoding] -> url shortening 발급 후 저장
  url_shortening 입력 -> [Base62 decoding] -> DB에서 찾아서 원래 url로 리다이렉트

5.프로젝트 빌드방법

6.프로젝트 실행 및 테스트
