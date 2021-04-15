--JOIN
SELECT p.PLAYER_NAME, t.TEAM_NAME
FROM PLAYER p JOIN TEAM t --FROM PLAYER p, TEAM t ��� ���Ŷ� ����
ON p.TEAM_ID = t.TEAM_ID; --ON�� JOIN�� FROM���� ����. ON�� WHERE�� �ٲٰ� WHERE���� �ᵵ ��

--PLAYER, TEAM 
--������ ������ ���� ���� ��ȭ��ȣ �˻�
SELECT * FROM PLAYER;
SELECT * FROM TEAM;
SELECT p.PLAYER_NAME �̸�, t.TEAM_NAME "�� �̸�", t.TEL ��ȭ��ȣ FROM PLAYER p, TEAM t WHERE p.TEAM_ID = t.TEAM_ID AND p.PLAYER_NAME = '������';

--EMPLOYEES, JOBS
--�� �̸�, EMAIL, JOB_TITLE
SELECT * FROM EMPLOYEES;
SELECT * FROM JOBS;
SELECT e.LAST_NAME ��, e.FIRST_NAME �̸�, e.EMAIL �̸���, j.JOB_TITLE ���� FROM EMPLOYEES e, JOBS j WHERE e.JOB_ID = j.JOB_ID;

--T_STUDENT, T_DEPARTMENT
--�л��̸� , 1���� �а���ȣ, 1���� �а��̸�
SELECT * FROM T_STUDENT;
SELECT * FROM T_DEPARTMENT;
SELECT s.NAME �̸�, d.DEPTNO �а���ȣ, d.DNAME �а��� FROM T_STUDENT s, T_DEPARTMENT d WHERE s.DEPTNO1 = d.DEPTNO;

--T_STUDENT, T_PROFESSOR
--�л��̸�, �������� ��ȣ, �������� �̸�
SELECT * FROM T_STUDENT;
SELECT * FROM T_PROFESSOR;
SELECT s.NAME �л��̸�, p.PROFNO "�������� ��ȣ", p.NAME "�������� �̸�" FROM T_STUDENT s, T_PROFESSOR p WHERE s.DEPTNO1 = p.DEPTNO AND p."POSITION" = '������';

--T_STUDENT, T_DEPARTMENT, T_PROFESSOR
--�л��̸�, �а��̸�, �������� �̸�
SELECT * FROM T_STUDENT;
SELECT * FROM T_DEPARTMENT;
SELECT * FROM T_PROFESSOR;
SELECT s.NAME �л��̸�, d.DNAME �а��̸�, p.NAME ���������̸�
FROM T_STUDENT s, T_DEPARTMENT d, T_PROFESSOR p
WHERE s.DEPTNO1 = d.DEPTNO AND s.PROFNO = p.PROFNO;

SELECT s.NAME, d.DNAME, p.NAME
FROM T_STUDENT s
	JOIN T_DEPARTMENT d ON s.DEPTNO1 = d.DEPTNO
	JOIN T_PROFESSOR p ON s.PROFNO = p.PROFNO
;

--������
--EMPLOYEES, DEPARTMENTS
--95~97�⵵ �Ի� ���� �̸�, �Ի���, �μ��� �˻� �� �Ի��� ������� ����
SELECT e.LAST_NAME, e.HIRE_DATE, d.DEPARTMENT_NAME
FROM EMPLOYEES e, DEPARTMENTS d
WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID --�ٵ� ��� �� ���� ������ �������. �������� ��ȣ(=) ���� �� ����
AND TO_CHAR(e.HIRE_DATE, 'YYYY') >= '1995' AND TO_CHAR(e.HIRE_DATE, 'YYYY') <= '1997'--TO_CHAR((��¥), 'YYYY') : ��¥���� �⵵�� ������ ���ڿ��� ��ȯ.
ORDER BY e.HIRE_DATE;
--ON���� JOIN�� �Ǹ鼭 ����ǰ�
--WHERE���� JOIN�� ��� ������ �����
--���� ON�� ������� ���� ON, WHERE�� ����� ����� ���ٸ� ON�� ����ϴ� ���� ����. (������ ����?)

--���� INNER JOIN(���� ����)
--OUTER JOIN(�ܺ�����) : �ΰ� �̻��� ���̺� �� ������ �����̶� �� ���� ���̺��� ��� �����Ͱ� �˻��Ǿ�� �� �� ���
--LEFT / RIGHT / FULL OUTER JOIN�� �� ������ ����
--���������� ��� ��µǰ� �ϱ�
SELECT s.NAME �л��̸�, p.PROFNO "�������� ��ȣ", p.NAME "�������� �̸�"
FROM T_STUDENT s LEFT OUTER JOIN T_PROFESSOR p -- �̷��� ���� �� T_STUDENT�� �����̰� ������ ���(����) �л�(����)�� ��µǰ� �ؾ��ؼ� LEFT OUTER.
ON s.PROFNO = p.PROFNO;

--����� �̸�, ����� �ڵ�, �¼� ��, Ȩ ����
SELECT * FROM STADIUM;
SELECT * FROM TEAM;
SELECT s.STADIUM_NAME "����� �̸�", s.STADIUM_ID "����� �ڵ�", s.SEAT_COUNT "�¼� ��", NVL(t.TEAM_NAME, 'Ȩ �� ����') "Ȩ ����"
FROM STADIUM s
	LEFT OUTER JOIN TEAM t ON s.HOMETEAM_ID = t.TEAM_ID;

