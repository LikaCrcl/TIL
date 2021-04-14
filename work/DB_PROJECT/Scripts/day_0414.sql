--검색 결과의 컬럼에 우리가 이용할 이름을 붙여주기
SELECT PLAYER_NAME "선수 이름", HEIGHT 키 FROM PLAYER;

--FROM 절
--테이블명 대신 사용할 별명 지어주기
SELECT PLAYER.* FROM PLAYER;
SELECT p.* FROM PLAYER p;

--STADIUM TABLE에서 경기장 주소, TEAM TABLE에서 전화번호 검색
SELECT STADIUM.ADDRESS, TEAM.TEL FROM STADIUM, TEAM;
SELECT s.ADDRESS, t.TEL FROM STADIUM s, TEAM t; --이렇게 간소화 해줄 수도 있음. s와 t는 이 한 줄 에서만 유효함
SELECT s.ADDRESS "경기장 주소", t.TEL 전화번호 FROM STADIUM s, TEAM t;

--PLAYER TABLE에서 등번호, 선수별명 검색
SELECT BACK_NO 등번호, NICKNAME 선수별명 FROM PLAYER;

--PLAYER TABLE 소속팀 코드, TEAM TABLE 팀 이름 검색
SELECT p.TEAM_ID "소속팀 코드", t.TEAM_NAME "팀 이름" FROM PLAYER p, TEAM t;

--연결 ||
--07-손흥민
SELECT BACK_NO || '-' || PLAYER_NAME "선수정보" FROM PLAYER;

--LIKE
--% : 조건에 부합하는 모든 값 ex) '정%' : '정'으로 시작하는 모든 값 출력. 정, 정모, 정모현
--cf. _ : n번째에 있는 글자를 찾아 출력. ex) '_정%' : 2번째에 '정' 이 있는 모든 값 출력.
SELECT PLAYER_NAME FROM PLAYER WHERE PLAYER_NAME LIKE('김%');

--PLAYER TABLE 김씨, 이씨 선수 검색
SELECT * FROM PLAYER WHERE (PLAYER_NAME LIKE '김%') OR (PLAYER_NAME LIKE '이%');

--PLAYER TABLE 이름에 정 들어가는 선수 검색
SELECT * FROM PLAYER WHERE PLAYER_NAME LIKE '%정%';

--STADIUM 중 경기도에 있는 경기장의 이름과 전화번호 검색
SELECT * FROM STADIUM;
SELECT STADIUM_NAME, NVL2(TEL, DDD || '-' || TEL, '등록 안됨') FROM STADIUM WHERE ADDRESS LIKE '경기도%';
--NVL2(A, 'B', 'C') : A가 NULL이 아니면 'B'를, NULL이면 'C'를 출력

--단일행 함수
--문자함수
SELECT UPPER('HelLo'), LOWER('HelLo') FROM DUAL; --DUAL : 간단한 연산 등을 출력할 때 사용하는 테이블

--숫자함수
SELECT CEIL(3.14), FLOOR(3.14), ROUND(3.14, 1), TRUNC(3.14) FROM DUAL;
SELECT CEIL(-3.14), FLOOR(-3.14), ROUND(-3.14, 1), TRUNC(-3.14) FROM DUAL;
--CEIL : 올림, FLOOR : 내림(흔히 아는 그 내림), ROUND : 반올림, TRUNC : 버림(소수점 아래를 전부 그냥 없앰)

--NULL 처리 함수
--NVL(값, NULL일 경우 대체값)
SELECT PLAYER_NAME, NVL(NICKNAME, '등록안됨') FROM PLAYER;

--NVL2(값, NULL이 아닐 경우 대체 값, NULL일 경우의 값)
SELECT PLAYER_NAME, NVL2(NICKNAME, '등록됨', '등록 안됨') FROM PLAYER;

--형변환 함수
SELECT TO_CHAR(10) FROM DUAL;
SELECT TO_NUMBER('10') FROM DUAL;
SELECT TO_DATE('2021/04/14', 'YYYY/MM/DD') FROM DUAL;
SELECT TO_DATE('2021-04-14 13:24:32', 'YYYY-MM-DD HH24:MI:SS') FROM DUAL; --24시 표기를 하려면 HH24로 꼭 써줘야 함.

--그룹함수(집계함수)
SELECT HEIGHT FROM PLAYER;
SELECT AVG(HEIGHT), SUM(HEIGHT), MAX(HEIGHT), MIN(HEIGHT), COUNT(NVL(HEIGHT,0)) FROM PLAYER; --COUNT는 갯수

--ORDER BY(오름 / 내림차순)
SELECT * FROM PLAYER
ORDER BY HEIGHT;

--PLAYER TABLE 키 순, 몸무게 순으로 검색
SELECT * FROM PLAYER
ORDER BY HEIGHT, WEIGHT DESC; --키순으로 먼저 정렬 후 몸무게 순으로 정렬. 단, 이 때 DESC를 씀으로써 내림차순으로 정렬됨

--K01팀 선수들 이름순으로 오름차순 정렬
SELECT * FROM PLAYER WHERE TEAM_ID = 'K01'
ORDER BY 2;

--ORDER BY는 별칭을 이용해서 정렬 가능
SELECT PLAYER_ID 선수코드, PLAYER_NAME 선수이름 FROM PLAYER
ORDER BY 선수코드;

--GROUP BY / HAVING
--SELECT "POSITION", HEIGHT FROM PLAYER
--GROUP BY "POSITION" HAVING ; --어떤 조건이 각 데이터들에게 적용되는 조건이라면 WHERE에 쓰지만 나뉜 뒤의 그룹에 적용되는 조건은 HAVING

SELECT * FROM T_PROFESSOR;
SELECT * FROM T_STUDENT;
SELECT * FROM T_DEPARTMENT;

SELECT * FROM T_EMP2;
SELECT * FROM T_DEPT2;

SELECT * FROM T_DEPT;
SELECT * FROM T_EMP;

--T_PROFESSOR TABLE 학과별로 교수들의 평균 보너스 검색
SELECT DEPTNO 학과, AVG(BONUS) 평균보너스 FROM T_PROFESSOR GROUP BY DEPTNO;

--EMPLOYEES TABLE에서 JOB_ID별로 평균 SALARY가 10000미만인 그룹의 SALARY 합계, 평균, 최대값, 최소값, 부서 총 인원 검색
--JOB_ID 오름차순 정렬
SELECT * FROM EMPLOYEES;
SELECT * FROM EMPLOYEES GROUP BY JOB_ID;

--부서 별 평균 급여를 검색하되, 평균 급여가 450보다 많은 부서만 검색

--PLAYER TABLE에서 몸무게가 80이상인 선수들의 평균 키가 180 이상인 포지션 검색

--T_PROFESSOR TABLE에서 학과별, 직급별로 교수들의 평균 급여 검색

--T_EMP TABLE에서 매니저(MGR)별로 관리하는 직원들의 직원 수, 급여 총액, 급여 평균, 교통비(COMM) 평균 지급액 검색. 단, 사장님은 제외

--T_PROFESSOR TABLE에서 직위가 정교수 혹은 조교수인 사람 중 과별로 과 번호, 소속교수 총 수, 근속일 평균, 급여 평균, 보너스 평균 검색

--T_STUDENT TABLE에서 학과별(deptno1)로 학과번호, 최대몸무게-최소몸무게 차이 값을 검색


















