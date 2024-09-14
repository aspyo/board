# CRUD Bulletin Board Project

## 프로젝트 개요

이 프로젝트는 **Spring Framework**와 **JPA**를 사용하여 CRUD 기능을 갖춘 게시판 웹 애플리케이션을 구현한 개인 프로젝트입니다. 사용자 인증, 게시글 및 댓글 관리 기능을 포함하며, 카테고리별 게시글을 조회하고 관리할 수 있는 기능을 제공합니다.

## 주요 기능

### 회원가입, 로그인, 로그아웃 기능
- **회원가입**: 이름, 아이디, 비밀번호, 비밀번호 확인을 입력하여 회원가입.
- **로그인**: 아이디와 비밀번호를 입력하여 로그인.
- **로그아웃**: 세션을 종료하고 로그아웃.

### 게시글 작성, 수정, 삭제 기능
- 게시글 작성 시 로그인이 안 돼 있을 경우, 로그인 페이지로 리디렉션됩니다. 로그인 후 게시글 작성 폼으로 이동합니다.
- 로그인 상태에서만 게시글 작성, 수정, 삭제가 가능하며, 게시글 수정 및 삭제 기능은 게시글 작성자에게만 활성화됩니다.

### 댓글 작성, 삭제 기능
- 댓글 작성 시 로그인이 안 돼 있을 경우, 댓글 입력 칸 대신 로그인 안내 문구가 표시됩니다.
- 로그인 상태에서 댓글 입력과 작성 버튼이 활성화됩니다.
- 댓글 작성자는 자신의 댓글만 삭제할 수 있습니다.

## 페이지 구성

### 메인페이지
- 게시판 카테고리 선택 기능 제공 (예: 백엔드 갤러리, 프론트엔드 갤러리).
- 로그인/회원가입 버튼 (세션 없을 경우) 또는 로그아웃 버튼 (세션 있을 경우).
- 가장 최근 게시글 20개를 조회할 수 있으며, 게시글 제목을 클릭하여 상세페이지로 이동.

### 로그인 페이지
- 로그인 아이디와 비밀번호 입력 후 로그인.
- 회원가입 버튼을 눌러 회원가입 페이지로 이동.

### 회원가입 페이지
- 이름, 아이디, 비밀번호, 비밀번호 확인을 입력하여 회원가입.
- 성공적으로 회원가입 후 로그인 페이지로 리디렉션.

### 카테고리별 게시글 페이지
- 선택한 카테고리에 해당하는 게시글을 조회.
- 게시글 상세페이지로 이동할 수 있는 링크 제공.
- 페이지당 최대 10개의 게시글을 표시하며, 페이징 기능 제공.
- 게시글 작성 버튼을 눌러 게시글 작성 폼으로 이동.

### 게시글 상세페이지
- 게시글 제목, 작성자, 생성일, 내용, 댓글 표시.
- 게시글 작성자에게만 수정 및 삭제 버튼 활성화.
- 댓글 작성자는 자신의 댓글만 삭제할 수 있으며, 댓글 작성 시 로그인 필요.

## 기술 스택
- **프레임워크**: Spring Framework
- **데이터베이스**: JPA (Java Persistence API)
- **템플릿 엔진**: Thymeleaf
- **세션 관리**: HttpSession

## 설치 및 실행

1. **프로젝트 클론**
   ```bash
   git clone https://github.com/yourusername/your-repo-name.git