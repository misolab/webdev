Docker(docker-compose.yml)를 이용하여 3티어 개발환경 구조를 만들어 봤습니다  
 + WEB - NGINX
 + WAS - Wildfly
 + DB - mariadb  
  
 
### 설치 및 실행  
1. [docker for windows](https://www.docker.com/docker-windows) 혹은 [docker for mac](https://www.docker.com/docker-mac) 설치    
2. git clone 후 /docker 폴더의 ```docker-compose up -d```를 실행
3. hosts파일에 web, was, db를 추가  
    - 예) ```localhost web was db```
    - docker toolbox를 설치한 경우 docker_ip(ex.192.168.99.100) 으로 설정해야함 

### Backend 개발 
1. WAS 배포는 ```mvn clean package```을 통해 WAR 배포
    - war는 ./docker/_deployments에 ROOT.war으로 배포됨
2. 호스트 PC에서 바로 확인할때는 ```mvn spring-boot:run```으로 실행
3. URL 중 리버시 프록시를 추가해야한다면 ./docker/nginx/was.conf에서 설정 

### Frontend 개발
1. ./docker/_webroot밑에 html, css, image등을 놓고 개발

### DB
1. DB 연결정보 (docker-compose.yml 변경 가능)
    - Database / User / PWD : ```joins```
 
### 좀더 해 볼것들  
* backend  
[] WAS 제거하고 springboot로 대체  
[] JPA 추가 

* frontend  
[] webapp 관리도구로 배포하기(webpack)  

* db  
[] db파일 volume으로 빼기   

