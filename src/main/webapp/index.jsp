<%--
  Created by IntelliJ IDEA.
  User: Thinkpad
  Date: 13/08/2021
  Time: 9:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
    <style>
       form{
         background-color: burlywood;
       }
    </style>
  </head>
  <body>
  <h3>CACULATOR</h3>
  <form action="/calculator" method="post">
    <label> First Operand: </label>
    <input type="text" name="firstoperand" placeholder="FirstOperand"/><br>
    <select name="operator">
      <option value="+">+</option>
      <option value="-">-</option>
      <option value="*">*</option>
      <option value="/">/</option>
    </select><br>
    <label>Second Operand</label>
    <input type="text" name="secondoperand" placeholder="SecondOperand"/><br>
    <input type="submit" value="calculator">
  </form>

  </body>
</html>
