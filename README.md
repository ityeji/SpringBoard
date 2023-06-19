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

**230613** <br>
1. 기타 설정 완료
  > myBatis-spring의 dataSource는 spring jdbc 안에 있는 거 아무거나 써도 된다!
2. Board DAO, Board DTO, Board Service, Board Mapper, Board SQL
3. SubBoard Dao, SubBoard DTO, SubBoard Service, SubBoard Mapper, SubBoard SQL

**230614** <br>
1. root-context.xml에 mybatis-spring:scan 추가
  - myBatis-spring:scan을 추가하면 DAO에 어노테이션을 명시하지 않아도 빈으로 등록된다.
  ``` <mybatis-spring:scan base-package="com.yeji.board.model.dao" /> ```
  > 오류가 났었다! (root-context.xml의 namespace에 mybatis-spring이 없었다!!)
  >> xsi:schemaLocation에서 mybatis-spring 버전이 안맞았기 때문! (2.0 -> 1.2로 변경) <br>
2. bootstrap 설정 완료
3. index.jsp
- boardList 출력 완료

**230615** <br>
1. SubBoard SQL, ~~SubBoard DTO, SubBoard DAO, SubBoard Service, SubBoard Mapper, Mod BoardController~~
- BoardController에 SubBoard를 전부 가져올 수 있는 메소드를 작성한다.
> 진행 중... 갑자기 생각난 건데, 어차피 화면에 subBoard를 전부 리스트업 한 것을 보여줄 필요는 없고, 글 작성하거나, 글 목록 보여줄 때만 필요한 것인데... <br>
>> 그러면, controller, mapper, dao, dto, service 다 필요가 없다! <br>
2. board별 article 목록 jsp 일부 작성
- 드롭박스 내려서 버튼 누르면, url로 boardSeq과 subBoardSeq 넘어가는 것까지 구현!
- url로 데이터 넘겨주려면, 파라미터에 @PathValue 해줘야함!

**230619** <br>
1. mapper에서 patameter가 같은 형으로 여러개이면 parameterType을 하나만 적어줘도 됨.
2. articleMapper에서 boardSeq, subBoardSeq을 둘 다 받을 때 boardSeq으로 받지를 못하고, param1, param2로 받아서, mapper 변수명을 바꿔주었다.
> Request processing failed; nested exception is org.mybatis.spring.MyBatisSystemException: nested exception is org.apache.ibatis.binding.BindingException: Par <br>
3. articleList 출력까지 완성!
4. header.jsp 만들기
> 로그인 했을 때와 안했을 때 상단바 다르게 출력
5. UserSQL, UserMapper, UserDao, User, UserService, UserController
> UserController의 경우, logIn 시 토큰 주기 <br>
> 이메일 인증도 해보자! <br>
> password 중복 체크도 해보자!
  >> 버튼 누르면 postmapping으로 가서, 해당 password가 있는지 확인 후에 있으면 경고창 띄우기
