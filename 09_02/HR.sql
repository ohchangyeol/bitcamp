-- 4�� ����
SELECT 
        A.last_name �������̸�, 
        NVL(C.LAST_NAME, '<����>') �Ŵ����̸�,
        B.DEPARTMENT_NAME "�μ� �̸�"
    FROM EMPLOYEES A , EMPLOYEES C , DEPARTMENTS B 
    WHERE A.department_id = B.department_id 
          AND B.location_id IN ((SELECT 
                                LOCATION_ID
                                FROM LOCATIONS
                                WHERE CITY = 'Seattle'))
          AND C.EMPLOYEE_ID(+) = A.MANAGER_ID
    ORDER BY A.LAST_NAME;
-- 5�� ����
SELECT 
         A.LAST_NAME ����̸�,
         B.�μ��̸�,
         B.�޿�
FROM     EMPLOYEES A , (SELECT 
                                B.DEPARTMENT_NAME �μ��̸�,
                                MIN(A.SALARY) �޿�
                           FROM EMPLOYEES A, DEPARTMENTS B
                          WHERE A.DEPARTMENT_ID = B.DEPARTMENT_ID
                       GROUP BY B.DEPARTMENT_NAME) B
WHERE    A.SALARY = B.�޿�
ORDER BY �μ��̸�, ����̸�;
                                                                                                            SELECT  department_id ,
                                                                                                                    DEPARTMENT_NAME,
                                                                                                                    location_id,
                                                                                                                    manager_id
                                                                                                                FROM DEPARTMENTS;-- �μ�                  
    
SELECT
    c.city �����̸�
--    AVG(a.salary)
    FROM employees A,departments B,locations C
    WHERE   A.EMPLOYEE_ID = B.DEPARTMENT_ID
    GROUP BY C.CITY;
                                                                                SELECT
                                                                                    c.city �����̸�,
                                                                                --    AVG(a.salary)
                                                                                    A.LAST_NAME
                                                                                    
                                                                                    FROM employees A,departments B,locations C
                                                                                    WHERE   A.EMPLOYEE_ID = B.DEPARTMENT_ID
                                                                                            AND B.LOCATION_ID = C.LOCATION_ID;
                                                                                    
    

SELECT 
    A.city �����̸�,
    COUNT(C.DEPARTMENT_ID)
    FROM locations A, departments B, EMPLOYEES C
    WHERE b.MANAGER_ID IS NOT NULL 
        AND a.location_id=b.location_id
    GROUP BY a.city;