--SELF JOIN
--�����, �Ŵ�����
SELECT * FROM EMP;
SELECT e1.ENAME, e2.ENAME
FROM EMP e1, EMP e2
WHERE e1.MGR = e2.EMPNO;

--T_DEPT2
--�μ���� �� �����μ���
SELECT * FROM T_DEPT2;
SELECT t1.DNAME �μ���, NVL(t2.DNAME, '�ֻ��� �μ�') �����μ���
FROM T_DEPT2 t1 LEFT OUTER JOIN T_DEPT2 t2 ON t1.PDEPT = t2.DCODE;

--T_PROFESSOR
--������ȣ, �����̸�, �Ի���, �ڽź��� �Ի����� ���� ����� �ο� ��
SELECT * FROM T_PROFESSOR;
SELECT p1.PROFNO ������ȣ, p1.NAME �̸�, p1.HIREDATE �Ի���, COUNT(p2.PROFNO) "���� ��"
FROM T_PROFESSOR p1 LEFT OUTER JOIN T_PROFESSOR p2 ON p1.HIREDATE > p2.HIREDATE
GROUP BY p1.PROFNO, p1.NAME, p1.HIREDATE;

--SUB_QUERY
--WHERE��
SELECT * FROM PLAYER
WHERE HEIGHT > (SELECT AVG(HEIGHT) FROM PLAYER);

--FROM��
--PLAYER TABLE���� TEAM_ID�� 'K01'�� ���� �� POSITION�� 'GK'�� ����
SELECT * FROM PLAYER WHERE TEAM_ID='K01';
SELECT *
FROM
	(SELECT * FROM PLAYER WHERE TEAM_ID='K01')
WHERE "POSITION"='GK';

--SELECT��
--�÷��̾� �̸�, Ű, ��� Ű ���
SELECT
	PLAYER_NAME,
	HEIGHT,
	(SELECT AVG(HEIGHT) FROM PLAYER) "��� Ű" --���⼭ AVG(HEIGHT)�� �׳� ���� �Ǹ� GROUP���� ������� �ϴµ� �����ָ� �� �� �� �� ���� ������ ����� ���Ƿ� �߸��� ���� ����.
FROM PLAYER;

--PLAYER TABLE���� ������ �� ��� Ű�� ��ü ��� Ű �˻�
--��ü ��� Ű
SELECT AVG(HEIGHT) FROM PLAYER;
--������ �� ��� Ű
SELECT AVG(HEIGHT) FROM PLAYER GROUP BY "POSITION";

SELECT
	"POSITION",
	(SELECT AVG(HEIGHT) FROM PLAYER) "��ü ��� Ű",
	AVG(HEIGHT) "������ �� ��� Ű"
FROM PLAYER
GROUP BY "POSITION";

--�������� ���� ���� �غ���
SELECT
	(SELECT AVG(HEIGHT) FROM PLAYER WHERE "POSITION"='GK') GK���Ű,
	(SELECT AVG(HEIGHT) FROM PLAYER WHERE "POSITION"='DF') DF���Ű,
	(SELECT AVG(HEIGHT) FROM PLAYER WHERE "POSITION"='FW') FW���Ű,
	(SELECT AVG(HEIGHT) FROM PLAYER WHERE "POSITION"='MF') MF���Ű,
	(SELECT AVG(HEIGHT) FROM PLAYER) ��ü���Ű
FROM DUAL;
--DUAL : �� ��¥�� ����� ���� ���� ���̺�

--�� ���� �ؼ� Ȯ�� �� ROLLBACK������

--PLAYER TABLE���� NICKNAME�� NULL�� �������� ���¹� ������ �г������� �ٲٱ�
SELECT * FROM PLAYER;
UPDATE PLAYER
SET NICKNAME = (SELECT NICKNAME FROM PLAYER WHERE PLAYER_NAME = '���¹�')
WHERE NICKNAME IS NULL;

--EMPLOYEES TABLE���� ��ձ޿����� �� ���� �޿��� �޴� ������� 10% �޿� �λ��Ű��
SELECT * FROM EMPLOYEES ORDER BY SALARY;
SELECT AVG(SALARY) FROM EMPLOYEES;
UPDATE EMPLOYEES
SET SALARY = SALARY + SALARY * 0.1
WHERE SALARY < (SELECT AVG(SALARY) FROM EMPLOYEES);

--PLAYER TABLE���� ��� Ű���� ū ������ ����
SELECT * FROM PLAYER ORDER BY HEIGHT;
SELECT AVG(HEIGHT) FROM PLAYER;
DELETE FROM PLAYER
WHERE HEIGHT > (SELECT AVG(HEIGHT) FROM PLAYER);

--������ ������ �Ҽӵ� ���� ������ �˻�


--EMP, DEPT
--�̸��� L�� �ִ� ������� �μ���� LOC �˻�


--JOBS, EMPLOYEES
--JOB_TITLE�� 'Manager'��� ���ڿ��� ���Ե� �������� ��� ������ JOB_TITLE���� �˻�


--�౸������ �߿��� �� ������ Ű�� ���� ū ������ �˻�


--SCHEDULE, STADIUM
--����� �� ��� ������ 20120501~20120503 ���̿� �ִ� ����� �˻�


--T_PROFESSOR���� �迵�� ������, �迵�� �������� �Ի����� ������ �޿��� ���� �������� PROFNO, NAME, PAY �˻�





















