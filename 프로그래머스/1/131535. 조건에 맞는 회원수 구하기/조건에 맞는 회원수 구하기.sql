-- 코드를 입력하세요
SELECT count(*) from USER_INFO where TO_CHAR(JOINED,'YYYY')='2021' AND AGE >=20 AND AGE<=29;