--�˻� ����� �÷��� �츮�� �̿��� �̸��� �ٿ��ֱ�
SELECT PLAYER_NAME "���� �̸�", HEIGHT Ű FROM PLAYER;

--FROM ��
--���̺�� ��� ����� ���� �����ֱ�
SELECT PLAYER.* FROM PLAYER;
SELECT p.* FROM PLAYER p;

--STADIUM TABLE���� ����� �ּ�, TEAM TABLE���� ��ȭ��ȣ �˻�
SELECT STADIUM.ADDRESS, TEAM.TEL FROM STADIUM, TEAM;
SELECT s.ADDRESS, t.TEL FROM STADIUM s, TEAM t; --�̷��� ����ȭ ���� ���� ����. s�� t�� �� �� �� ������ ��ȿ��
SELECT s.ADDRESS "����� �ּ�", t.TEL ��ȭ��ȣ FROM STADIUM s, TEAM t;

--PLAYER TABLE���� ���ȣ, �������� �˻�
SELECT BACK_NO ���ȣ, NICKNAME �������� FROM PLAYER;

--PLAYER TABLE �Ҽ��� �ڵ�, TEAM TABLE �� �̸� �˻�
SELECT p.TEAM_ID "�Ҽ��� �ڵ�", t.TEAM_NAME "�� �̸�" FROM PLAYER p, TEAM t;

--���� ||
--07-�����
SELECT BACK_NO || '-' || PLAYER_NAME "��������" FROM PLAYER;

--LIKE
--% : ���ǿ� �����ϴ� ��� �� ex) '��%' : '��'���� �����ϴ� ��� �� ���. ��, ����, ������
--cf. _ : n��°�� �ִ� ���ڸ� ã�� ���. ex) '_��%' : 2��°�� '��' �� �ִ� ��� �� ���.
SELECT PLAYER_NAME FROM PLAYER WHERE PLAYER_NAME LIKE('��%');

--PLAYER TABLE �达, �̾� ���� �˻�
SELECT * FROM PLAYER WHERE (PLAYER_NAME LIKE '��%') OR (PLAYER_NAME LIKE '��%');

--PLAYER TABLE �̸��� �� ���� ���� �˻�
SELECT * FROM PLAYER WHERE PLAYER_NAME LIKE '%��%';

--STADIUM �� ��⵵�� �ִ� ������� �̸��� ��ȭ��ȣ �˻�
SELECT * FROM STADIUM;
SELECT STADIUM_NAME, NVL2(TEL, DDD || '-' || TEL, '��� �ȵ�') FROM STADIUM WHERE ADDRESS LIKE '��⵵%';
--NVL2(A, 'B', 'C') : A�� NULL�� �ƴϸ� 'B'��, NULL�̸� 'C'�� ���

--������ �Լ�
--�����Լ�
SELECT UPPER('HelLo'), LOWER('HelLo') FROM DUAL; --DUAL : ������ ���� ���� ����� �� ����ϴ� ���̺�

--�����Լ�
SELECT CEIL(3.14), FLOOR(3.14), ROUND(3.14, 1), TRUNC(3.14) FROM DUAL;
SELECT CEIL(-3.14), FLOOR(-3.14), ROUND(-3.14, 1), TRUNC(-3.14) FROM DUAL;
--CEIL : �ø�, FLOOR : ����(���� �ƴ� �� ����), ROUND : �ݿø�, TRUNC : ����(�Ҽ��� �Ʒ��� ���� �׳� ����)

--NULL ó�� �Լ�
--NVL(��, NULL�� ��� ��ü��)
SELECT PLAYER_NAME, NVL(NICKNAME, '��Ͼȵ�') FROM PLAYER;

--NVL2(��, NULL�� �ƴ� ��� ��ü ��, NULL�� ����� ��)
SELECT PLAYER_NAME, NVL2(NICKNAME, '��ϵ�', '��� �ȵ�') FROM PLAYER;

--����ȯ �Լ�
SELECT TO_CHAR(10) FROM DUAL;
SELECT TO_NUMBER('10') FROM DUAL;
SELECT TO_DATE('2021/04/14', 'YYYY/MM/DD') FROM DUAL;
SELECT TO_DATE('2021-04-14 13:24:32', 'YYYY-MM-DD HH24:MI:SS') FROM DUAL; --24�� ǥ�⸦ �Ϸ��� HH24�� �� ����� ��.

--�׷��Լ�(�����Լ�)
SELECT HEIGHT FROM PLAYER;
SELECT AVG(HEIGHT), SUM(HEIGHT), MAX(HEIGHT), MIN(HEIGHT), COUNT(NVL(HEIGHT,0)) FROM PLAYER; --COUNT�� ����

--ORDER BY(���� / ��������)
SELECT * FROM PLAYER
ORDER BY HEIGHT;

--PLAYER TABLE Ű ��, ������ ������ �˻�
SELECT * FROM PLAYER
ORDER BY HEIGHT, WEIGHT DESC; --Ű������ ���� ���� �� ������ ������ ����. ��, �� �� DESC�� �����ν� ������������ ���ĵ�

