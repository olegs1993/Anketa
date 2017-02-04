<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Oleg
  Date: 03.02.2017
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>


  </head>
  <body>

  <div class="anketa">
    <form method="post" action="${pageContext.request.contextPath}/main" class="data">
<div class="name">
  <label>name:</label><br/>
  <input type="text" name="name"><br/>
</div>
    <div class="surname">
      <label>surename</label><br/>
      <input type="text" name="surname"><br/>
    </div>
    <div class="java">
      <label>Do you like java?</label><br/>
      <input type="radio" name="java" value="yes" placeholder="yes">
      <input type="radio" name="java" value="no" placeholder="no"><br/>
    </div>
    <div class="python">
      <label>Do you like Python?</label><br/>
      <input type="radio" name="python" value="yes" placeholder="yes">
      <input type="radio" name="python" value="no" placeholder="no"><br/>
    </div>
      <input type="submit"  class="send">
      </form>
  </div>

  </body>
</html>
