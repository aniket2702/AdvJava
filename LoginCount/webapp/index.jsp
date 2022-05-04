<%@ page import = "java.io.*,java.util.*" %>

<html>
   <head>
      <title>Application object in JSP</title>
   </head>
   
   <body>
  <h3> Login here </h3>
<form action="user_login.jsp" method="post">
<table style="width: 20%">
                 <tr>
                 <td>UserName</td>
                                    <td><input type="text" name="username" /></td>
                         </tr>
                                    <tr>
                                    <td>Password</td>
                                    <td><input type="password" name="password" /></td>
                           </tr>
                 </table>
                 <input type="submit" value="Login" /></form>

   
   </body>
</html>