--K01�� ������ �̸������� �������� ����
SELECT * FROM PLAYER WHERE TEAM_ID = 'K01'
ORDER BY 2;

--ORDER BY�� ��Ī�� �̿��ؼ� ���� ����
SELECT PLAYER_ID �����ڵ�, PLAYER_NAME �����̸� FROM PLAYER
ORDER BY �����ڵ�;

--GROUP BY / HAVING
SELECT "POSITION", AVG(HEIGHT) FROM PLAYER
GROUP BY "POSITION" HAVING AVG(HEIGHT) > 180; --� ������ �� �����͵鿡�� ����Ǵ� �����̶�� WHERE�� ������ ���� ���� �׷쿡 ����Ǵ� ������ HAVING

SELECT * FROM T_PROFESSOR;
SELECT * FROM T_STUDENT;
SELECT * FROM T_DEPARTMENT;

SELECT * FROM T_EMP2;
SELECT * FROM T_DEPT2;

SELECT * FROM T_DEPT;
SELECT * FROM T_EMP;

--T_PROFESSOR TABLE �а����� �������� ��� ���ʽ� �˻�
SELECT DEPTNO �а�, AVG(BONUS) ��պ��ʽ� FROM T_PROFESSOR GROUP BY DEPTNO;

--EMPLOYEES TABLE���� JOB_ID���� ��� SALARY�� 10000�̸��� �׷��� SALARY �հ�, ���, �ִ밪, �ּҰ�, �μ� �� �ο� �˻�
--JOB_ID �������� ����
SELECT * FROM EMPLOYEES;
SELECT JOB_ID �μ�, SUM(SALARY) �հ�, AVG(SALARY) ���, MAX(SALARY) �ִ밪, MIN(SALARY) �ּҰ�, COUNT(EMPLOYEE_ID) �ο�
FROM EMPLOYEES 
GROUP BY JOB_ID HAVING AVG(SALARY) < 10000
ORDER BY �μ�;

--T_PROFESSOR TABLE���� �μ� �� ��� �޿��� �˻��ϵ�, ��� �޿��� 450���� ���� �μ��� �˻�
SELECT DEPTNO �μ�, AVG(PAY) ��ձ޿� FROM T_PROFESSOR GROUP BY DEPTNO HAVING AVG(PAY) > 450;

--PLAYER TABLE���� �����԰� 80�̻��� �������� ��� Ű�� 180 �̻��� ������ �˻�
SELECT * FROM PLAYER;
SELECT "POSITION" "180/80 �̻��� ������", AVG(HEIGHT) FROM PLAYER WHERE WEIGHT >= 80 GROUP BY "POSITION" HAVING AVG(HEIGHT) >= 80; 

--T_PROFESSOR TABLE���� �а���, ���޺��� �������� ��� �޿� �˻�
SELECT DEPTNO �а�, "POSITION" ����, AVG(PAY) ��ձ޿� FROM T_PROFESSOR GROUP BY DEPTNO, "POSITION";

--T_EMP TABLE���� �Ŵ���(MGR)���� �����ϴ� �������� ���� ��, �޿� �Ѿ�, �޿� ���, �����(COMM) ��� ���޾� �˻�. ��, ������� ����
SELECT * FROM T_EMP;
SELECT MGR �Ŵ���, COUNT(EMPNO) "���� ��", SUM(SAL) "�޿� �� ��", AVG(SAL) "�޿� ���", AVG(COMM) "����� ��� ���޾�" FROM T_EMP WHERE JOB NOT IN('PRESIDENT') GROUP BY MGR;
																										-- ���� NOT IN ���� �ߴµ� MGR IS NOT NULL �� �ص� ��.

--T_PROFESSOR TABLE���� ������ ������ Ȥ�� �������� ��� �� ������ �� ��ȣ, �Ҽӱ��� �� ��, �ټ��� ���, �޿� ���, ���ʽ� ��� �˻�
SELECT * FROM T_PROFESSOR;					 --�Ϸ�+2�ð� ���ص� ��Ʋ �� �� ���̹Ƿ� �ø� ó�� --SYSDATE��� ���� ���ó�¥.
SELECT DEPTNO "�� ��ȣ", COUNT(PROFNO) "�Ҽӱ��� �� ��", CEIL(AVG(TO_DATE('2021/04/14', 'YYYY/MM/DD') - HIREDATE)) "�ټ��� ���", AVG(PAY) "�޿� ���", NVL(AVG(BONUS), 0) "���ʽ� ���"
FROM T_PROFESSOR WHERE ("POSITION" LIKE('������')) OR ("POSITION" LIKE('������'))
						-- "POSITION" IN('������', '������') : POSITION(�÷�)	�� ���� �ڿ� ���� ���� �� ������ TRUE
GROUP BY DEPTNO;

--T_STUDENT TABLE���� �а���(deptno1)�� �а���ȣ, �ִ������-�ּҸ����� ���� ���� �˻�

















