# DEMO
유튜브에서 [하찮은오후](https://www.youtube.com/playlist?list=PLeMeDIV7bypvyxWv7eIUZubmfx9W-Jjdg) 님의 강의가 재미있어보여서 따라해보는 프로젝트

## 1.웹 ..

---

## 2. DB
-  TypeHandler를 통해서, mybatis의 필드도 객체를 받을 수 있다
---

## 3. 보안
- UserDetailsService :  사용자 세부 정보 (DB에서 조회할 때 사용)
- AuthenticationProvider : `authenticate(Authentication authentication)` 실제 사용자 인증 수행
- AuthenticationManager : 인증 요청을 적절한 `AuthenticationProvider`에 위임
- 
---

## 4. 베포
<details>
    <summary>
        <span style="color:red">주의점</span>
    </summary>
  당연한 소리겠지만, 도커 컨테이너에서의 localhost는 도커 컨테이너 자체이기 때문에
  알맞은 DB 경로를 지정해줘야 한다
</details> 

- `./gradlew clean build` 로 jar파일 생성
- dockerfile 생성 
    ```agsl
    # DOCKFILE
    FROM openjdk:17.0.2-jdk  //이미지
    VOLUME /tmp //볼륨
    ARG JAR_FILE // 인자
    COPY ${JAR_FILE} app.jar //인자로 받은 JAR파일을 app.jar로 복사
    ENTRYPOINT ["java","-jar","/app.jar"] // 시작할때 사용할 명령어 (java -jar /app.jar )
    ```
- build로 이미지 만들기 <br>
  `docker build --build-arg JAR_FILE=build/libs/demo-0.0.1-SNAPSHOT.jar -t demo -f ./etc/docker/DockerFile .`

- 실행
---