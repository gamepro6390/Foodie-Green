![header](https://capsule-render.vercel.app/api?type=waving&color=auto&height=300&section=header&text=Foodie-Green&fontSize=90)

### 🖥️ 프로젝트 소개
#
어글리어스란 곳을 참고하여 만든 채소 판매 사이트입니다.

### 🧑‍🤝‍🧑 멤버 구성
#
팀장 : [신장훈](https://github.com/gamepro6390) - (제품 리스트,제품 상세) 페이지,결제 서비스  
팀원 : [신연균](https://github.com/SHIN-YEONGYUN) - 레시피 게시판(CRUD),식단일기 게시판(CRUD),북마크  
팀원 : [김수연](https://github.com/sooyeoning) - 로그인,회원가입,ID 찾기,PW 찾기,마이페이지  
팀원 : [김도현](https://github.com/DoHyunDaniel) - 메인페이지,고객센터  

### 🕰️ 개발기간
#
23.08.10 ~ ing

### ⚙️ 개발환경 
#
FE : 
<img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> 
<img src="https://img.shields.io/badge/css3-1572B6?style=for-the-badge&logo=css3&logoColor=white">
<img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white">  
BE : 
<img src="https://img.shields.io/badge/java-16A5F3?style=for-the-badge&logo=logoColor=white">
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/maven-0C2340?style=for-the-badge&logo=logoColor=white">  
IDE : <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white">  
DB : <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">  
Communication Tools : 
<img src="https://img.shields.io/badge/slack-4A154B?style=for-the-badge&logo=slack&logoColor=white">
<img src="https://img.shields.io/badge/figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white">
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">  
### 📌 주요 기능
#
#### 회원가입 & 로그인 & 마이페이지
**회원가입**
정규식 검사: 이메일(형식: xxx@xxx.xxx), 비밀번호(형식: 숫자+영문자+특수문자 포함 6~15자리), 휴대폰 번호(형식: 010-xxxx-xxxx)
중복 검사: 닉네임, 이메일
**카카오톡 로그인**
OAuth2.0 프로토콜을 사용한 Kakao 로그인
소셜로그인 정보 + 임시 비밀번호 생성 후 DB 저장
카카오 로그인시 회원 정보 수정 페이지로 연결
**로그인**
이메일, 비밀번호 일치 시 로그인 성공
비밀번호 숨김 기능: 기본 숨김으로 설정 -> 아이콘 이용해 비밀번호 노출, 숨김 가능
**회원정보 수정**
닉네임, 비밀번호, 휴대폰 번호 수정가능
중복 검사: 닉네임
**이메일(아이디) 찾기**
이름, 휴대폰 번호 일치 시 아이디 조회 가능
**비밀번호 찾기**
이메일, 휴대폰 번호 일치 시 입력한 이메일로 비밀번호 전송
**회원 탈퇴**
회원 탈퇴

#### 메인페이지 -  
  
![안녕하세요](https://github.com/gamepro6390/Foodie-Green/assets/125335424/6f791c98-7211-49dd-b97f-6e1e3a3a443c)
#### 식단일기  
**게시글 조회**  
식단일기 : 사용자 본인만의 일기로써 써나가며 식단을 조절하고 다른 사용자에게 공유함으로써 공감대 형성  
**글 작성**  
이미지 등록 및 정보 입력 가능  
**글 상세 조회**  
타이틀,좋아요 수,댓글 수,작성자,작성날짜 조회
사용자마다 같은 게시글은 한번만 좋아요 가능(한번 더 누를 경우 좋아요 취소)    
**사용자 본인 글일 경우**  
글 수정,글 삭제 버튼 추가로 조회 가능
글 수정시, 썸네일,내용 모두 수정 가능  
글 삭제시, 게시글 리스트에서 확인 가능

![안녕하세요 (1)](https://github.com/gamepro6390/Foodie-Green/assets/125335424/df6fb9e9-ebcd-4a4f-a0d3-fe0dc1d4b284)
#### 상품페이지 -  
![Footer](https://capsule-render.vercel.app/api?type=waving&color=auto&height=200&section=footer)
