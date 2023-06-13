# 개인 게시판 만들기 프로젝트
(230606~) <br>
## 프로젝트 설명
일본 여행에 대해 자유롭게 의견을 나눌 수 있는 여행 게시판을 만든다.
## 참여자
- 정예지
  - BackEnd
  - DataBase
  - FrontEnd
## 사용 기술
**BackEnd** <br>
- Spring
- MySQL
- MyBatis <br>

**FrontEnd** <br>
- JSP
- BootStrap

## DailyCheck
**230606** <br>
1. 세부 기능 구상하기 (Spring으로만 못하는 것들은 나중에 Vue.js 연동 프로젝트 때 만들자)
  - 글쓰기는 로그인 한 유저만 가능
  - 로그인이 맞지 않으면, 회원가입 창으로 이동
  - 회원가입이 완료되면, 로그인 창으로 이동
  - 날씨도 따오고 싶다... (추후 공부 필요)
  - 게시글 수정, 삭제, 좋아요 가능
  - 댓글은 로그인 유저만 작성 가능
  - 각 게시판은 세부 분류가 있음(드롭박스로 이동 가능) -> 이건 그럼 subBoard로 따로 sql문을 만들어 줘야겠다!
    - 이런저런(자유게시판)
    - 이거 좋아요!(여행 정보 공유)
    - 이건 어떄요?(여행 정보 질문)
  - 마이페이지에는 회원 정보와 좋아요 한 글 리스트업

2. 프론트 디자인(목업 만들기)
https://ovenapp.io/view/Re1ht00g3nYZH3Tmb5dL5bYhtO0SDlsY/

**230612**<br>
1. bootstrap 설정
2. common.jsp 제작
> bootstrap.jsp <br>
> header.jsp
3. servlet-context.xml, root-context.xml, web.xml 설정 완료

**230613**
1. 기타 설정 완료
2. Board DAO, Board DTO, Board Service, Board Mapper, Board SQL
3. SubBoard Dao, SubBoard DTO, SubBoard Service, SubBoard Mapper, SubBoard SQL
