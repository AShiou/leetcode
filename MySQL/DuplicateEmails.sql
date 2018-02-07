/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  AShiou
 * 182.Duplicate Emails    
 */
SELECT Email 
FROM Person
GROUP BY Email
HAVING count(Email)>1