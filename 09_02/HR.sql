-- 4번 문제
SELECT 
        A.last_name 마지막이름, 
        NVL(C.LAST_NAME, '<없음>') 매니저이름,
        B.DEPARTMENT_NAME "부서 이름"
    FROM EMPLOYEES A , EMPLOYEES C , DEPARTMENTS B 
    WHERE A.department_id = B.department_id 
          AND B.location_id IN ((SELECT 
                                LOCATION_ID
                                FROM LOCATIONS
                                WHERE CITY = 'Seattle'))
          AND C.EMPLOYEE_ID(+) = A.MANAGER_ID
    ORDER BY A.LAST_NAME;
-- 5번 문제
SELECT 
         A.LAST_NAME 사원이름,
         B.부서이름,
         B.급여
FROM     EMPLOYEES A , (SELECT 
                                B.DEPARTMENT_NAME 부서이름,
                                MIN(A.SALARY) 급여
                           FROM EMPLOYEES A, DEPARTMENTS B
                          WHERE A.DEPARTMENT_ID = B.DEPARTMENT_ID
                       GROUP BY B.DEPARTMENT_NAME) B
WHERE    A.SALARY = B.급여
ORDER BY 부서이름, 사원이름;
                                                                                                            SELECT  department_id ,
                                                                                                                    DEPARTMENT_NAME,
                                                                                                                    location_id,
                                                                                                                    manager_id
                                                                                                                FROM DEPARTMENTS;-- 부서                  
    
SELECT
    c.city 도시이름
--    AVG(a.salary)
    FROM employees A,departments B,locations C
    WHERE   A.EMPLOYEE_ID = B.DEPARTMENT_ID
    GROUP BY C.CITY;
                                                                                SELECT
                                                                                    c.city 도시이름,
                                                                                --    AVG(a.salary)
                                                                                    A.LAST_NAME
                                                                                    
                                                                                    FROM employees A,departments B,locations C
                                                                                    WHERE   A.EMPLOYEE_ID = B.DEPARTMENT_ID
                                                                                            AND B.LOCATION_ID = C.LOCATION_ID;
                                                                                    
    

SELECT 
    A.city 도시이름,
    COUNT(C.DEPARTMENT_ID)
    FROM locations A, departments B, EMPLOYEES C
    WHERE b.MANAGER_ID IS NOT NULL 
        AND a.location_id=b.location_id
    GROUP BY a.city;