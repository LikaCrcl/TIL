CREATE TABLE CUSTOMER(
	ID VARCHAR2(300) PRIMARY KEY,
	NAME VARCHAR2(300),
	ADDR VARCHAR2(1000)
);

CREATE TABLE ANIMAL(
	NUM CHAR(4),
	COLOR VARCHAR2(100),
	"TYPE" VARCHAR2(100),
	AGE NUMBER(2),
	NAME VARCHAR2(300),
	ID VARCHAR2(100),
	CONSTRAINT ANIMAL_CUSTOMER_FK FOREIGN KEY(ID) REFERENCES CUSTOMER(ID)
);

DROP TABLE CUSTOMER;
DROP TABLE ANIMAL;
--DML
--INSERT
INSERT INTO CUSTOMER
VALUES('id2357', '���ټ�', '����� ������ ���ﵿ');

INSERT INTO CUSTOMER (ID, NAME) --�κи� �߰��ϰ������� �̷��� �߰��ϰ����� �κ��� �����ָ� ��
VALUES('apple', '������');

INSERT INTO CUSTOMER
VALUES('banana', '��ä��', '����� ������ ������');

INSERT INTO CUSTOMER
VALUES('cherry', '������', '��⵵ �ϳ��� ������');

INSERT INTO CUSTOMER
VALUES('durian', '���', '����� ���Ǳ� �Ÿ���');

INSERT INTO ANIMAL
VALUES('C001', 'ġ���', '������', 3, '����', 'id2357');

INSERT INTO ANIMAL
VALUES('D001', '�Ͼ��', '������', 5, '�ǻ�', 'id2357');

INSERT INTO ANIMAL
VALUES('C002', 'ȸ��', '������', 3, '�ÿ���', 'apple');

INSERT INTO ANIMAL
VALUES('D002', '������', '������', 7, '�ں�', 'banana');

INSERT INTO ANIMAL
VALUES('C003', 'ȸ��', '������', 1, '����', 'cherry');

INSERT INTO ANIMAL
VALUES('E001', '�ʷϻ�', '�Ǿ�', 10, '������', 'durian');

--�˻�
SELECT * FROM ANIMAL; --ANIMAL ���̺����� *(��� ��)�� �˻�

DELETE FROM ANIMAL
WHERE ID='id2357'; --������ �� �ڽ� ���� �����ؾ� ��. �� �� ���� CUSTOMER���� �����Ϸ� ��� ������

DELETE FROM CUSTOMER
WHERE ID='id2357';

--UPDATE
UPDATE CUSTOMER
SET ADDR='����� ������ ������'
WHERE ID='apple';

SELECT * FROM CUSTOMER;

--SELECT
SELECT * FROM ANIMAL;

SELECT * FROM ANIMAL
WHERE "TYPE" = '������'; --TYPE�� �������� ��� ������ �˻�

SELECT NUM, NAME FROM ANIMAL
WHERE "TYPE" = '������'; --TYPE�� �������� NUM, NAME ������ �˻�
--------------------------------------------------------------
SELECT * FROM PLAYER;
SELECT * FROM TEAM;
SELECT * FROM SCHEDULE;
SELECT * FROM STADIUM;

SELECT * FROM DEPARTMENTS;
SELECT * FROM EMPLOYEES;
SELECT * FROM LOCATIONS;
SELECT * FROM SALGRADE;
SELECT * FROM EMP;
SELECT * FROM JOBS;

--PLAYER ���̺����� TEAM_ID�� K01 �� ���� �˻�
SELECT * FROM PLAYER WHERE TEAM_ID='K01';

--TEAM_ID�� K01�� �ƴ� ���� �˻�
SELECT * FROM PLAYER WHERE TEAM_ID!='K01';

--WEIGHT�� 70�̻�, 80������ ���� �˻�
SELECT * FROM PLAYER WHERE WEIGHT>=70 AND WEIGHT<=80;
--BETWEEN A AND B : A �̻� B ����(���� ����)
SELECT * FROM PLAYER WHERE WEIGHT BETWEEN 70 AND 80;

--BETWEEN�� ����� �� �����ִ� �� ����
SELECT * FROM PLAYER WHERE (WEIGHT BETWEEN 70 AND 80) AND WEIGHT != 75;

--TEAM_ID�� K03�̰� HEIGHT�� 180 �̸��� ���� �˻�
SELECT * FROM PLAYER WHERE TEAM_ID='K03' AND HEIGHT<180;

--TEAM_ID : K06, NICKNAME : ����
SELECT * FROM PLAYER WHERE TEAM_ID = 'K06' AND NICKNAME = '����';

--HEIGHT >= 170, WEIGHT >= 80 �� ���� �̸� �˻�
SELECT PLAYER_NAME FROM PLAYER WHERE HEIGHT >= 170 AND WEIGHT >= 80;

--STADIUM ���̺����� �¼� ���� 30000 �ʰ� 41000������ ����� �˻�
SELECT * FROM STADIUM WHERE SEAT_COUNT > 30000 AND SEAT_COUNT <= 41000;

--PLAYER���̺����� TEAM_ID�� K02�̰ų� K07�̰� �������� MF�� ���� �˻�
SELECT * FROM PLAYER WHERE (TEAM_ID = 'K02' OR TEAM_ID = 'K07') AND "POSITION" = 'MF'; --AND�� OR���� �켱������ ����. ���� ��ȣ�� ������� ��.

SELECT * FROM ANIMAL;

INSERT INTO CUSTOMER
VALUES('eggplant', '�ѹ���', '��󳲵� ���ؽ�');

SELECT * FROM CUSTOMER;

--PLAYER TABLE���� TEAM_ID�� K01�� ���� �̸��� �� �̸����� �ٲٱ�
SELECT PLAYER_NAME FROM PLAYER WHERE TEAM_ID = 'K01';
UPDATE PLAYER
SET PLAYER_NAME = '������'
WHERE TEAM_ID = 'K01';


--PLAYER TABLE���� POSITION�� MF�� ���� ����
DELETE FROM PLAYER
WHERE "POSITION" = 'MF';
SELECT * FROM PLAYER WHERE "POSITION" = 'MF';

--PLAYER TABLE���� HEIGHT 180�̻��� ���� ����
DELETE FROM PLAYER
WHERE HEIGHT >= 180;
SELECT * FROM PLAYER WHERE HEIGHT >= 180;

--PLAYER TABLE���� NICKNAME�� ����ִ� ������ NICKNAME�� ������ �������� �ٲٱ�
UPDATE PLAYER
SET NICKNAME = '������'
WHERE NICKNAME IS NULL;
SELECT * FROM PLAYER;














